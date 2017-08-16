/**
 * 
 */
package abfactorycake;

/**
 *
 * @author Diana Yamaletdinova
 * Jan 31, 2017
 */
public class ChocolateChips implements Topping {

	@Override
    public String toString() {
        return "Chocolate Chips";
    }

	@Override
	public String addTopping() {
		return "ChocolateChips added";
	}
}
