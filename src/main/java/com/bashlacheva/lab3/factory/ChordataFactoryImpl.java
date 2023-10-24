package main.java.com.bashlacheva.lab3.factory;

import main.java.com.bashlacheva.lab3.model.*;
import main.java.com.bashlacheva.lab3.exception.TypeNotExistException;

public class ChordataFactoryImpl implements ChordataFactory {

	@Override
	public Chordata createChordata(int type, String name) throws TypeNotExistException {
		
		return switch (type) {
			case 1 -> new Lynx(name, ChordataType.LYNX);
			case 2 -> new Manul(name, ChordataType.MANUL);
			case 3 -> new Mammal(name, ChordataType.MAMMAL);
			case 4 -> new Feline(name, ChordataType.FELINE);
			case 5 -> new Hedgehog(name, ChordataType.HEDGEHOD);
			case 6 -> new Chordata(name, ChordataType.CHORDATA);
			case 7 -> new Predatory(name, ChordataType.PREDATORY);
			case 8 -> new Insectivore(name, ChordataType.INSECTIVORE);
			case 9 -> new CommonHedgehog(name, ChordataType.COMMON_HEDGEHOD);
			default -> throw new TypeNotExistException();
		};
	}
}
