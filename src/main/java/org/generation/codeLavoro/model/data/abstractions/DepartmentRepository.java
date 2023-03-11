package org.generation.codeLavoro.model.data.abstractions;

import org.generation.codeLavoro.model.data.exeptions.DataException;
import org.generation.codeLavoro.model.data.exeptions.EntityNotFoundException;
import org.generation.codeLavoro.model.entities.Department;

import java.util.List;

public interface DepartmentRepository {
    // Un metodo per inserire un nuovo dipartimento
    void insertNewDepartment(Department department) throws DataException;
    // Un metodo per cancellare un dato dipartimento con un certo id
    void deleteById(Long id) throws EntityNotFoundException,DataException;
    //    c. Un metodo che mi da tutti i dipartimenti che contengono una data stringa nel nome,
    //*       ma quest'ultimo deve anche caricare tutti gli impiegati che ci lavorano
    List<Department> findByNameContains(String part) throws DataException;

}
