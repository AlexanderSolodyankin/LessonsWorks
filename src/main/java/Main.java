import entity.Employee;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//
//       Employee employee = Employee.builder().name("Alexander").age(30).build();
//       Employee employee2 = Employee.builder().name("Alex").age(30).build();
//       Long num;
//
//       num = create(employee);
//        System.out.println(num);
//       num = create(employee2);
//        System.out.println(num);

        List<Employee> listEmploye = readAll();
        System.out.println(listEmploye);





    }

    public static Long create(Employee e){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(e);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Успех!!! " + e.toString());
        return e.getId();
    }

    public static List<Employee> readAll(){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();

        List<Employee> employees = hibernateSession.createQuery("FROM Employee").list();
        hibernateSession.close();
        System.out.println("Найденно " + employees.size() + " Сотрудников");
        return employees;
    }
}
