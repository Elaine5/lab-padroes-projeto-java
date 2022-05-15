package one.digitalinnovation.gof.singleton;

/**
 * 
 * @author Elaine5
 *
 */

public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager () {
		super();		
	}
	
	public static SingletonEager getInstancia() {
		return instancia;		
	}
	
}
