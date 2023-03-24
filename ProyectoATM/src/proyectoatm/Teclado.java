/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoatm;

import java.util.Scanner;

/**
 *
 * @author Silvia Izabel
 */
public class Teclado {
    private Scanner scan;
    
    public Teclado (){
        scan = new Scanner(System.in);
        
    }
    
    public int recibirEntrada(){
        return scan.nextInt();
    }
}
