/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n1, n2;
        int op;
        float res=0;
        
        System.out.println("Por favor, ingrese el primer numero: ");
	n1 =Integer.parseInt(stdin.nextLine());
	System.out.println("Por favor, ingrese el segundo numero: ");
	n2 =Integer.parseInt(stdin.nextLine());
        
        System.out.println ("ingrese La operacion deseada"
                + " 1 suma "
                + "2 resta "
                + "3 multiplicacion "
                + "4 division ");
        op=stdin.nextInt ();
        
        switch (op)
        {
            case 1:
                System.out.println ("Usted a elegido suma");
                res=n1+n2;
                System.out.println("el resultado es:" +res);
                break;
            
            case 2:
                System.out.println ("Usted a elegido resta");
                res=n1-n2;
                System.out.println("el resultado es:" +res);
                break;
            
            case 3:
                System.out.println ("usted a elegido multiplicacion");
                res=n1*n2;
                System.out.println("el resultado es:" +res);
                break;
               
            case 4:
                System.out.println ("usted a elegido  division");
                res=n1/n2;
                System.out.println("el resultado es:" +res);
                break;    
        }
        
        
		
    
		
	}
    }
    

