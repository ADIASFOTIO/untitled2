package org.generation.codeLavoro.model.data.implementations;

import org.generation.codeLavoro.model.data.abstractions.DepartmentRepository;
import org.generation.codeLavoro.model.data.exeptions.DataException;
import org.generation.codeLavoro.model.data.exeptions.EntityNotFoundException;
import org.generation.codeLavoro.model.entities.Department;
import org.generation.codeLavoro.model.entities.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static org.generation.codeLavoro.model.data.services.JDBCConstants.*;

public class JDBCDepartmentRepository implements DepartmentRepository {
    private Connection con;

    public JDBCDepartmentRepository(Connection con) {
        this.con = con;
    }

    @Override
    public void insertNewDepartment(Department department) throws DataException {
        try (
                PreparedStatement st = con.prepareStatement(INSERT_NEW_DEPARTMENT_RETURNING_ID);
        ) {
            st.setString(1, department.getName());
            st.setInt(2, department.getMaxCapacity());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataException("errore nell'inserimento del department", e);
        }
    }

    @Override
    public void deleteById(Long id) throws EntityNotFoundException, DataException {
        try (
                PreparedStatement st = con.prepareStatement(DELETE_DEPARTMENT_BY_ID);
        ) {
            st.setLong(1, id);
            int numLines = st.executeUpdate();
            if (numLines != 1) {
                throw new EntityNotFoundException("Non e' stato trovato il department con quell'id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataException("errore nella lettura del department del Database", e);
        }
    }

    @Override
    public List<Department> findByNameContains(String part) throws DataException {
        List<Department> departmentListWithoutEmployees = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        try (
                PreparedStatement st = con.prepareStatement(FIND_BY_NAME_CONTAINS);
                PreparedStatement st1 = con.prepareStatement(FIND_BY_NAME_COUNTAINS2);
        ) {
            st.setString(1, "%" + part + "%");
            try (ResultSet rs = st.executeQuery()) {

                while (rs.next()) {
                    departmentListWithoutEmployees.add(databaseToDepartment(rs));
                }
            }
            Department[] a = (Department[]) departmentListWithoutEmployees.toArray();
            for (int i = 0; i < a.length; i++) {
                st1.setLong(1, a[i].getId());
                try (ResultSet rss = st.executeQuery()) {
                    while (rss.next()) {
                        employees.add();
                    }
                }
            }


        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataException("errore nella lettura dei corsi da database", e);
        }
        return null;

    }




    private Department databaseToDepartment(ResultSet rs) throws SQLException {
        try {
            return new Department(rs.getLong("dept_id"),
                    rs.getString("dept_name"),
                    rs.getInt("dept_max_capacity"));
        } catch (SQLException e) {
            throw new SQLException("errore nella lettura dei corsi da database", e);
        }
    }
    private Department databaseToEmployee(ResultSet rs) throws SQLException {
        try {
            return new Employee(rs.getLong("emp_id"),
                    rs.getString("emp_name"),
                    rs.getDate("emp_date"),
                    rs.getLong("dept_

        } catch (SQLException e) {
            throw new SQLException("errore nella lettura dei corsi da database", e);
        }
    }

}