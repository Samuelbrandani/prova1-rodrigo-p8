package factory;

import vo.Animais;
import vo.Animal;
import vo.Elephant;
import vo.Shark;

public class VertebradoFactory implements AbstractFactory {
	@Override
	public Animal getAnimal(Animais animalType) {
		if (animalType.equals(Animais.Elephant)) {
			return new Elephant();
		} else if (animalType.equals(Animais.Shark)) {
			return new Shark();
		}
		return null;
	}
}
