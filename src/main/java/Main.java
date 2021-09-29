import entity.User;
import org.hibernate.Session;
import util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(30);
        user.setName("Alexander");
        user.setLogin("Ker Tak");
        user.setPassword("7809");

        seveEntit(user);



    }

    public static <T> void seveEntit(T entiti){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(entiti);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Успех!!! " + entiti.toString());
    }

//    public static List<Employee> readAll(){
//        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
//        //@SuppressWarnings("unchecked")
//        List<Employee> employees = hibernateSession.createQuery("FROM Employee").list();
//        hibernateSession.close();
//        System.out.println("Найденно " + employees.size() + " Сотрудников");
//        return employees;
//    }
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
