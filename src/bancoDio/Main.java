package bancoDio;

public class Main {

	public static void main(String[] args) {
		
		Cliente Fabio = new Cliente();
		Fabio.setNome("Fabio");
		
		
		Conta cc = new ContaCorrente(Fabio);
		Conta poupanca = new ContaPoupanca(Fabio);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
