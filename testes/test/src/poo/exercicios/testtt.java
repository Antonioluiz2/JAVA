package poo.exercicios;

import java.util.Collection;
import java.util.List;

public class testtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			
		}
		
		int x=5;
		int y=2;
		double z=x/y;
		System.out.println(++z);
		
		
		var fruits = List.of(List.of("orange", "strawberry", "lemon"), List.of("blueberry", "raspberry", "strawberry"));
		var flatStream = fruits.stream().flatMap(Collection::stream);
		long distinctFruits = flatStream.distinct().count();
		System.out.println(distinctFruits);
		
	
	/*private static String getRandomName() {
	    System.out.println("Providing a random name");
	    return "John Doe";*/
	}

}
