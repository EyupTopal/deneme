package Employee;

public class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public void showInnfos(){
        System.out.println ("Bilgiler");
        System.out.println ("isim = "+ this.name);
        System.out.println ("department= "+ this.department);
        System.out.println ("salary= "+ this.salary);
    }
}
