package javaOopsConcept;

import java.util.ArrayList;

public class FindingUniqueNumber {

	public static void main(String[] args) {

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };

		int leng = a.length;

		System.out.println(leng);

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i=0; 0<a.length;i++) {

			int k = 0;

			if (!al.contains(a[i])) {

				al.add(a[i]);

				System.out.println(al);

				for (int j = 0; j < a.length; j++) {

					if (a[i] == a[j]) {

						k++;
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
			}

			if (k == 1) {

				System.out.println(a[i] + " is the Unique Number");
			}

		}

	}

}
