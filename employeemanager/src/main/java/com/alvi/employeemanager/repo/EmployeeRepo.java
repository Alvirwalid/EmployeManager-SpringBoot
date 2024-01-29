package com.alvi.employeemanager.repo;

import com.alvi.employeemanager.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {



    void deleteEmployeeById(Long id);

   Optional<Employee>findEmployeeById(Long id);
}
