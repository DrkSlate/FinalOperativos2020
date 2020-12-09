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
public class Interseccion {
    private Rectangle rectangle;
	private Calle calle_norte = null;
	private Calle calle_sur = null;
	private Calle calle_este = null;
	private Calle calle_oeste = null;
        private Calle calle_medio = null;

	public Interseccion() {
		
	}
	
	public Interseccion(Rectangle rectangle, Calle calle_norte, Calle calle_sur, Calle calle_este, Calle calle_oeste, Calle calle_medio) {
		super();
		this.rectangle = rectangle;
		this.calle_norte = calle_norte;
		this.calle_sur = calle_sur;
		this.calle_este = calle_este;
		this.calle_oeste = calle_oeste;
                this.calle_medio = calle_medio;
	}



	public Rectangle getRectangle() {
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	public Calle getCalle_norte() {
		return calle_norte;
	}

	public void setCalle_norte(Calle calle_norte) {
		this.calle_norte = calle_norte;
	}

	public Calle getCalle_sur() {
		return calle_sur;
	}

	public void setCalle_sur(Calle calle_sur) {
		this.calle_sur = calle_sur;
	}

	public Calle getCalle_este() {
		return calle_este;
	}

	public void setCalle_este(Calle calle_este) {
		this.calle_este = calle_este;
	}

	public Calle getCalle_oeste() {
		return calle_oeste;
	}

	public void setCalle_oeste(Calle calle_oeste) {
		this.calle_oeste = calle_oeste;
	}
        public Calle getCalle_Medio(){
            return calle_medio;
        }
        public void setCalle_medio(){
            this.calle_medio = calle_medio;
        }
}
