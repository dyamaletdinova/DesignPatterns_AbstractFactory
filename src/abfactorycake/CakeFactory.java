/**
 * 
 */
package abfactorycake;

/**
 *
 * @author Diana Yamaletdinova
 * Jan 31, 2017
 */
public class CakeFactory extends AFBakingService{

	@Override
	public Cake createCake(String id) {
		if (id == null){
			return null;  
		}
		if (id.equalsIgnoreCase("N")){
			
			return new NapoleanCake();
			
		} else if (id.equalsIgnoreCase("C")){
			
			return new CheeseCake();
			
		} else if (id.equalsIgnoreCase("L")){
			
			return new LayerCake();
			
		} 
		return null;
	}

	@Override
	public Topping createTopping(String id) {
		if (id == null){
			return null;  
		}
		if (id.equalsIgnoreCase("S")){
			
			return new SlicedFruits();
			
		} else if (id.equalsIgnoreCase("G")){
			
			return new GroundNuts();
			
		} else if (id.equalsIgnoreCase("C")){
			
			return new ChocolateChips();
			
		} 
		return null;
	}

	@Override
	public CakeBox createCakeBox(String id) {
		return null;
	}
}
