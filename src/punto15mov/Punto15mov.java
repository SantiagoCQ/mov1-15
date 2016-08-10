/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto15mov;
import java.util.Scanner;
/**
 *
 * @author Santiago
 */
public class Punto15mov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner (System.in);
        
        Cliente client = new Cliente();
        client.Load_Data();
        int opcion;
        
        do{
        System.out.println("Digite una opcion: ");
        System.out.println("1. Consignar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Actualizar datos");
        System.out.println("5. Consultar datos");
        System.out.println("0. Salir");
        opcion = lector.nextInt();
        switch (opcion){
            case 1: client.Consignar();
                break;
            case 2: client.Retirar();
                break;
            case 3: client.ConsultarS();
                break;
            case 4: client.Actualiazar_datos();
                break;
            case 5: client.Show_Data();
                break;
            }
        }while(opcion!=0);
    }
}
