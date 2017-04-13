/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemexep;

/**
 *
 * @author Dizma
 */
public class Ejemexep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            Alumno alu1 = new Alumno("Marcos", "Fernandez", -2);
        } catch (InvalidYearException e) {
            System.out.println("Se atrapo una excepcion del tipo InvalidYearException");
            System.out.println(e.getMessage());
            //JOptionPane.showMessageDialog(null,e.getMessage());
        }    }
}
