
package Servicios;

import Entidad.cuentaB;
import java.util.Scanner;

//Donde se hace todas las operaciones y peticiones del usuario.
    public class servicio {
    Scanner leer = new Scanner(System.in);
    cuentaB cuen = new cuentaB();
       
    //Petición de valores
    //Aqui se hacen todas las operaciones que necesite el usuario.
    public void crearCuenta(){
    System.out.println("Información sobre la cuenta");
    System.out.println("Ingresar numero de cuenta");
    cuen.setNumCuenta(leer.nextInt());
    System.out.println("Ingresar el DNI");
    cuen.setDniCliente(leer.nextLong());
    System.out.println("Estado actual de cuenta");
    cuen.setSaldoActual(leer.nextInt());
    }//Fin void

    //Sumar valores.
    public void ingresar(){
    System.out.println("Ingresar cuanto desea consignar");
    int ingreso = leer.nextInt();
    int actual = cuen.getSaldoActual();
    int envio = ingreso+actual;
    System.out.println("Valor"+envio);
    }//Fin void

    //Restar valores.
    public void retiro(){
    System.out.println("Cuanto desea retirar");
    int retiro =leer.nextInt();
    int actua = cuen.getSaldoActual();
    int resta = (actua-retiro);
    if (resta > actua){
        System.out.println("No es posible hacer la petición");
    }else{
        System.out.println("Retiro exitoso");
        }
    }//Fin void

    //Sacar hasta cierto punto el dinero.
    public void expressRapido(){
        System.out.println("Cuanto desea retirar por este medio");
        int retiro = leer.nextInt();
        int actu = cuen.getSaldoActual();
        double porcentaje = (actu*0.20)/100;
        if (retiro > porcentaje){
            System.out.println("No puede retirar mas del 20%");
        }else{
            System.out.println("Retiro exitoso"+porcentaje);
        }
    
    }//Fin void
    
    //Ver saldo
    public void consultarSaldo(){
        int estado = cuen.getSaldoActual();
        System.out.println("El estado es:"+estado);
    }//Fin void
    
    //Que el usuario vea como esta su estado.
    public void consultarDatos(){
        long DNI = cuen.getDniCliente();
        int saldoActual = cuen.getSaldoActual();
        int numCuenta = cuen.getNumCuenta();
            System.out.println("Información de cuenta");
            System.out.println("");
            System.out.println("Su DNT es:"+DNI);
            System.out.println("Su saldo es:"+saldoActual);
            System.out.println("Su cuenta es:"+numCuenta);
    
    }//Fin void
}