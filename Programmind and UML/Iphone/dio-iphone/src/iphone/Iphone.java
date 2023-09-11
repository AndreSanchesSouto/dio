package iphone;

public class Iphone implements NavegadorNaInternet, ReprodutorMusical, AparelhoTelefonico {
	
	public static void main(String[] args) {
		
	}

	@Override
	public void ligar(String contato) {
		for(String c : listaContatos) {
			if(c.equals(contato)) {
				System.out.println("Ligando para "+contato);
				break;
			}
		}
		
	}

	@Override
	public void atender() {
		System.out.println("Chamada atendida");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Correio de voz iniciado");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música");
		
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		for(String m : listaMusica) {
			if(m.equals(musica)) {
				System.out.println("Tocando "+musica);
			}
		}
	}

	@Override
	public void exibirPaginas() {
		System.out.println("Exibindo páginas");
	}

	@Override
	public void adicionarPagina() {
		System.out.println("Adicionado páginas");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página exibida");
	}
	
}
