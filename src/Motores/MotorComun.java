/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motores;

import Interface.Motor;

/**
 *
 * @author suare
 */
public class MotorComun extends Motor{
    private String tipoDeMotor = "Paso a paso";
    public MotorComun(){
        super();
        System.out.println("Creado el motor comun de tipo "+tipoDeMotor);
    }  
    
    @Override
    public void encender() {
        System.out.println("encendido motor comun");
    }
    
    @Override
    public void acelerar() {
        System.out.println("acelerar el motor comun");
    }
    
    @Override
    public void apagar() {
        System.out.println("Apagar motor comun");
    }
}
