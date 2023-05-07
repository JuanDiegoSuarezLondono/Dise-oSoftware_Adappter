/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adappter;

import Interface.*;
import Motores.*;

/**
 *
 * @author suare
 */
public class Aplicacion {
    private int numeroDeAplicacion;
    
    public Aplicacion(int myNumeroDeAplicacion) {
        numeroDeAplicacion = myNumeroDeAplicacion;
        System.out.println("Aplicacion numero "+numeroDeAplicacion+"\n");
    }

    public void usarMotorComun() {
        Motor motor = new MotorEconomico();
        motor = new MotorComun();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
 
    public void usarMotorElectrico() {
        Motor motor = new MotorElectricoAdapter() ;
        motor.encender();
        motor.acelerar();
        motor.apagar();  
    }
 
    public void usarMotorEconomico() {
        Motor motor = new MotorEconomico();
        motor.encender();
        motor.acelerar();
        motor.apagar();  
    }
}