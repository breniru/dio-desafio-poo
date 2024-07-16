package aparelhocelular;

import aparelhocelular.funcionalidades.aplicativotelefonico.AplicativoTelefonico;
import aparelhocelular.funcionalidades.navegadorinternet.NavegadorInternet;
import aparelhocelular.funcionalidades.reprodutormusical.ReprodutorMusical;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AplicativoTelefonico{

	
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero + ", com o Iphone");
	}

	
	public void atender() {
		System.out.println("Atendendo telefone com o Iphone.");	
	}

	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz com o Iphone.");
	}

	
	public void tocar() {
		System.out.println("Tocando música com o Iphone.");
	}

	
	public void pausar() {
		System.out.println("Pausando música com o Iphone.");
	}


	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música: " + musica + ", com o Iphone.");
		
	}

	
	public void exibirPagina(String url) {
		System.out.println("Exibindo página escolhida com o Iphone.");
	}

	
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba com o Iphone.");
	}

	
	public void atualizarPagina() {
		System.out.println("Atualizando página com o Iphone.");
	}
	
}
