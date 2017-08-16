/**
 * 
 */
package abfactorycake;

/**
 *
 * @author Diana Yamaletdinova
 * Jan 31, 2017
 */
abstract class AFBakingService {
	public abstract Cake createCake(String id);
	public abstract Topping createTopping(String id);
	public abstract CakeBox createCakeBox(String id);	
}
