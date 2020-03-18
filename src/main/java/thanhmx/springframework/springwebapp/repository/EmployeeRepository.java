package thanhmx.springframework.springwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thanhmx.springframework.springwebapp.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}