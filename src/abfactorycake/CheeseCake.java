/**
 * 
 */
package abfactorycake;

/**
 *
 * @author Diana Yamaletdinova
 * Jan 31, 2017
 */
public class CheeseCake implements Cake{
	
	@Override
    public String toString() {
        return "Cheese Cake";
    }

	@Override
	public String orderCake() {
		return "Chease Cake ordered";
	}

}
