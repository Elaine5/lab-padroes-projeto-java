package one.digitalinnovation.gof.strategy;

public class ComportamentoAgressivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se agressivamente...");		
	}

	@Override
	public void bater() {
		System.out.println("Batendo no adversário...");
	}
	
	@Override
	public void recuar() {		
		System.out.println("Recuando defensivamente...");			
	}

}
