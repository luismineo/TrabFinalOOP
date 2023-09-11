package program;

import classes.*;

import java.util.Scanner;

import static lists.RegisterObjs.*;
import static methods.Dosage.calculateDosage;
import static methods.addNewObjects.*;
import static methods.modifyObjects.*;
import static methods.printObjects.*;

public class Executor {
    public static void menu (int op){
        System.out.println("Escolha uma operação:");
        if (op == 1){
            System.out.println("0 - SAIR");
            System.out.println("1 - Registrar paciente");
            System.out.println("2 - Excluir paciente");
            System.out.println("3 - Alterar dados paciente");
            System.out.println("4 - Listar pacientes");
            System.out.println("5 - Consultar pacientes");
            System.out.println("6 - Calcular dosagem");
        } else if (op == 2){
            System.out.println("0 - SAIR");
            System.out.println("1 - Registrar animal");
            System.out.println("2 - Excluir animal");
            System.out.println("3 - Alterar dados animal");
            System.out.println("4 - Listar animais");
            System.out.println("5 - Consultar animais");
            System.out.println("6 - Calcular dosagem");
        } else {
            System.out.println("0 - SAIR");
            System.out.println("1 - Registrar médico/veterinário");
            System.out.println("2 - Excluir médico/veterinário");
            System.out.println("3 - Alterar davdos médico/veterinário");
            System.out.println("4 - Listar médicos/veterinários");
            System.out.println("5 - Consultar médicos/veterinários");
        }
    }

    public static void main(String[] args) {
        //vetores
        Patient[] listPatient = new Patient[100];
        Medic[] listMedic = new Medic[100];
        Veterinary[] listVeterinary = new Veterinary[100];
        Cat[] listCat = new Cat[100];
        Dog[] listDog = new Dog[100];

        //pacientes pré-inseridos
        listPatient[0] = pat01;
        listPatient[1] = pat02;
        listPatient[2] = pat03;

        //médicos pré-inseridos
        listMedic[0] = medic01;
        listMedic[1] = medic02;
        listMedic[2] = medic03;

        //veterinários pré-inseridos
        listVeterinary[0] = vet01;
        listVeterinary[1] = vet02;
        listVeterinary[2] = vet03;

        //cachorros pré-inseridos
        listDog[0] = dog01;
        listDog[1] = dog02;

        //gatos pré-inseridos
        listCat[0] = cat01;
        listCat[1] = cat02;

        int op;
        int options;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Quem está acessando");
            System.out.println("1 - Médico");
            System.out.println("2 - Veterinário");
            System.out.println("3 - Admin");
            op = scanner.nextInt();

            if(op <= 0 || op >= 4){
                System.out.println("Digite uma opção válida");
            }
        } while (op <= 0 || op >= 4);

