package main.java.com.bashlacheva.lab3.model;

import main.java.com.bashlacheva.lab3.factory.ChordataType;

public class Chordata {
	private final String name;
	private final ChordataType type;
	
	public Chordata(String name, ChordataType type) {
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Type: " + type + "\n" + "Name: " + name;
	}
}
