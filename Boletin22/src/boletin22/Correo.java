/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

/**
 *
 * @author finfanterodal
 */
public class Correo {
    //Atributos
    private String contido;
    private boolean check=false;
    //constructores

    public Correo() {
    }

    public Correo(String contido, boolean check) {
        this.contido = contido;
        this.check = check;
    }
    //Getters y Setters

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
    //ToString

    @Override
    public String toString() {
        return  "contido=" + contido + ", check=" + check;
    }
    
}
