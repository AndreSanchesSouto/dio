package iphone;

import java.util.List;
import java.util.ArrayList;

public interface ReprodutorMusical {
	
	public List<String> listaMusica = new ArrayList<>();
	public boolean tocando = false;
	
	public void tocar();
	public void pausar();
	public void selecionarMusica(String musica);
	
}
