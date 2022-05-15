package one.digitalinnovation.gof.singleton;

/**
 * 
 * @author Elaine5
 *
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder {
	private static SingletonLazyHolder  instancia = new SingletonLazyHolder();
	}
	private SingletonLazyHolder () {
		super();		
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;		
	}
	
}