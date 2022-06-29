package jana60.WishList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//sessione 4, versione col for
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> wishList = new ArrayList<String>();
		
		System.out.println("Esprimi un desiderio: ");
		
		boolean candles = true;
		
		//massimo dei desideri = 5, ma posso fermarmi prima
		for(int i = 0; i < 5; i++) {
			
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
				
				if(i == 4) {
					System.out.println("hai raggiunto il massimo dei desideri!");
				}
			}
		}
		
		Collections.sort(wishList);
	    System.out.println("Lista dei desideri: " + wishList);
	    
	    scan.close();

	}

}
