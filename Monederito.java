
public class Monederito {
	
	public double saldo;

	public Monederito(double saldo) {
		this.saldo = saldo;
	}//closing constructor
	

	public void hacerDeposito (double deposito) {
		saldo=  saldo + deposito;
	}//Depositar
	
	public void retirarDinero (double retiro) {
		if (saldo-retiro>=0) {
		 saldo=saldo-retiro;
		}else {
			System.out.println("Lo sentimos no cuenta con los fondos suficientes para realizar el retiro.");
		}
	}//retirar
	
	public void consultarSaldo () {
		System.out.println (saldo);
	}//Consultar
	
	
}//closing monederito
