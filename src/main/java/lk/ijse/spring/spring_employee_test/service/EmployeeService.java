package lk.ijse.spring.spring_employee_test.service;

import lk.ijse.spring.spring_employee_test.config.FactoryConfig;
import lk.ijse.spring.spring_employee_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeService {
    public static boolean saveEmployee(Employee employee){
        Session session = FactoryConfig.getFactoryConfiguration().getSession();
        Transaction transaction = session.getTransaction();

        transaction.begin();
        session.save(employee);
        transaction.commit();
        return true;
    }
}
