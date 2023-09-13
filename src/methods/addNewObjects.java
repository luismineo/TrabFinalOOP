package methods;

import classes.*;

import java.util.Scanner;

public class addNewObjects {
    static Scanner scn = new Scanner(System.in);
    public static Patient newPatient() {
        String name;
        int age;
        int height;
        float weight;
        String sex;
        String cpf;
        String conditionCid;

        Patient patient;
        patient = new Patient();

        System.out.println("Por favor use underline (nome_sobrenome) ao inves de espaços");
        System.out.println("********************************");

        System.out.println("Digite o nome do paciente:");
        name = scn.next();
        patient.setName(name);

        System.out.println("Digite a idade do paciente:");
        age = scn.nextInt();
        patient.setAge(age);

        System.out.println("Digite a altura do paciente:");
        height = scn.nextInt();
        patient.setHeight(height);

        System.out.println("Digite o peso do paciente:");
        weight = scn.nextFloat();
        patient.setWeight(weight);

        System.out.println("Digite o sexo do paciente:");
        sex = scn.next();
        patient.setSex(sex);

        System.out.println("Digite o cpf do paciente:");
        cpf = scn.next();
        patient.setCpf(cpf);

        System.out.println("Digite o CID da condição do paciente:");
        conditionCid = scn.next();
        patient.setConditionCid(conditionCid);

        return patient;
    }

    public static Medic newMedic() {
        String name;
        int age;
        int height;
        float weight;
        String sex;
        String cpf;
        float salary;
        int crm;

        Medic medic;
        medic = new Medic();

        System.out.println("Por favor use underline (nome_sobrenome) ao inves de espaços");
        System.out.println("********************************");

        System.out.println("Digite o nome do médico:");
        name = scn.next();
        medic.setName(name);

        System.out.println("Digite a idade do médico:");
        age = scn.nextInt();
        medic.setAge(age);

        System.out.println("Digite a altura do médico:");
        height = scn.nextInt();
        medic.setHeight(height);

        System.out.println("Digite o peso do médico:");
        weight = scn.nextFloat();
        medic.setWeight(weight);

        System.out.println("Digite o sexo do médico:");
        sex = scn.next();
        medic.setSex(sex);

        System.out.println("Digite o cpf do médico:");
        cpf = scn.next();
        medic.setCpf(cpf);

        System.out.println("Digite o salário:");
        salary = scn.nextFloat();
        medic.setSalary(salary);

        System.out.println("Digite o CRM do médico:");
        crm = scn.nextInt();
        medic.setCrm(crm);

        return medic;
    }

    public static Veterinary newVeterinary() {
        String name;
        int age;
        int height;
        float weight;
        String sex;
        String cpf;
        float salary;
        int crmv;

        Veterinary veterinary;
        veterinary = new Veterinary();

        System.out.println("Por favor use underline (nome_sobrenome) ao inves de espaços");
        System.out.println("********************************");

        System.out.println("Digite o nome do médico veterinário:");
        name = scn.next();
        veterinary.setName(name);

        System.out.println("Digite a idade do médico veterinário:");
        age = scn.nextInt();
        veterinary.setAge(age);

        System.out.println("Digite a altura do médico veterinário:");
        height = scn.nextInt();
        veterinary.setHeight(height);

        System.out.println("Digite o peso do médico veterinário:");
        weight = scn.nextFloat();
        veterinary.setWeight(weight);

        System.out.println("Digite o sexo do médico veterinário:");
        sex = scn.next();
        veterinary.setSex(sex);

        System.out.println("Digite o cpf do médico veterinário:");
        cpf = scn.next();
        veterinary.setCpf(cpf);

        System.out.println("Digite o salário:");
        salary = scn.nextFloat();
        veterinary.setSalary(salary);

        System.out.println("Digite o CRMV do médico veterinário:");
        crmv = scn.nextInt();
        veterinary.setCrmv(crmv);

        return veterinary;
    }

    public static Dog newDog() {
        String name;
        int age;
        int height;
        int weight;
        String sex;
        String dogDisease;

        Dog dog;
        dog = new Dog();

        System.out.println("Novo cachorro");
        System.out.println("********************************");
        System.out.println("Por favor use underline (nome_sobrenome) ao inves de espaços");
        System.out.println("********************************");

        System.out.println("Digite o nome do animal:");
        name = scn.next();
        dog.setName(name);

        System.out.println("Digite a idade do animal:");
        age = scn.nextInt();
        dog.setAge(age);

        System.out.println("Digite a altura do animal:");
        height = scn.nextInt();
        dog.setHeight(height);

        System.out.println("Digite o peso do animal:");
        weight = scn.nextInt();
        dog.setWeight(weight);

        System.out.println("Digite o sexo do animal:");
        sex = scn.next();
        dog.setSex(sex);

        System.out.println("Digite a condição do animal:");
        dogDisease = scn.next();
        dog.setDogDisease(dogDisease);

        return dog;
    }

    public static Cat newCat() {
        String name;
        int age;
        int height;
        int weight;
        String sex;
        String catDisease;

        Cat cat;
        cat = new Cat();

        System.out.println("Novo gato");
        System.out.println("********************************");
        System.out.println("Por favor use underline (nome_sobrenome) ao inves de espaços");
        System.out.println("********************************");

        System.out.println("Digite o nome do animal:");
        name = scn.next();
        cat.setName(name);

        System.out.println("Digite a idade do animal:");
        age = scn.nextInt();
        cat.setAge(age);

        System.out.println("Digite a altura do animal:");
        height = scn.nextInt();
        cat.setHeight(height);

        System.out.println("Digite o peso do animal:");
        weight = scn.nextInt();
        cat.setWeight(weight);

        System.out.println("Digite o sexo do animal:");
        sex = scn.next();
        cat.setSex(sex);

        System.out.println("Digite a condição do animal:");
        catDisease = scn.next();
        cat.setCatDisease(catDisease);

        return cat;
    }
}
