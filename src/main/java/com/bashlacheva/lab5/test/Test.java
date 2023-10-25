package main.java.com.bashlacheva.lab5.test;

public class Test {
	
	public static void run() {
		System.out.println("Start testing string handler ---> \n");
		
		System.out.println("Search for lines starting with \"f\":");
		StringHandlerTest.testStartWith();
		
		System.out.println("\nConverting string to map:");
		StringHandlerTest.testToMap();
		
		System.out.println("\n String modification:");
		StringHandlerTest.testModify();
		
		System.out.println("\n <--- Finish testing string handler");
		
		System.out.println("---------------------------------------");
		
		System.out.println("\n Start testing number handler ---> \n");
		
		System.out.println("\n Getting last element in empty list:");
		NumberHandlerTest.testLastEmpty();
		
		System.out.println("\n Сounting last element in list:");
		NumberHandlerTest.testLast();
		
		System.out.println("\n Getting sum of even numbers:");
		NumberHandlerTest.testSum();
		
		System.out.println("\n Сounting sum of empty list:");
		NumberHandlerTest.testSumEmpty();
		
		System.out.println("\n Сounting average of list:");
		NumberHandlerTest.testAverage();
		
		System.out.println("\n Squaring unique numbers:");
		NumberHandlerTest.testSquareUniqu();
		
		System.out.println("\n <--- Finish testing number handler");
	}
}
