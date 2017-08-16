/**
 * 
 */
package abfactorycake;

/**
 *
 * @author Diana Yamaletdinova
 * Jan 31, 2017
 */
public class BakingServiceCreator {
   
	public static AFBakingService getFactory(String choice){  
		
		if(choice.equalsIgnoreCase("Cake")){  
            return new CakeFactory();  
        }  else if (choice.equalsIgnoreCase("CakeBox")){ 
            return new CakeBoxFactory();          	
        }
        return null;  
     }  
}
