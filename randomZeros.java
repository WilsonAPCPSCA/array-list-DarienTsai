package thing;

import java.util.ArrayList;
public class randomZeros {

	public static void main(String[] args){
		//list init
		ArrayList<Integer> numsRandom = new ArrayList<Integer>(10);
		
		//fill
		Integer x = 0;
		for(int i = 0; i < 10; i++){
			x = (int)(Math.random()*100);
			numsRandom.add(x);
		}
		
		//print
		System.out.println("The random list is : " + numsRandom);
		
		//mod
		final Integer zero = 0;
		for (int i = 0; i < numsRandom.size(); i++){
			numsRandom.set(i, zero);
		}
		
		//print
		System.out.println("The zero'd list is : " + numsRandom);
	}
}
