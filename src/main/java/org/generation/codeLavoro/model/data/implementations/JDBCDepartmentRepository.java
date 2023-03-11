package org.generation.codeLavoro.model.data.implementations;

import org.generation.codeLavoro.model.data.abstractions.DepartmentRepository;
import org.generation.codeLavoro.model.data.exeptions.DataException;
import org.generation.codeLavoro.model.data.exeptions.EntityNotFoundException;
import org.generation.codeLavoro.model.entities.Department;

import java.sql.Connection;
import java.util.List;

public class JDBCDepartmentRepository implements DepartmentRepository {
    private Connection con;
    public JDBCDepartmentRepository(Connection con){
        this.con = con;
    }
    @Override
    public void insertNewDepartment(Department department) throws DataException {

    }

    @Override
    public void deleteById(Long id) throws EntityNotFoundException, DataException {

    }

    @Override
    public List<Department> findByNameContains(String part) throws DataException {
        return null;
    }
}
