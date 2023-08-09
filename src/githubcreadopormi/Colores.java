/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubcreadopormi;

/**
 *
 * @author Nata
 */
public class Colores {
    
    private int cantColores;

    public Colores(int cantColores) {
        this.cantColores = cantColores;
    }

    public int getCantColores() {
        return cantColores;
    }

    public void setCantColores(int cantColores) {
        this.cantColores = cantColores;
    }
    public void pintar() {
    if (cantColores!=0){
                System.out.println("hay colores para pintar");
    } else
        if (cantColores==0){
            System.out.println("no hay colores para pintar");
        }
}
}
