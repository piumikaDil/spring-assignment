package lk.ijse.spring.spring_employee_test.api;

import lk.ijse.spring.spring_employee_test.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi/employee")
public class EmployeeController {
    @PostMapping
    void employee(@RequestBody EmployeeDTO employeeDTO){
        System.out.println(employeeDTO);
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
