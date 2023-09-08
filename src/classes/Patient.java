package classes;

public class Patient extends People{
    private int registerNumber;
    private String conditionCid;

    public Patient(String name, int age, int height, float weight, String cpf, int registerNumber, String conditionCid) {
        super(name, age, height, weight, cpf);
        this.registerNumber = registerNumber;
        this.conditionCid = conditionCid;
    }

    public Patient() {
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getConditionCid() {
        return conditionCid;
    }

    public void setConditionCid(String conditionCid) {
        this.conditionCid = conditionCid;
    }
}
