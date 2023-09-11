package classes;

public class Patient extends People{
    private String conditionCid;

    public Patient(String name, int age, int height, float weight, String sex, String cpf, String conditionCid) {
        super(name, age, height, weight, sex, cpf);
        this.conditionCid = conditionCid;
    }

    public Patient() {
    }

    public String getConditionCid() {
        return conditionCid;
    }

    public void setConditionCid(String conditionCid) {
        this.conditionCid = conditionCid;
    }
}
