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
public class Personal_data {
    
    private Scanner lector;
    private String nombre, apellido, edad, cedula, fecha, direccion, tel;
    
    public void Load_Data(){
        lector = new Scanner (System.in);
        System.out.println("Digite el nombre: ");
        nombre = lector.next();
        System.out.println("Digite el apellido: ");
        apellido = lector.next();
        System.out.println("Digite la edad: ");
        edad = lector.next();
        System.out.println("Digite la cedula: ");
        cedula = lector.next();
        System.out.println("Digite la fecha de nacimiento: ");
        fecha = lector.next();
        System.out.println("Digite la direccion: ");
        direccion = lector.next();
        System.out.println("Digite el telefono: ");
        tel = lector.next();    
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public void Show_Data(){
        System.out.println("Nombre: "+nombre+
                "\nApellido: "+apellido+
                "\nEdad: "+edad+
                "\nCedula: "+cedula+
                "\nFecha de nacimiento: "+fecha+
                "\nDireccion: "+direccion+
                "\nTelefono: "+tel);
    }
    
}
