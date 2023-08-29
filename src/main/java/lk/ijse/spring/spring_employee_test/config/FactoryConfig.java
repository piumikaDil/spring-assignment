package lk.ijse.spring.spring_employee_test.config;

import lk.ijse.spring.spring_employee_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfig {
    private static FactoryConfig factoryConfiguration;

    private final SessionFactory sessionFactory;

    private FactoryConfig() {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(Employee.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfig getFactoryConfiguration() {

        return factoryConfiguration == null ? factoryConfiguration = new FactoryConfig() : factoryConfiguration;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}