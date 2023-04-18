package HW_6;

import java.util.Objects;

public class Employee {
    private int age;
    private String firstName;
    private String lastName;
    private double salary;
    private boolean status;

    public Employee(int age, String firstName, String lastName, double salary, boolean status) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.status = status;
    }
    public Employee(int age, String firstName, String lastName, boolean status) {
        this(age, firstName, lastName, 50.0, status);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee employee) {
            return firstName.equals(employee.firstName)&&lastName.equals(employee.lastName)&&age==(employee.age);
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName,age);
    }
    @Override
    public String toString() {
        return "Employee [" + getInfo()+"  семейное положение: "+ getStatus()+"]";
    }

    public String getInfo(){
        return firstName + " " + lastName + " age: "+age;
    }
    public String getStatus(){
        if (status==true){
            return "женат/замужем";
        }
        return "холост/не замужем";
    }

    public boolean olderThan(Employee e){
        if (this.age>e.age){
            return true;
        }
        return false;
    }
    void upgrade(double salary){
        this.salary+=salary;
    }
    public Double getSalary(){
        return salary;
    }

}
