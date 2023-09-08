package classes;

public class People extends Animal{
    private String cpf;

    public People(String name, int age, int height, float weight, String cpf) {
        super(name, age, height, weight);
        this.cpf = cpf;
    }

    public People() {
    }

    public People(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}