package factory;

import vo.Animais;
import vo.Animal;
import vo.Ant;
import vo.Bee;

public class InvertebradoFactory implements AbstractFactory {
	@Override
	public Animal getAnimal(Animais animalType) {
		if (animalType.equals(Animais.Bee)) {
			return new Bee();
		} else if (animalType.equals(Animais.Ant)) {
			return new Ant();
		}
		return null;
	}
}
