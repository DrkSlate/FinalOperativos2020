/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalso;
import javax.swing.JFrame;
/**
 *
 * @author richardgarcia
 */
public class ProyectoFinalSO extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                ProyectoFinalSO frame = new ProyectoFinalSO();
		SwingSimulacion panel_simulacion = new SwingSimulacion();
		ThreadCarros hilo = new ThreadCarros(panel_simulacion);
		hilo.start();
		
		frame.add(panel_simulacion);
		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        public ProyectoFinalSO() {
		initUI();
	}

	private void initUI() {

	}

    
    
}
