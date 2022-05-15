package one.digitalinnovation.gof.strategy;

public class ComportamentoNormal implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se normalmente...");		
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
