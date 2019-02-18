/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Boletin22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de ArrayList   
        ArrayList<Correo> lista= new ArrayList<>();
        //
        Buzon buzon=new Buzon(lista);
        //
        String opcion;                                                                                                                                                      
        do {
            opcion = JOptionPane.showInputDialog("Menu\n" + "1.Engadir elemento.\n" + "2.Número total de correos\n" + "3. Amosar o correo elixido.   .\n" + "4.Amosar o primeiro non lido.\n" + "5.Número de correos sin leer.\n"+"6.Eliminar Correo\n" +"8.Salir.");
            switch (opcion) {
                case "1":
                    boolean defecto=false;
                    Correo c=new Correo(JOptionPane.showInputDialog("Escriba o contido do email."),defecto);
                    buzon.engade(lista, c);
                    break;
                case "2":
                    buzon.numeroDeCorreos(lista);
                    break;

                case "3":
                    System.out.println(buzon.amosar(lista, Integer.parseInt(JOptionPane.showInputDialog("Correo a borrar."))));
                    break;

                case "4":
                   System.out.println(buzon.amosarPrimeroNoLeido(lista));
                    break;
                case "5":                   
                  if(buzon.porLer(lista)) {
                       System.out.println("Non hay correos por ler.");
                  }else{
                      System.out.println("Quedan correos por ler.");
                  }
                    break;
                case "6":
                   buzon.elimina(Integer.parseInt(JOptionPane.showInputDialog("Correo a borrar.")), lista);
                    break;
                case "8":

                    //0
                    System.exit(0);
                default:
                    System.out.println("Opción inexistente.");

            }

        } while (!"8".equals(opcion));
    }
    
}
