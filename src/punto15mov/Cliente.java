/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto15mov;

/**
 *
 * @author Santiago
 */
import java.util.Scanner;

public class Cliente extends Personal_data {
    
    private Scanner lector;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void Actualiazar_datos(){
        lector = new Scanner(System.in);
        System.out.println("Digite direccion: ");
        this.setDireccion(lector.next());
        System.out.println("Digite telefono: ");
        this.setTel(lector.next());
    }
    
    public void Consignar(){
        double saldo2;
        System.out.println("Digite el valor a consignar: ");
        lector = new Scanner(System.in);
        saldo2 = lector.nextDouble();
        saldo2=saldo2+getSaldo();
        setSaldo(saldo2);
    }
   
    public void Retirar(){
        double valor;
        System.out.println("Ingrese el valor a retirar: ");
        lector = new Scanner(System.in);
        valor = lector.nextDouble();
        setSaldo(getSaldo()-valor);
    }
  
    public void ConsultarS(){
        System.out.println("Su saldo es: "+getSaldo());
    }
    
    
    
}


///sqe-3@hotmail.com 
//stiven quintero