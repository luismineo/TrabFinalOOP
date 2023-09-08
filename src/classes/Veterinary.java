package classes;

public class Veterinary extends Employee{
    private int crmv;

    public Veterinary(String name, int age, int height, int weight, String cpf, float salary, int crmv) {
        super(name, age, height, weight, cpf, salary);
        this.crmv = crmv;
    }

    public Veterinary() {
    }

    public Veterinary(int crmv) {
        this.crmv = crmv;
    }

    public Veterinary(float salary, int crmv) {
        super(salary);
        this.crmv = crmv;
    }

    public Veterinary(String cpf, float salary, int crmv) {
        super(cpf, salary);
        this.crmv = crmv;
    }

    public int getCrmv() {
        return crmv;
    }

    public void setCrmv(int crmv) {
        this.crmv = crmv;
    }
}
