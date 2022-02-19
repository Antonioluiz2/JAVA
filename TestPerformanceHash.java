package outro.estudo.aula11.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class TestPerformanceHash {

	public static void main(String[] args) {

		Random random = new Random();

		HashSet<Test> hashSet = new HashSet<>();
		TreeSet<Test> treeSet = new TreeSet<>();
		LinkedHashSet<Test> linkedHashSet = new LinkedHashSet<>();

		long comecaTempo = System.nanoTime();

		for (int i = 0; i < 1000; i++) {
			int x = random.nextInt(1000 - 10) + 10;
			hashSet.add(new Test(x));
			// System.out.println(hashSet.);
		}		
		
		Iterator itr1 = hashSet.iterator();
		
		while (itr1.hasNext()) {
			System.out.println(itr1.next());			
		}

		long fimDoTempo = System.nanoTime();
		long totalTempo = fimDoTempo - comecaTempo;

		System.out.println("HashSet: " + (double) totalTempo / 1_000_000);

		System.out.println("===================================================");

		for (int i = 0; i < 1000; i++) {
			int x = random.nextInt(1000 - 10) + 10;
			treeSet.add(new Test(x));
		}


		fimDoTempo = System.nanoTime();
		totalTempo = fimDoTempo - comecaTempo;

		System.out.println("TreeSet: " + (double) totalTempo / 1_000_000);

		System.out.println("===================================================");

		for (int i = 0; i < 1000; i++) {
			int x = random.nextInt(1000 - 10) + 10;
			linkedHashSet.add(new Test(x));			
		}

		fimDoTempo = System.nanoTime();
		totalTempo = fimDoTempo - comecaTempo;

		System.out.println("LinkedHashSet: " + (double) totalTempo / 1_000_000);

	}
}
