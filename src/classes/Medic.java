package classes;

public class Medic extends Employee{
    private int crm;

    public Medic(String name, int age, int height, float weight, String cpf, float salary, int crm) {
        super(name, age, height, weight, cpf, salary);
        this.crm = crm;
    }

    public Medic() {
    }

    public Medic(int crm) {
        this.crm = crm;
    }

    public Medic(float salary, int crm) {
        super(salary);
        this.crm = crm;
    }

    public Medic(String cpf, float salary, int crm) {
        super(cpf, salary);
        this.crm = crm;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }
}
