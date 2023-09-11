package methods;
import classes.*;

import java.util.Scanner;

public class modifyObjects {
    public static Patient modifyPatient(Patient patient) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Qual parâmetro gostaria de modificar:");
        System.out.println("1 - Nome");
        System.out.println("2 - Idade");
        System.out.println("3 - Altura");
        System.out.println("4 - Peso");
        System.out.println("5 - Sexo");
        System.out.println("6 - CPF");
        System.out.println("7 - CID da condição");
        int op = scn.nextInt();

        switch (op){
            case 1 -> {
                System.out.println("Digite o novo NOME: ");
                patient.setName(scn.next());
            }
            case 2 -> {
                System.out.println("Digite a nova IDADE: ");
                patient.setAge(scn.nextInt());
            }
            case 3 -> {
                System.out.println("Digite a nova ALTURA: ");
                patient.setHeight(scn.nextInt());
            }
            case 4 -> {
                System.out.println("Digite o novo PESO: ");
                patient.setWeight(scn.nextFloat());
            }
            case 5 -> {
                System.out.println("Digite o novo SEXO: ");
                patient.setSex(scn.next());
            }
            case 6 -> {
                System.out.println("Digite o novo CPF: ");
                patient.setCpf(scn.next());
            }
            case 7 -> {
                System.out.println("Digite o novo CID: ");
                patient.setConditionCid(scn.next());
            }
        }
        return patient;
    }

    public static Medic modifyMedic(Medic medic) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Qual parâmetro gostaria de modificar:");
        System.out.println("1 - Nome");
        System.out.println("2 - Idade");
        System.out.println("3 - Altura");
        System.out.println("4 - Peso");
        System.out.println("5 - Sexo");
        System.out.println("6 - CPF");
        System.out.println("7 - Salário");
        System.out.println("8 - CRM");
        int op = scn.nextInt();

        switch (op){
            case 1 -> {
                System.out.println("Digite o novo NOME: ");
                medic.setName(scn.next());
            }
            case 2 -> {
                System.out.println("Digite a nova IDADE: ");
                medic.setAge(scn.nextInt());
            }
            case 3 -> {
                System.out.println("Digite a nova ALTURA: ");
                medic.setHeight(scn.nextInt());
            }
            case 4 -> {
                System.out.println("Digite o novo PESO: ");
                medic.setWeight(scn.nextFloat());
            }
            case 5 -> {
                System.out.println("Digite o novo SEXO: ");
                medic.setSex(scn.next());
            }
            case 6 -> {
                System.out.println("Digite o novo CPF: ");
                medic.setCpf(scn.next());
            }
            case 7 -> {
                System.out.println("Digite o novo SALÁRIO: ");
                medic.setSalary(scn.nextInt());
            }
            case 8 -> {
                System.out.println("Digite o novo CRM: ");
                medic.setCrm(scn.nextInt());
            }
        }
        return medic;
    }

    public static Veterinary modifyVeterinary(Veterinary veterinary) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Qual parâmetro gostaria de modificar:");
        System.out.println("1 - Nome");
        System.out.println("2 - Idade");
        System.out.println("3 - Altura");
        System.out.println("4 - Peso");
        System.out.println("5 - Sexo");
        System.out.println("6 - CPF");
        System.out.println("7 - Salário");
        System.out.println("8 - CRMV");
        int op = scn.nextInt();

        switch (op){
            case 1 -> {
                System.out.println("Digite o novo NOME: ");
                veterinary.setName(scn.next());
            }
            case 2 -> {
                System.out.println("Digite a nova IDADE: ");
                veterinary.setAge(scn.nextInt());
            }
            case 3 -> {
                System.out.println("Digite a nova ALTURA: ");
                veterinary.setHeight(scn.nextInt());
            }
            case 4 -> {
                System.out.println("Digite o novo PESO: ");
                veterinary.setWeight(scn.nextFloat());
            }
            case 5 -> {
                System.out.println("Digite o novo SEXO: ");
                veterinary.setSex(scn.next());
            }
            case 6 -> {
                System.out.println("Digite o novo CPF: ");
                veterinary.setCpf(scn.next());
            }
            case 7 -> {
                System.out.println("Digite o novo SALÁRIO: ");
                veterinary.setSalary(scn.nextInt());
            }
            case 8 -> {
                System.out.println("Digite o novo CRMV: ");
                veterinary.setCrmv(scn.nextInt());
            }
        }
        return veterinary;
    }

    public static Dog modifyDog(Dog dog) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Qual parâmetro gostaria de modificar:");
        System.out.println("1 - Nome");
        System.out.println("2 - Idade");
        System.out.println("3 - Altura");
        System.out.println("4 - Peso");
        System.out.println("5 - Sexo");
        System.out.println("6 - Condição");
        int op = scn.nextInt();

        switch (op){
            case 1 -> {
                System.out.println("Digite o novo NOME: ");
                dog.setName(scn.next());
            }
            case 2 -> {
                System.out.println("Digite a nova IDADE: ");
                dog.setAge(scn.nextInt());
            }
            case 3 -> {
                System.out.println("Digite a nova ALTURA: ");
                dog.setHeight(scn.nextInt());
            }
            case 4 -> {
                System.out.println("Digite o novo PESO: ");
                dog.setWeight(scn.nextFloat());
            }
            case 5 -> {
                System.out.println("Digite o novo SEXO: ");
                dog.setSex(scn.next());
            }
            case 6 -> {
                System.out.println("Digite a nova condição: ");
                dog.setDogDisease(scn.next());
            }
        }
        return dog;
    }

    public static Cat modifyCat(Cat cat) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Qual parâmetro gostaria de modificar:");
        System.out.println("1 - Nome");
        System.out.println("2 - Idade");
        System.out.println("3 - Altura");
        System.out.println("4 - Peso");
        System.out.println("5 - Sexo");
        System.out.println("6 - Condição");
        int op = scn.nextInt();

        switch (op){
            case 1 -> {
                System.out.println("Digite o novo NOME: ");
                cat.setName(scn.next());
            }
            case 2 -> {
                System.out.println("Digite a nova IDADE: ");
                cat.setAge(scn.nextInt());
            }
            case 3 -> {
                System.out.println("Digite a nova ALTURA: ");
                cat.setHeight(scn.nextInt());
            }
            case 4 -> {
                System.out.println("Digite o novo PESO: ");
                cat.setWeight(scn.nextFloat());
            }
            case 5 -> {
                System.out.println("Digite o novo SEXO: ");
                cat.setSex(scn.next());
            }
            case 6 -> {
                System.out.println("Digite a nova condição: ");
                cat.setCatDisease(scn.next());
            }
        }
        return cat;
    }
}
