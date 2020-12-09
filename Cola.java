/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalso;

/**
 *
 * @author richardgarcia
 */
public class Cola {
    private Carro carro_inicio, carro_final;
	private Calle calle;
	public static final int espacio = 10;

	public Cola() {
		carro_inicio = null;
		carro_final = null;
		// Como no hay ningun parametro, no hay necesidad de un This.
	}

	public Cola(Calle calle) {
		super();
		this.calle = calle;
		this.carro_inicio = null;
		this.carro_final = null;
	}

	public Carro getCarro_inicio() {
		return carro_inicio;
	}

	public void setCarro_inicio(Carro carro_inicio) {
		this.carro_inicio = carro_inicio;
	}

	public Carro getCarro_final() {
		return carro_final;
	}

	public void setCarro_final(Carro carro_final) {
		this.carro_final = carro_final;
	}

	public Calle getCalle() {
		return calle;
	}

	public void setCalle(Calle calle) {
		this.calle = calle;
	}

	// **************************************************
	// Metodos Cola.
	// **************************************************

	// Cola vacia.
	boolean colaVaciaCarro() {
		if (carro_inicio == null) {
			return true;
		} else {
			return false;
		}
        }
}
