package org.generation.codeLavoro.model.data.services;

public class JDBCConstants {
    public static final String URL = "jdbc:postgresql://localhost:5432/lavoroTest";
    public static final String USER_NAME = "postgresMaster";
    public static final String PASSWORD = "goPostgresGo";
    public static final String FIND_BY_NAME_CONTAINS = """
            SELECT dept_id,dept_name,dept_max_capacity
            FROM department
            WHERE dept_name like ?
            """;
    public static final String FIND_BY_NAME_COUNTAINS2 = """
            SELECT*
            FROM employee AS e JOIN department AS d
            USING(dept_id)
            WHERE dept_id = ? 
            """;
    public static final String DELETE_DEPARTMENT_BY_ID = """
               DELETE FROM department
               WHERE dept_id = ?
            """;
    public static final String INSERT_NEW_DEPARTMENT_RETURNING_ID = """
            INSERT INTO department(dept_id, dept_name, dept_max_capacity)
            VALUES(nextval('department_sequence'),?, ?)
            RETURNING dept_id;
            """;






}
