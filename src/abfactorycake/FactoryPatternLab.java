/**
 * 
 */
package abfactorycake;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Diana Yamaletdinova Jan 31, 2017
 */
public class FactoryPatternLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please select the cake: ");
		System.out.println("N for Napeolean Cake");
		System.out.println("C for CheeseCake");
		System.out.println("L for Layered Cake");

		String cakeName = null;
		try {
			cakeName = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.print("\n");
		
		System.out.println("Select toppings: ");
		System.out.println("C for Chockolate chips");
		System.out.println("G for Ground Nuts");
		System.out.println("S for Sliced Fruits");
		
		String top = null;
		try {
			top = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//AFBakingService topFactory = BakingServiceCreator.getFactory("Top");
		//Topping topping = topFactory.createTopping(top);
		//System.out.println(topping.toString());
		
		AFBakingService cakeFactory = BakingServiceCreator.getFactory("Cake");
		Cake cake = cakeFactory.createCake(cakeName);
		Topping topping = cakeFactory.createTopping(top);

		System.out.print("\n");
		
		System.out.println("Select box: ");
		System.out.println("S for Square Box");
		System.out.println("R for Round Box");
		
		String box = null;
		try {
			box = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		AFBakingService boxFactory = BakingServiceCreator.getFactory("CakeBox");
		CakeBox boxx = boxFactory.createCakeBox("s");
		System.out.print("\nThanks for your order of a ");
		System.out.print(cake.toString() + " with ");
		System.out.print(topping.toString() + " in a ");		
		System.out.println(boxx.toString() + ".");
	}

}
