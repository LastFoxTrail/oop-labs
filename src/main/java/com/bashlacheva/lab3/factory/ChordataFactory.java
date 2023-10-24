package main.java.com.bashlacheva.lab3.factory;

import main.java.com.bashlacheva.lab3.exception.TypeNotExistException;
import main.java.com.bashlacheva.lab3.model.Chordata;

public interface ChordataFactory {
	Chordata createChordata(int type, String name) throws TypeNotExistException;
}
