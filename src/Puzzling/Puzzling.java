package Puzzling;
import java.util.ArrayList;
import java.util.Collections;

public class Puzzling {
	public void createArray() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Integer[] arr = {3,5,1,2,7,9,8,13,25,32};
		Integer sum = 0;
		for (Integer i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if(arr[i] > 10) {
				numbers.add(arr[i]);
			}
		}
		System.out.println(sum);
		System.out.println(numbers);
		
		
	}
	public void createArrName(String name1, String name2) {
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> arr = new ArrayList<String>();

		
		names.add(name1);
		names.add(name2);
		names.add("fujibayashi");
		names.add("ishikawa");
		names.add("momochi");
		names.add("mo");
		names.add("chi");
		
		Collections.shuffle(names);
		System.out.println(names);
		
		for(Integer i = 0; i < names.size(); i++) {
			if(names.get(i).length() > 6) {
	
			arr.add(names.get(i));	
			
				     }
				}
		System.out.println(arr);

			}
	
	
	public void alphabet(ArrayList<String> alpha) {
		
		Collections.shuffle(alpha);
		System.out.println(alpha);
		System.out.println(alpha.get(0));
		System.out.println(alpha.get(alpha.size()-1));
		
		
		
		
		
		
	}
	public void randomArr(ArrayList<Integer> randomArray) {
		System.out.println(randomArray);
	}
	
}










