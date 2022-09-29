import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PokerStatus {
	
	public boolean verificar(String c1, String c2, String c3, String c4, String c5) {
		List <String> mano = Arrays.asList(c1, c2, c3, c4, c5);
		int repeticiones1 = Collections.frequency(mano, this.valorCarta(c1));
		int repeticiones2 = Collections.frequency(mano, this.valorCarta(c2));
		return repeticiones1 >= 4 || repeticiones2 >= 4;
	}
	public String valorCarta(String carta) {
		return carta.substring(0, (carta.length()-1));
	}
	public List<String> valoresDeCartas(String c1, String c2, String c3, String c4, String c5){
		List<String> mano = Arrays.asList(c1, c2, c3, c4, c5);
		return mano.stream().map(c -> this.valorCarta(c)).toList();
	}
}
