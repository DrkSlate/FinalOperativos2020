/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalso;
import java.awt.Rectangle;

/**
 *
 * @author richardgarcia
 */
public class Carro {
    private Rectangle rectangle;
	private int estado = 1; // 1: Avanzando y 0: Detenido.
	private Calle calle;
//	private Carro carro_siguiente_adelante = null;
//	private Carro carro_siguiente_atras = null;

	public Carro() {

	}

	public Carro(Rectangle rectangle, int estado) {
		super();
		this.rectangle = rectangle;
		this.estado = estado;
	}
	
	

	public Carro(Rectangle rectangle, int estado, Calle calle) {
		super();
		this.rectangle = rectangle;
		this.estado = estado;
		this.calle = calle;
	}
	
	
	

	public Calle getCalle() {
		return calle;
	}

	public void setCalle(Calle calle) {
		this.calle = calle;
	}

	public Rectangle getRectangle() {
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
