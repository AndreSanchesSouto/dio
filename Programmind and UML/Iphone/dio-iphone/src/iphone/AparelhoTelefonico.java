package iphone;

import java.util.List;
import java.util.ArrayList;

public interface AparelhoTelefonico {
	
	public List<String> listaContatos = new ArrayList<>();
	public boolean emLigacao = false;
	public int pessoasEmEspera = 0;
	
	public void ligar(String contato);
	public void atender();
	public void iniciarCorreioDeVoz();
}
