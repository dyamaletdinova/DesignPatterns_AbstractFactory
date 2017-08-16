/**
 * 
 */
package abfactorycake;

/**
 *
 * @author Diana Yamaletdinova
 * Jan 31, 2017
 */
public class CakeBoxFactory extends AFBakingService{

	@Override
	public Cake createCake(String id) {
		return null;
	}

	@Override
	public Topping createTopping(String id) {
		return null;
	}

	@Override
	public CakeBox createCakeBox(String id) {
		if (id == null){
			return null;  
		}
		if (id.equalsIgnoreCase("S")){
			
			return new SquareCakeBox();
			
		} else if (id.equalsIgnoreCase("R")){
			
			return new RoundCakeBox();			
		}
		return null;
	}
}
