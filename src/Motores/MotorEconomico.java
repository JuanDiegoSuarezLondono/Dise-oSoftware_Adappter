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
public class MotorEconomico extends Motor{
    private int ahorro=20000;
    public MotorEconomico(){
        super();
        System.out.println("Creando el motor economico con ahorro de "+ahorro);        
    }
 
    @Override
    public void encender() {
        System.out.println("encendiendo motor economico");
    }
 
    @Override
    public void acelerar() {
        System.out.println("acelerando el motor economico");
    }
 
    @Override
    public void apagar() {
        System.out.println("Apagando motor economico");
    }
}
