package lk.ijse.spring.spring_employee_test.api;

import lk.ijse.spring.spring_employee_test.config.FactoryConfig;
import lk.ijse.spring.spring_employee_test.dto.EmployeeDTO;
import lk.ijse.spring.spring_employee_test.entity.Employee;
import lk.ijse.spring.spring_employee_test.service.EmployeeService;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi/employee")
public class EmployeeController {
    @PostMapping
    void employee(@RequestBody EmployeeDTO employee){
        System.out.println(employee);

        Employee employee1 = new Employee(
                employee.getEmpId(),
                employee.getName(),
                employee.getEmail(),
                employee.getDep(),
                employee.getProfile()
        );

        EmployeeService.saveEmployee(employee1);

        }

    @DeleteMapping
    void deleteEmployee(@PathVariable String id){
        System.out.println(id);
    }

    @PutMapping
    void updateEmployee(@PathVariable String id, @RequestBody EmployeeDTO employeeDTO){
        System.out.println(id);
        System.out.println(employeeDTO);
    }

    @GetMapping
    List<EmployeeDTO> getAllEmployees(){
        return null;
    }
}
