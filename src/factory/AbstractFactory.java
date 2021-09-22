package factory;

import vo.Animais;
import vo.Animal;
import vo.AnimalType;

public interface AbstractFactory {

	Animal getAnimal(Animais animal);

	
}
