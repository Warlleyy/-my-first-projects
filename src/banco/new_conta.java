package banco;

public class new_conta {
	private int numero ;
	private String suporte;
	private double saldo;
	
	public new_conta(int numero, String suporte ) {
		this.numero = numero;
		this.suporte = suporte;
		
	}
	
	public new_conta(int numero, String suporte, double depositoInicial) {
		super();
		this.numero = numero;
		this.suporte = suporte;
		deposito(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}

	

	public String getSuporte() {
		return suporte;
	}

	public void setSuporte(String suporte) {
		this.suporte = suporte;
	}

	public double getSaldo() {
		return saldo;
	}
	public void deposito(double montante) {
		saldo += montante;
	}
	public void retirar ( double montante) {
		saldo -= montante = 5.0;
	}

	
}
