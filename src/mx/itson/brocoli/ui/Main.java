/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.brocoli.ui;

import java.util.Scanner;
import mx.itson.brocoli.negocio.Operacion;

/**
 *
 * @author adlemi
 */
public class Main {

    //private static String oracion;
    
    public static void main(String[] args) {
        
        System.out.println("Escribeel texto separar");
        
        Scanner scanner = new Scanner(System.in);
        String operacion = scanner.nextLine();
        String [] resultado = new Operacion().separar(operacion);
        for(String s: resultado){
            System.out.println(",");
        }
        }
     
    }
    

