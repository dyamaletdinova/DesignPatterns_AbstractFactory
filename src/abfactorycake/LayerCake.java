/**
 * 
 */
package abfactorycake;

/**
 *
 * @author Diana Yamaletdinova
 * Jan 31, 2017
 */
public class LayerCake implements Cake{
	
	@Override
    public String toString() {
        return "Layer Cake";  
    }

	@Override
	public String orderCake() {
		return "Layer Cake ordered";
	}
}
