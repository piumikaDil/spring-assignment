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

    public static boolean deleteEmployee(String id){
        if (id!=null){
            Session session = FactoryConfig.getFactoryConfiguration().getSession();
            Transaction transaction = session.getTransaction();

            transaction.begin();
            Employee emp = session.load(Employee.class, id);
            session.delete(emp);
            transaction.commit();
            return true;
        }
        return false;

    }

}
