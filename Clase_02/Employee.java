package Clase_02;

public class Employee {


    private String name;
    private int id;
    private double salary;


    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
    if (salary > 0){       
        this.salary = salary;
    } else {
        System.out.println("El salario no puede ser menor a 0");
    }
    }
    public void increaseSalary(double porcentaje){
  
        salary += (salary * porcentaje / 100);
    }


    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
    }


    




}
