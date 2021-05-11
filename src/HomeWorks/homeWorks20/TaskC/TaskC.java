package HomeWorks.homeWorks20.TaskC;


import java.util.Arrays;

class TaskC {
    public static void main(String[] args) {
        Human[] mans = new Human[6];
        Security[] secr = new Security[0];
        for(int i =0; i < mans.length; i++){
            mans[i] = new Human();
            Employee employee = new Employee(mans[i]);
            System.out.print(employee);
            employee.actions();
            System.out.println();
            if(employee.getPosition().equals("Охраник")){
                secr = Arrays.copyOf(secr, secr.length + 1);
//                secr[secr.length - 1] = new Security();
            }
        }

    }
}
