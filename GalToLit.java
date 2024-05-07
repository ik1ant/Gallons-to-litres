/*
Упражнение 1.1
Программа для приображение галлонов литры
 */

import java.util.Scanner;

public class GalToLit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gallons, liters;

        System.out.print("Введите галлоны ");
        gallons = scanner.nextDouble();

        liters = gallons * 3.7854;

        System.out.println(gallons + " галлонов равно " + liters + " литрам");
    }
}