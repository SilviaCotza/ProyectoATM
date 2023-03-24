/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoatm;

/**
 *
 * @author Silvia Izabel
 */
public class Cuenta {
    private float saldo;
    private int numeroDeCuenta;
    private int nip;
    Cliente clienteObj;

    public Cuenta() {
        System.out.println("Se crea nueva cuenta.");
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        if (numeroDeCuenta > 9999 && numeroDeCuenta < 100000) {
            this.numeroDeCuenta = numeroDeCuenta;
        }
        
        else {
            System.out.println("Ingrese un numero de cuenta válido.");
        }
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public Cliente getClienteObj() {
        return clienteObj;
    }

    public void setClienteObj(Cliente clienteObj) {
        this.clienteObj = clienteObj;
    }
      public void acreditar(int monto) { }
    public void debitar(int monto) { }
    public float consultar(int numeroDeCuenta) {
        System.out.println("Se invoca a consulta(int)");
        return 0.0f; 
    }
    public void consultar() {
        System.out.println("Se invoca a consultar()");
    }

    public void consultar(String nombre, int monto) {
        System.out.println("Se invoca a consultar(String, int)");
    }
    
    public void consultar(Transaccion transaccionObj) {
        transaccionObj.ejecutar();
    }
            
}
