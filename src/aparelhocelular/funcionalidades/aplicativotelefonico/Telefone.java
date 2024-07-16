package aparelhocelular.funcionalidades.aplicativotelefonico;

public class Telefone implements AplicativoTelefonico{

	
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}

	
	public void atender() {
		System.out.println("Atendendo telefone.");
	}

	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz.");
	}

	
	
}
