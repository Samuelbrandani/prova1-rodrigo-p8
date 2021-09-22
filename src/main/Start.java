package main;

import java.util.Scanner;

import factory.FactoryProvider;
import vo.Animais;
import vo.Animal;
import vo.AnimalType;

public class Start {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("***ANIMAIS***");
		System.out.println("1 - Vertebrados");
		System.out.println("2 - Invertebrados");
		System.out.println("Digite sua opção:");

		int option = scanner.nextInt();

	
		if (option == 1) {
			factory.AbstractFactory factory1 = FactoryProvider.getAnimal(AnimalType.VERTEBRADO);
			Animal elephant = factory1.getAnimal(Animais.Elephant);
			elephant.eat();

			factory.AbstractFactory factory2 = FactoryProvider.getAnimal(AnimalType.VERTEBRADO);
			Animal shark = factory2.getAnimal(Animais.Shark);
			shark.eat();

		} else if (option == 2) {
			factory.AbstractFactory factory1 = FactoryProvider.getAnimal(AnimalType.INVERTEBRADO);
			Animal bee = factory1.getAnimal(Animais.Bee);
			bee.eat();

			factory.AbstractFactory factory2 = FactoryProvider.getAnimal(AnimalType.INVERTEBRADO);
			Animal ant = factory2.getAnimal(Animais.Ant);
			ant.eat();
		}

		scanner.close();
	}
}
