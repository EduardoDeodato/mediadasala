/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author senai
 */
public class médiadasala {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {

        int aprovado = 7;
        double somaDasNotas=0;
        double media = 0;
        int contador=0;
        double nota=0;
    Scanner entrada = new Scanner(System.in);     
    do{
            System.out.println("Digite sua nota");
      nota=entrada.nextDouble();
      contador=contador+1;
       somaDasNotas = somaDasNotas+nota;
        if(nota>=aprovado) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }while(nota<11);
     media = somaDasNotas/contador;
    System.out.println("A media é"+media);   
    }    
    }
        
         
       
      
    

  

 }
    

