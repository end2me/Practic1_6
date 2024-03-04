package com.mycompany.practicaltask1_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название растения: ");
        String plantName = scanner.nextLine();

        Plant plant = new Plant(plantName);
        Gardener gardener = new Gardener();

        gardener.filter(plant);

        System.out.println("Начальное название: " + plantName);
        System.out.println("Измененное название: " + plant.getName());
    }
}
