import entity.Employee;
import entity.EmployeeAddress;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//
        EmployeeAddress employeeAddress = new EmployeeAddress();
        employeeAddress.setAddress("Ахунбаева");
       Employee employee = Employee.builder().name("Alexander").age(30).build();
       employee.setEmployeeAddress(employeeAddress);
//       Employee employee2 = Employee.builder().name("Alex").age(30).build();
//       Employee employee3 = Employee.builder().name("Alina").age(30).build();
//       Employee employee4 = Employee.builder().name("Kuvat").age(30).build();
//       Employee employee5 = Employee.builder().name("Xander").age(30).build();
//       Employee employee6 = Employee.builder().name("Liza").age(30).build();

//       Long num;
//
          create(employee);
//       num = create(employee2);
//       num = create(employee3);
//       num = create(employee4);
//       num = create(employee5);
//       num = create(employee6);

//               employee2.setId(3L);
//               employee2.setName("Updeite");
//
////        List<Employee> listEmploye = readAll();
////        System.out.println(listEmploye);
//
////        update(employee2);
//
////        System.out.println(delete(3L));
//        deletAll();
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
        //@SuppressWarnings("unchecked")
        List<Employee> employees = hibernateSession.createQuery("FROM Employee").list();
        hibernateSession.close();
        System.out.println("Найденно " + employees.size() + " Сотрудников");
        return employees;
    }

    public static void update(Employee e){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Employee em = session.load(Employee.class, e.getId());
        em.setName(e.getName());
        em.setAge(e.getAge());
        session.getTransaction().commit();
        session.close();
        System.out.println("Успех!! " + e.toString());

    }
    public static Employee findById(Long id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Employee e = session.load(Employee.class, id);
        session.close();
        return e;
    }

    public static Employee delete(Long id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Employee e = findById(id);
        session.delete(e);
        session.getTransaction().commit();
        session.close();
        System.out.println("Успех");
        return e;
    }
    public static void deletAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Employee");
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Успешное очищение БД");
    }
}