        if(op == 1){ //medico
            do {
                menu(op);
                options = scanner.nextInt();
                if (options < 0 || options > 5){
                    System.out.println("Digite uma opção válida");
                }
                if (options == 0){
                    System.out.println("Saindo...");
                    break;
                }
                switch (options) {
                    case 1 -> {
                        for (int i = 0; i < listPatient.length; i++) {
                            if (listPatient[i] == null){
                                listPatient[i] = newPatient();
                                break;
                            }
                        }
                        System.out.println("Paciente cadastrado");
                        System.out.println("*********************************");
                    }
                    case 2 -> {
                        int n;
                        System.out.println("Digite o ID do paciente que deseja excluir:");
                        n = scanner.nextInt();
                        listPatient[n] = null;
                        System.out.println("Paciente excluído");
                        System.out.println("*********************************");
                    }
                    case 3 -> {
                        int n;
                        System.out.println("Digite o ID do paciente que quer alterar");
                        n = scanner.nextInt();
                        if (listPatient[n] != null){
                            modifyPatient(listPatient[n]);
                            System.out.println("Paciente alterado");
                            System.out.println("*********************************");
                        } else {
                            System.out.println("Paciente não encontrado");
                        }
                    }
                    case 4 -> {
                        System.out.println("Lista de Pacientes: ");
                        System.out.println("*********************************");
                        for (int i = 0; i < listPatient.length; i++) {
                            if (listPatient[i] != null){
                                System.out.println("ID: " + i);
                                printPatient(listPatient[i]);
                            }
                        }
                    }
                    case 5 -> {
                        int n;
                        System.out.println("Digite o ID do paciente que quer consultar");
                        n = scanner.nextInt();
                        printPatient(listPatient[n]);
                    }
                    case 6 -> {
                        int n;
                        System.out.println("Digite o ID do paciente que deseja calcular:");
                        n = scanner.nextInt();
                        System.out.println("Dosagem: " + calculateDosage(listPatient[n], op) + " mg");
                        System.out.println("*********************************");
                    }
                }
            } while (true);
        } else if (op == 2){ //veterinario
            do {
                menu(op);
                options = scanner.nextInt();
                if (options < 0 || options > 5){
                    System.out.println("Digite uma opção válida");
                }
                if (options == 0){
                    System.out.println("Saindo...");
                    break;
                }

                int animalType;
                System.out.println("Qual tipo de animal quer acessar:");
                System.out.println("1 - Cachorro");
                System.out.println("2 - Gato");
                animalType = scanner.nextInt();

                switch (options) {
                    case 1 -> {
                        if (animalType == 1){
                            for (int i = 0; i < listDog.length; i++) {
                                if (listDog[i] == null){
                                    listDog[i] = newDog();
                                    break;
                                }
                            }
                            System.out.println("Cachorro cadastrado com sucesso");
                        } else {
                            for (int i = 0; i < listCat.length; i++) {
                                if (listCat[i] == null){
                                    listCat[i] = newCat();
                                    break;
                                }
                            }
                            System.out.println("Gato cadastrado com sucesso");
                        }
                    }
                    case 2 -> {
                        if (animalType == 1){
                            int n;
                            System.out.println("Digite o ID do animal que deseja excluir:");
                            n = scanner.nextInt();
                            listDog[n] = null;
                            System.out.println("Cahorro excluído");
                            System.out.println("*********************************");
                        } else {
                            int n;
                            System.out.println("Digite o ID do animal que deseja excluir:");
                            n = scanner.nextInt();
                            listCat[n] = null;
                            System.out.println("Gato excluído");
                            System.out.println("*********************************");
                        }
                    }
                    case 3 -> {
                        if (animalType == 1){
                            int n;
                            System.out.println("Digite o ID do animal que quer alterar");
                            n = scanner.nextInt();
                            if (listDog[n] != null){
                                modifyDog(listDog[n]);
                                System.out.println("Cachorro alterado");
                                System.out.println("*********************************");
                            } else {
                                System.out.println("Animal não encontrado");
                            }
                        } else {
                            int n;
                            System.out.println("Digite o ID do animal que quer alterar");
                            n = scanner.nextInt();
                            if (listCat[n] != null){
                                modifyCat(listCat[n]);
                                System.out.println("Gato alterado");
                                System.out.println("*********************************");
                            } else {
                                System.out.println("Animal não encontrado");
                            }
                        }
                    }
                    case 4 -> {
                        if (animalType == 1){
                            System.out.println("Lista de cachorros: ");
                            System.out.println("*********************************");
                            for (int i = 0; i < listDog.length; i++) {
                                if (listDog[i] != null){
                                    System.out.println("ID: " + i);
                                    printDog(listDog[i]);
                                }
                            }
                        } else {
                            System.out.println("Lista de gatos: ");
                            System.out.println("*********************************");
                            for (int i = 0; i < listCat.length; i++) {
                                if (listCat[i] != null){
                                    System.out.println("ID: " + i);
                                    printCat(listCat[i]);
                                }
                            }
                        }
                    }
                    case 5 -> {
                        if (animalType == 1){
                            int n;
                            System.out.println("Digite o ID do cachorro que quer consultar");
                            n = scanner.nextInt();
                            printDog(listDog[n]);
                        } else {
                            int n;
                            System.out.println("Digite o ID do paciente que quer consultar");
                            n = scanner.nextInt();
                            printCat(listCat[n]);
                        }
                    }
                    case 6 -> {
                        if (animalType == 1){
                            int n;
                            System.out.println("Digite o ID do cachorro que deseja calcular:");
                            n = scanner.nextInt();
                            System.out.println("Dosagem: " + calculateDosage(listDog[n], op) + " mg");
                            System.out.println("*********************************");
                        } else {
                            int n;
                            System.out.println("Digite o ID do gato que deseja calcular:");
                            n = scanner.nextInt();
                            System.out.println("Dosagem: " + calculateDosage(listCat[n], op) + " mg");
                            System.out.println("*********************************");
                        }
                    }
                }
            } while (true);
        } else {
            do {
                menu(op);
                options = scanner.nextInt();
                if (options < 0 || options > 4){
                    System.out.println("Digite uma opção válida");
                }
                if (options == 0){
                    System.out.println("Saindo...");
                    break;
                }

                int medType;
                System.out.println("Qual funcionário quer acessar:");
                System.out.println("1 - Médico");
                System.out.println("2 - Médico veterinário");
                medType = scanner.nextInt();

                switch (options) {
                    case 1 -> {
                        if (medType == 1){
                            for (int i = 0; i < listMedic.length; i++) {
                                if (listMedic[i] == null){
                                    listMedic[i] = newMedic();
                                    break;
                                }
                            }
                            System.out.println("Médico cadastrado com sucesso");
                        } else {
                            for (int i = 0; i < listCat.length; i++) {
                                if (listVeterinary[i] == null){
                                    listVeterinary[i] = newVeterinary();
                                    break;
                                }
                            }
                            System.out.println("Veterinário cadastrado com sucesso");
                        }
                    }
                    case 2 -> {
                        if (medType == 1){
                            int n;
                            System.out.println("Digite o ID do médico que deseja excluir:");
                            n = scanner.nextInt();
                            listMedic[n] = null;
                            System.out.println("Médico excluído");
                            System.out.println("*********************************");
                        } else {
                            int n;
                            System.out.println("Digite o ID do veterinário que deseja excluir:");
                            n = scanner.nextInt();
                            listVeterinary[n] = null;
                            System.out.println("Veterinário excluído");
                            System.out.println("*********************************");
                        }
                    }
                    case 3 -> {
                        if (medType == 1){
                            int n;
                            System.out.println("Digite o ID do médico que quer alterar");
                            n = scanner.nextInt();
                            if (listMedic[n] != null){
                                modifyMedic(listMedic[n]);
                                System.out.println("Médico alterado");
                                System.out.println("*********************************");
                            } else {
                                System.out.println("Médico não encontrado");
                            }
                        } else {
                            int n;
                            System.out.println("Digite o ID do veterinário que quer alterar");
                            n = scanner.nextInt();
                            if (listVeterinary[n] != null){
                                modifyVeterinary(listVeterinary[n]);
                                System.out.println("Veterinário alterado");
                                System.out.println("*********************************");
                            } else {
                                System.out.println("Veterinário não encontrado");
                            }
                        }
                    }
                    case 4 -> {
                        if (medType == 1){
                            System.out.println("Lista de médicos: ");
                            System.out.println("*********************************");
                            for (int i = 0; i < listMedic.length; i++) {
                                if (listMedic[i] != null){
                                    System.out.println("ID: " + i);
                                    printMedic(listMedic[i]);
                                }
                            }
                        } else {
                            System.out.println("Lista de veterinários: ");
                            System.out.println("*********************************");
                            for (int i = 0; i < listVeterinary.length; i++) {
                                if (listVeterinary[i] != null){
                                    System.out.println("ID: " + i);
                                    printVet(listVeterinary[i]);
                                }
                            }
                        }
                    }
                    case 5 -> {
                        if (medType == 1){
                            int n;
                            System.out.println("Digite o ID do médico que quer consultar");
                            n = scanner.nextInt();
                            printMedic(listMedic[n]);
                        } else {
                            int n;
                            System.out.println("Digite o ID do veterinário que quer consultar");
                            n = scanner.nextInt();
                            printVet(listVeterinary[n]);
                        }
                    }
                }
            } while (true);
        }
    }
}