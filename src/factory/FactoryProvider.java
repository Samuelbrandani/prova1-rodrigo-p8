package factory;

import vo.Animal;
import vo.AnimalType;

public class FactoryProvider {
	public static AbstractFactory getAnimal(AnimalType animalType) {
		if (animalType.equals(AnimalType.INVERTEBRADO)) {
			return new InvertebradoFactory();
		} else if (animalType.equals(AnimalType.VERTEBRADO)) {
			return new VertebradoFactory();
		}
		return null;
	}
}
