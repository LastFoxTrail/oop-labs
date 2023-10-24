package main.java.com.bashlacheva.lab3;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import main.java.com.bashlacheva.lab3.model.*;
import main.java.com.bashlacheva.lab3.factory.*;
import main.java.com.bashlacheva.lab3.exception.TypeNotExistException;

public class Main {
	
	public static void main(String[] ars)
	{
		List<Lynx> lynxs = new ArrayList<>(); 
		List<Manul> manuls = new ArrayList<>();
		List<Chordata> src = new ArrayList<>();
		List<CommonHedgehog> commonHedgehogs = new ArrayList<>();
		
		ChordataFactory factory = new ChordataFactoryImpl();
		
		try (Scanner input = new Scanner(System.in)) {
			while (input.hasNextLine()) {
				try {
					int choice = input.nextInt();
					input.nextLine();
					
					if (choice == 0)
					{
						break;
					}
					
					String name = input.nextLine();
					
					Chordata chordata = factory.createChordata(choice, name);
					src.add(chordata);
				}
				catch (TypeNotExistException e) {
					System.err.println("Selected type does not exist");
				}
			}
		}
		
		Segregator.segregate(src, commonHedgehogs, manuls, lynxs);
		
		System.out.println("Lynxs: " + lynxs.size());
		System.out.println("Manuls: " + manuls.size());
		System.out.println("Common hedgehogs: " + commonHedgehogs.size());
	}
}
