package program;

import classes.Animal;
import classes.Employee;

import java.util.Scanner;
import java.util.Vector;

public class Executor {
    public static void menu (int op){
        System.out.println("Escolha uma operação:");
        if (op == 1){
            System.out.println("1 - Registrar paciente");
            System.out.println("2 - Excluir paciente");
            System.out.println("3 - Alterar dados paciente");
            System.out.println("4 - Listar pacientes");
            System.out.println("5 - Calcular dosagem");
        } else if (op == 2){
            System.out.println("1 - Registrar animal");
            System.out.println("2 - Excluir animal");
            System.out.println("3 - Alterar dados animal");
            System.out.println("4 - Listar animais");
            System.out.println("5 - Calcular dosagem");
        } else {
            System.out.println("1 - Registrar médico/veterinário");
            System.out.println("2 - Excluir médico/veterinário");
            System.out.println("3 - Alterar dados médico/veterinário");
            System.out.println("4 - Listar médicos/veterinários");
        }
    }

    public static void main(String[] args) {
        //vetores
        Vector<Animal> animals = new Vector<Animal>();
        Vector<Animal> peoples = new Vector<Animal>();
        Vector<Employee> employees = new Vector<Employee>();

        int op;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Quem está acessando");
            System.out.println("1 - Médico");
            System.out.println("2 - Veterinário");
            System.out.println("3 - Admin");
            op = scanner.nextInt();
        } while (op <= 0 || op >= 4);

        if(op == 1){ //medico
            menu(op);
        } else{ //veterinario
            menu(op);
        }
    }
}