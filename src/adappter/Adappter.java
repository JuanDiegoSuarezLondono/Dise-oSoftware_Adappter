/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adappter;

/**
 *
 * @author suare
 */
public class Adappter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aplicacion adapter = new Aplicacion(1);        
        adapter.usarMotorComun();
        System.out.println("---------------------");
        adapter.usarMotorEconomico();
        System.out.println("---------------------");
        adapter.usarMotorElectrico();
    }        
}
