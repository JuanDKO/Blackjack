package modelo;

import java.util.ArrayList;

import excepciones.NoHayMasCartasException;

public class Mano extends Mazo {

	public Mano() {
		this.cartas = new ArrayList<Carta>();
	}
	
	public int valorMano() {
		int valor=0;
		for (Carta carta : this.cartas) {
			valor=valor+carta.getValor();
		}
		return valor;
	}

	/**
	 *
	 * @return Cuando el valor de la mano es mayor a 21 se devuelve un boolean true que finaliza la partida
	 */
	public boolean finDeJuego() {
		if (this.valorMano()>=21) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String res="Valor de la Mano: "+this.valorMano()+"\n";
		res=res+super.toString();
		return res;
	}

	/**
	 *
	 * @param m Te trae la primera carta de una lista de cartas de el objeto mazo
	 * @throws NoHayMasCartasException si algo falla esta excepción se pasa al metodo de la clase mazo.
	 */
	public void pedirCarta(Mazo m) throws NoHayMasCartasException {
		Carta c = m.solicitarCarta();
		this.cartas.add(c);
	}
	
	
	
}
