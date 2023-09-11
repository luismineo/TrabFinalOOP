package methods;

import classes.*;

public class printObjects {
    public static void printPatient(Patient patient){
        System.out.println("*********************************");
        System.out.println("NOME: " + patient.getName());
        System.out.println("IDADE: " + patient.getAge() + "anos");
        System.out.println("ALTURA: " + patient.getHeight() + "cm");
        System.out.println("PESO: " + patient.getWeight() + "kg");
        System.out.println("SEXO: " + patient.getSex());
        System.out.println("CPF: " + patient.getCpf());
        System.out.println("CID DA CONDIÇÃO: " + patient.getConditionCid());
        System.out.println("*********************************");
    }

    public static void printMedic(Medic medic){
        System.out.println("*********************************");
        System.out.println("NOME: " + medic.getName());
        System.out.println("IDADE: " + medic.getAge() + "anos");
        System.out.println("ALTURA: " + medic.getHeight() + "cm");
        System.out.println("PESO: " + medic.getWeight() + "kg");
        System.out.println("SEXO: " + medic.getSex());
        System.out.println("CPF: " + medic.getCpf());
        System.out.println("SALÁRIO: " + medic.getSalary() + " R$");
        System.out.println("CRM: " + medic.getCrm());
        System.out.println("*********************************");
    }

    public static void printVet(Veterinary veterinary){
        System.out.println("*********************************");
        System.out.println("NOME: " + veterinary.getName());
        System.out.println("IDADE: " + veterinary.getAge() + "anos");
        System.out.println("ALTURA: " + veterinary.getHeight() + "cm");
        System.out.println("PESO: " + veterinary.getWeight() + "kg");
        System.out.println("SEXO: " + veterinary.getSex());
        System.out.println("CPF: " + veterinary.getCpf());
        System.out.println("SALÁRIO: " + veterinary.getSalary() + " R$");
        System.out.println("CRMV: " + veterinary.getCrmv());
        System.out.println("*********************************");
    }

    public static void printCat(Cat cat){
        System.out.println("*********************************");
        System.out.println("NOME: " + cat.getName());
        System.out.println("IDADE: " + cat.getAge() + "anos");
        System.out.println("ALTURA: " + cat.getHeight() + "cm");
        System.out.println("PESO: " + cat.getWeight() + "kg");
        System.out.println("SEXO: " + cat.getSex());
        System.out.println("CONDIÇÃO: " + cat.getCatDisease());
        System.out.println("*********************************");
    }

    public static void printDog(Dog dog){
        System.out.println("*********************************");
        System.out.println("NOME: " + dog.getName());
        System.out.println("IDADE: " + dog.getAge() + "anos");
        System.out.println("ALTURA: " + dog.getHeight() + "cm");
        System.out.println("PESO: " + dog.getWeight() + "kg");
        System.out.println("SEXO: " + dog.getSex());
        System.out.println("CONDIÇÃO: " + dog.getDogDisease());
        System.out.println("*********************************");
    }
}
