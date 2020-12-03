package Puzzling;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;



public class PuzzlingTest {
	public static void main(String[] args) {
    	
		Puzzling iD = new Puzzling();
		ArrayList<String> alpha = new ArrayList<String>();
		
		Random r = new Random();
		
		alpha.add("a");
		alpha.add("b");
		alpha.add("c");
		alpha.add("d");
		alpha.add("e");
		alpha.add("f");
		alpha.add("g");
		alpha.add("h");
		alpha.add("i");
		alpha.add("j");
		alpha.add("k");
		alpha.add("l");
		alpha.add("m");
		alpha.add("n");
		alpha.add("o");
		alpha.add("p");
		alpha.add("q");
		alpha.add("");
		alpha.add("b");
		alpha.add("c");
		alpha.add("d");
		
		ArrayList<Integer> randomArray = new ArrayList();
		randomArray.add(1);
		randomArray.add(r.nextInt(100-0));
		
		
		
		iD.createArray();
		iD.createArrName("Shaun","Dylan");
		iD.alphabet(alpha);
		
		
		iD.randomArr(randomArray);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    	
    }
}