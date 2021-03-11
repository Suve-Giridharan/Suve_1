package javaOopsConcept;

import java.util.ArrayList;

public class FindTheDuplicate {

	public static void main(String[] args) {
		
		int a[] = {8,6,6,3,5,4,8,9,6,5,5,5,6,9,5,5,5,5,3};
		
		int length = a.length;
		
		System.out.println(length);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		
		for (int i=0;i<a.length;i++) {
			
			int k=0;
			
			if(!al.contains(a[i])) {
				
				al.add(a[i]);
				
				System.out.println(al);
				
		   }
			
			for(int j=0;j<a.length;j++) {
				
				if(a[i]== a[j]) {
					
					k++;
				}
				
				
			}
			
			System.out.print(k);
			
		}

	}

}
