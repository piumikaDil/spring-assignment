package lk.ijse.spring.spring_employee_test.api;

import lk.ijse.spring.spring_employee_test.config.FactoryConfig;
import lk.ijse.spring.spring_employee_test.dto.EmployeeDTO;
import lk.ijse.spring.spring_employee_test.entity.Employee;
import lk.ijse.spring.spring_employee_test.service.EmployeeService;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
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


//    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//    String handleMultiPart(
//            @RequestPart String id,
//            @RequestPart String name,
//            @RequestPart String email,
//            @RequestPart String dep,
//            @RequestPart byte [] profile
//    ){
//        System.out.println(id);
//        System.out.println(name);
//        System.out.println(email);
//        System.out.println(dep);
//        String profileImg64= Base64.getEncoder().encodeToString(profile);
//        System.out.println(profileImg64);
//        return "Saved";
//    }

//    @PostMapping
//    public ResponseEntity<String> uploadImageAndDescription(
//            @RequestPart("file") MultipartFile file,
//            @RequestPart("description") String description) {
//        try {
//            byte[] imageData = file.getBytes();
//            System.out.println(imageData);
//            System.out.println(description);
////            imageService.saveImageAndDescription(imageData, description);
//            return ResponseEntity.ok("Image and description saved successfully.");
//        } catch (IOException e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving image and description.");
//        }
//    }


    @DeleteMapping
    void deleteEmployee(@RequestParam String id){
        EmployeeService.deleteEmployee(id);
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
