package lk.ijse.spring.spring_employee_test.api;

import lk.ijse.spring.spring_employee_test.dto.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi/employee")
public class EmployeeController {
    @PostMapping
    void employee(@RequestBody Employee employee){
        System.out.println(employee);
    }

    @DeleteMapping
    void deleteEmployee(@PathVariable String id){
        System.out.println(id);
    }

    @PutMapping
    void updateEmployee(@PathVariable String id, @RequestBody Employee employee){
        System.out.println(id);
        System.out.println(employee);
    }

    @GetMapping
    List<Employee> getAllEmployees(){
        return null;
    }
}
