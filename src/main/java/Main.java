import entity.Employee;
import entity.User;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee user1 = Employee.builder().name("Alexander").age(34).build();
        Employee user2 = Employee.builder().name("Daniel").age(34).build();
        Employee user3 = Employee.builder().name("Vova").age(34).build();
        Employee user4 = Employee.builder().name("Ohra").age(34).build();
        Employee user5 = Employee.builder().name("Alexander").age(54).build();


        seveEntit(user1);
        seveEntit(user2);
        seveEntit(user3);
        seveEntit(user4);
        seveEntit(user5);

        List<Employee> list = readAllWhereName();


        System.out.println(list);



    }

    public static <T> void seveEntit(T entiti){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(entiti);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Успех!!! " + entiti.toString());
    }

    public static List<Employee> readAll(){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        //@SuppressWarnings("unchecked")
        List<Employee> employees = hibernateSession.createQuery("FROM Employee").list();
        hibernateSession.close();
        System.out.println("Найденно " + employees.size() + " Сотрудников");
        return employees;
    }
    public static List<Employee> readAllWhere(){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        //@SuppressWarnings("unchecked")
        List<Employee> employees = hibernateSession.createQuery("FROM Employee where name = : pname",Employee.class).
        setParameter("pname", "Alexander").list();
        hibernateSession.close();
        System.out.println("Найденно " + employees.size() + " Сотрудников");
        return employees;
    }
    public static List<Employee> readAllWhereName(){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        //@SuppressWarnings("unchecked")
        List<Employee> employees = hibernateSession.createQuery("FROM Employee where name like :pname",Employee.class).
                setParameter("pname", "D%").list();
        hibernateSession.close();
        System.out.println("Найденно " + employees.size() + " Сотрудников");
        return employees;
    }
//
//    public static void update(Employee e){
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        Employee em = session.load(Employee.class, e.getId());
//        em.setName(e.getName());
//        em.setAge(e.getAge());
//        session.getTransaction().commit();
//        session.close();
//        System.out.println("Успех!! " + e.toString());
//
//    }
//    public static Employee findById(Long id){
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Employee e = session.load(Employee.class, id);
//        session.close();
//        return e;
//    }
//
//    public static Employee delete(Long id){
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        Employee e = findById(id);
//        session.delete(e);
//        session.getTransaction().commit();
//        session.close();
//        System.out.println("Успех");
//        return e;
//    }
//    public static void deletAll(){
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        Query query = session.createQuery("DELETE FROM Employee");
//        query.executeUpdate();
//        session.getTransaction().commit();
//        session.close();
//        System.out.println("Успешное очищение БД");
//    }
}
