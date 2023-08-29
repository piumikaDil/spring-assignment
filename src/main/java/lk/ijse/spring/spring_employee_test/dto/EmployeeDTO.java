package lk.ijse.spring.spring_employee_test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
    private String empId;
    private  String name;
    private String email;
    private String dep;
    private  byte[] profile;

    public EmployeeDTO(String empId, String name, String email, String dep) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.dep = dep;
    }

}
