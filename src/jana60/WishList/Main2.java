package jana60.WishList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		//sessione 4, versione col solo while
        Scanner scan = new Scanner(System.in);
		
		ArrayList<String> wishList = new ArrayList<String>();
		
		System.out.println("Esprimi un desiderio (massimo 5): ");
		
		boolean candles = true;
		
		while(candles) {
			String wish = scan.nextLine();
			wishList.add(wish);
			
			System.out.println("vuoi esprimere un altro desiderio? yes | no");
			String answer = scan.nextLine();
			if(answer.equalsIgnoreCase("yes")) {
				System.out.println("esprimi un desiderio: ");
			}else {
				candles = false;
			}
			
			if(wishList.size() == 5) {
				System.out.println("hai raggiunto il massimo di desideri!");
				candles = false;
			}
			

	   }
		
		Collections.sort(wishList);
	    System.out.println("Lista dei desideri: " + wishList);
	    
	    scan.close();

	}
}
