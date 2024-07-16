import aparelhocelular.Iphone;

public class Celular {
	
	public static void main(String[] args) {

		Iphone iphone = new Iphone();
		
		iphone.ligar("11 976030946");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		iphone.adicionarNovaAba();
		iphone.exibirPagina("google.com");
		iphone.atualizarPagina();
		
		iphone.selecionarMusica(null);
		iphone.tocar();
		iphone.pausar();
		
	}
}
