
package tallerjv;

import Servicios.servicio;


public class TaLlerjv {

    //Vista
    //Aqui el usuario ve sus peticiones.
    public static void main(String[] args) {
        servicio ser = new servicio();
        ser.crearCuenta();
        ser.ingresar();
        ser.retiro();
        ser.expressRapido();
        ser.consultarSaldo();
        ser.consultarDatos();
    }
}
