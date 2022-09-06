
public class TestMonederito {

	public static void main(String[] args) {
		
		Monederito miMonedero = new Monederito (500.50); 
		
		miMonedero.consultarSaldo();
		miMonedero.retirarDinero(600);
		miMonedero.consultarSaldo();
		miMonedero.hacerDeposito(150.98);
		miMonedero.retirarDinero(600);
		miMonedero.consultarSaldo();
	
		
		
	}
}
