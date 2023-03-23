/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros.par.java;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class NumerosParJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //escribimos la clase 
        Scanner sc=new Scanner(System.in);
        int contImpar = 0;
        int contPar= 0;
        int sumaPar=0;
        String resp;
        do{
            System.out.println("INGRESAR NUMERO");
            int num= sc.nextInt();
            sc.nextLine();
            if(num%2==1){
              contImpar++;
            }else{
              contPar++;
              sumaPar = sumaPar+num;
            }
            System.out.print("desea continuar?");
            resp=sc.nextLine();
        }while(resp.equals("si"));
        System.out.println("la cantidad de pares es: "+contPar);
        System.out.println("la cantidad de impares es: "+contImpar);
        System.out.println("la suma de pares es: "+sumaPar);
         }
}