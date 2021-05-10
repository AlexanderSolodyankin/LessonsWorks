package HomeWorks.homeWorks20.TaskC;



public class TaskC {
    public static void main(String[] args) {
        Human[] mans = new Human[6];
        for(int i =0; i < mans.length; i++){
            mans[i] = new Human();
            Employee employee = new Employee(mans[i]);
            System.out.print(employee);
            employee.actions();
            System.out.println();
        }

    }
}
