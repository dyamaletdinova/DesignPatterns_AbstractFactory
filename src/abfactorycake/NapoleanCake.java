/**
 * 
 */
package abfactorycake;

/**
 *
 * @author Diana Yamaletdinova
 * Jan 31, 2017
 */
public class NapoleanCake implements Cake {

	@Override
    public String toString() {
		return "Napeolean Cake";
    }

	@Override
	public String orderCake() {
		return "Napeolean Cake Added";
	}
}
