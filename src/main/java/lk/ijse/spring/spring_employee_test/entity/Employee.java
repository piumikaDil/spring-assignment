package lk.ijse.spring.spring_employee_test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    @Id
    private String empId;
    private  String name;
    private String email;
    private String dep;
    private  byte[] profile;
}
