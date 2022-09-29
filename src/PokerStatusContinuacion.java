import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PokerStatusContinuacion {
	public String verificarJugada(String c1, String c2, String c3, String c4, String c5) {
		if(this.verificarColor(c1, c2, c3, c4, c5)) {
			return "Color";
		} else if(this.verificarTrio(c1, c2, c3, c4, c5)) {
			return "Trio";
		} else if(this.verificarPoker(c1, c2, c3, c4, c5)) {
			return "Poker";
		} else {
			return "Nada";
		}
	}
	public boolean verificarColor(String c1, String c2, String c3, String c4, String c5) {
		List <String> mano = Arrays.asList(c1, c2, c3, c4, c5);
		int repeticiones1 = Collections.frequency(this.valoresDeCartas(mano), this.colorCarta(c1));
		return repeticiones1 == 5;
	}
	public boolean verificarTrio(String c1, String c2, String c3, String c4, String c5) {
		List <String> mano = Arrays.asList(c1, c2, c3, c4, c5);
		int repeticiones1 = Collections.frequency(this.valoresDeCartas(mano), this.valorCarta(c1));
		int repeticiones2 = Collections.frequency(this.valoresDeCartas(mano), this.valorCarta(c2));
		int repeticiones3 = Collections.frequency(this.valoresDeCartas(mano), this.valorCarta(c3));
		return repeticiones1 == 3 || repeticiones2 == 3 || repeticiones3 == 3 ;
	}
	public boolean verificarPoker(String c1, String c2, String c3, String c4, String c5) {
		List <String> mano = Arrays.asList(c1, c2, c3, c4, c5);
		int repeticiones1 = Collections.frequency(this.valoresDeCartas(mano), this.valorCarta(c1));
		int repeticiones2 = Collections.frequency(this.valoresDeCartas(mano), this.valorCarta(c2));
		return repeticiones1 >= 4 || repeticiones2 >= 4;
	}
	public String valorCarta(String carta) {
		return carta.substring(0, (carta.length()-2));
	}
	public List<String> valoresDeCartas(List<String> mano){
		return mano.stream().map(c -> this.valorCarta(c)).toList();
	}
	public String colorCarta(String carta) {
		return carta.substring(carta.length()-1);
	}
	public List<String> coloresDeCartas(List<String> mano) {
        List<String> colores = new ArrayList<String>();
		for (String carta : mano) {
			colores.add(this.colorCarta(carta));
		}
		return colores;
	}
}
