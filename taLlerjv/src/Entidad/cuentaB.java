
package Entidad;

//Definir
public class cuentaB {
    private int numCuenta;
    private long dniCliente;
    private int saldoActual;

     //Iniciar y dar valor.
    public cuentaB(int numCuenta, long dniCliente, int saldoActual) {
        this.numCuenta = numCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    
    public cuentaB() {
    }
    
    
    //Obtener y almacenar datos
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
}
