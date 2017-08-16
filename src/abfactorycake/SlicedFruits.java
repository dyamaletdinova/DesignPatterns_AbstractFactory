/**
 * 
 */
package abfactorycake;

/**
 *
 * @author Diana Yamaletdinova
 * Jan 31, 2017
 */
public class SlicedFruits implements Topping {
	
	@Override
    public String toString() {
        return "Sliced Fruits";  
    }

	@Override
	public String addTopping() {
		return "Sliced Fruits added";		
	}
}
