/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.tienda.la.vagancia;

import java.util.Scanner;
import java.math.*;
/**
 *
 * @author Usuario
 */
public class ProyectoTiendaLaVagancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    double arroz, huevos, aceite, leche, azucar, panela;
    double cantidadarroz,totalarroz,cantidadhuevos,totalhuevos,
            cantidadleche,totalleche,cantidadaceite,totalaceite,
            cantidadazucar,totalazucar,cantidadpanela,totalpanela,x,numero ;
    double totalapagar, totalcondescuento;
    arroz=3000;
    huevos=1500;
    leche=2000;
    aceite=5000;
    azucar=4000;
    panela=8000;
   
    
    
    
    System.out.println("ingrese la cantidad arroz");
    Scanner leercantidadarroz=new Scanner (System.in);
    cantidadarroz=leercantidadarroz.nextDouble();
    totalarroz=cantidadarroz*arroz;
    
     System.out.println("ingrese la cantidad huevos");
    Scanner leercantidadhuevos=new Scanner (System.in);
    cantidadhuevos=leercantidadhuevos.nextDouble();
    totalhuevos=cantidadhuevos*huevos;
    
     System.out.println("ingrese la cantidad leche");
    Scanner leercantidadleche=new Scanner (System.in);
    cantidadleche=leercantidadleche.nextDouble();
    totalleche=cantidadleche*leche;
    
    System.out.println("ingrese la cantidad aceite");
    Scanner leercantidadaceite=new Scanner (System.in);
    cantidadaceite=leercantidadaceite.nextDouble();
    totalaceite=cantidadaceite*aceite;
    
    
     System.out.println("ingrese la cantidad azucar");
    Scanner leercantidadazucar=new Scanner (System.in);
    cantidadazucar=leercantidadazucar.nextDouble();
    totalazucar=cantidadazucar*azucar;
    
    
    System.out.println("ingrese la cantidad panela");
    Scanner leercantidadpanela=new Scanner (System.in);
    cantidadpanela=leercantidadpanela.nextDouble();
    totalpanela=cantidadpanela*panela;
    
    
    totalapagar=cantidadarroz+cantidadhuevos+cantidadleche+cantidadaceite+
            cantidadazucar+cantidadpanela;
    
    System.out.println("el resultado de totalapagar="+totalapagar);
  
    if (totalapagar>50000){
    System.out.println("participara en una rifa con un carro 0km y el valor de la compra es"+totalapagar);
    numero=22;
    
    x=(int)(Math.random()  *100 +1);
    System.out.println("el numero que salio es="+x);
    
    if (x==numero){
    System.out.println("Has ganado la rifa de un carro 0km");
    }
    else {
        System.out.println("no ganaste el carro sigue participando");
        
     }
   }
    else {  
    
      System.out.println("no participas en la rifa y el total a pagar es"+totalapagar);
        
        } 
    if (totalapagar>100000){
        totalcondescuento=totalapagar-(totalapagar*0.30);
    System.out.println("el total a pagar con descuento es"+totalcondescuento);
    }
    else{
    System.out.println("no recibio descuento por lo tanto el total es"+totalapagar);
    }        
 }
}