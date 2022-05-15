package one.digitalinnovation.gof.singleton;

/**
 * 
 * @author Elaine5
 *
 */

public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();		
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
			
		}
		return instancia;
		
	}
	
}
