/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class Exer10 {
    
    public static void main(String[]args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com um numero:");
        double num=scan.nextDouble();
        
        double triplo= Math.pow(num, 3);
        
        System.out.println("O valor do triplo é :" +triplo);
        
        
    }
    
}
