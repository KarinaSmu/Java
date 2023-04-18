package HW_6;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee(50,"Pavel", "Ivanov",70.0,true);
        Employee employee2 = new Employee(50,"Pavel", "Ivanov",70.0,true);
        Employee employee3 = new Employee(20,"Ivan", "Petrov",false);

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employee1.hashCode() == employee2.hashCode());
        System.out.println("------------");
        System.out.println(employee1.getInfo());
        System.out.println(employee2.getInfo());
        System.out.println(employee3.getInfo());
        System.out.println(employee3.getSalary());
        employee3.upgrade(20.0);
        System.out.println(employee3.getSalary());
        System.out.println("------------");
        System.out.println(employee1.toString());
        System.out.println(employee1.getStatus());
        System.out.println(employee3.getStatus());
    }
}
