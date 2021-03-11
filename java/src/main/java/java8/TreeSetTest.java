package java8;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		Random r = new Random();
		
		int count = 0;
		for(int i = 0; i < 100; i++) {
			int added =  r.nextInt(100);
			set.add(added);
			System.out.print(added+",");
			count++;
		}
		System.out.println("\n added in set"+ count );
		count = 0; 

		for(Integer item : set) {
			System.out.print(item+",");
			count++;

		}
		System.out.println();
		System.out.println("\n get from set"+ count );

	}

}
