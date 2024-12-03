package Clase_02;

public class Main {

    public static void main(String[] args) {
        Employee empleado1 = new Employee("Kevin", 1123, 1300000.0);
        System.out.println(empleado1.toString());

        empleado1.increaseSalary(12);

        System.out.println(empleado1.toString());

        empleado1.setSalary(0);

        System.out.println(empleado1.toString());

}

} 