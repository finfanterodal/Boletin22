/*
a) int numeroDeCorreos(), que calcula cantos correos hai no buzon de correo
b) void engade (Correo c), que engade c ao buzon
c) boolean porLer(), que determina se quedan correos por ler
d) String amosaPrimerNoLeido(), que amostra o primeiro correo non lido
e) String amosa(int k), que amostra o correo k-ésimo, fora lido ou non
f) void elimina(int k), que elimina o correo k-ésimo.
 */
package boletin22;

import java.util.ArrayList;

/**
 *
 * @author finfanterodal
 */
public class Buzon {
    
public Buzon(ArrayList<Correo> lista) {
       
    }
//Métodos

    public void numeroDeCorreos(ArrayList<Correo> lista) {
        System.out.println("Número de correos: "+lista.size());
    }

    public void engade(ArrayList<Correo> lista,Correo c) {
        lista.add(c);
    }

    public boolean porLer(ArrayList<Correo> lista) {
        boolean comprobacion = true;
        for (Correo ele : lista) {
            if (ele.isCheck() == false) {
                comprobacion = false;
                return comprobacion;
            }
        }
        return comprobacion;
    }

    public String amosarPrimeroNoLeido(ArrayList<Correo> lista) {
        for (Correo ele : lista) {
            if (ele.isCheck() == false) {
                ele.setCheck(true);
                return ele.getContido();
            }
        }
        return "Non hay mensaxes por ler.";
    }

    public String amosar(ArrayList<Correo> lista, int numC) {
        return lista.get(numC - 1).getContido();
    }

    public void elimina(int numC, ArrayList<Correo> lista) {
        lista.remove(numC - 1);
    }
}
