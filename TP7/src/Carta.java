
public class Carta {
	int valor;
	String palo;
	
	public boolean valorEsSuperior(Carta carta) {
		return this.valor > carta.valor;
	}
	public boolean mismoPalo(Carta carta) {
		return this.palo == carta.palo;
	}
}
