/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.brocoli.negocio;

/**
 * Contiene metodos para trabajar con tipos de dato String
 * @author adlemi
 */
public class Operacion {
    /**
     * Separa una cadena de texto a partir de la espresión guion medio.
     * @param valor
     * @return array de string en donde cada posicion representa unadivision de a cadena de texto
     */
  
    public String [] separar (String valor){
        String [] elementos = valor.split("-");
        return elementos;
        
    }
         
    }
            
    

