package methods;

import classes.Animal;

import java.util.Scanner;

import lists.RemedyList;

public class Dosage {
    static RemedyList remedyList = new RemedyList();

    public static float calculateDosage(Animal subject, int medType){
        int op;
        Scanner scn = new Scanner(System.in);

        System.out.println("Qual remédio deseja calcular");
        System.out.println("1 - Dipirona");
        System.out.println("2 - Paracetamol");
        System.out.println("3 - Ivermectina");
        op = scn.nextInt();

        if (medType == 1){
            switch (op) {
                case 1 -> {
                    return subject.getWeight() * remedyList.getDipironaH();
                }
                case 2 -> {
                    return subject.getWeight() * remedyList.getParacetamolH();
                }
                case 3 -> {
                    return subject.getWeight() * remedyList.getIvermectinaH();
                }
            }
        } else {
            switch (op) {
                case 1 -> {
                    return subject.getWeight() * remedyList.getDipironaA();
                }
                case 2 -> {
                    return subject.getWeight() * remedyList.getParacetamolA();
                }
                case 3 -> {
                    return subject.getWeight() * remedyList.getIvermectinaA();
                }
            }
        }
        return 0;
    }
}