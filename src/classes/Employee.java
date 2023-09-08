package classes;

public class Employee extends People{
    private float salary;

    public Employee(String name, int age, int height, float weight, String cpf, float salary) {
        super(name, age, height, weight, cpf);
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(float salary) {
        this.salary = salary;
    }

    public Employee(String cpf, float salary) {
        super(cpf);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}