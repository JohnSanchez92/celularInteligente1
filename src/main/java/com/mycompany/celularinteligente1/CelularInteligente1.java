
package com.mycompany.celularinteligente1;

/**
 *
 * @author JHON SANCHEZ
 */
public class CelularInteligente1{
public float tamaño;
    public String marca;
    public String color;
    public int ram;
    public float procesador;   

public CelularInteligente1(float tamaño, String marca, String color, int ram, float procesador){
  this.tamaño = tamaño;
  this.marca = marca;
  this.color = color;
  this.ram = ram;
  this.procesador = procesador;
  
  
}  
    public static void main(String[] args) {
    CelularInteligente1 celular1 = new CelularInteligente1(16.5f, "Redmin", "Azul", 4, 2.5f);  
    System.out.println("Tamaño del celular:" + celular1.tamaño + "\n Marca del celular: " + celular1.marca + "\n Color del celular: " + celular1.color + "\n Ram: " + celular1.ram +"GB"+ "\n Procesador: " + celular1.procesador + "Gz");
        
    }
  
}
