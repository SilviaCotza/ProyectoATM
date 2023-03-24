/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoatm;

/**
 *
 * @author Silvia Izabel
 */
public class ATM {
    
    private Dispensador dispensadorObj;
    private Pantalla pantallaObj;
    private RanuraDeDeposito ranuraDeDepositoObj;
    private Teclado tecladoObj;
    
    public ATM(){
        this.dispensadorObj = new Dispensador();
        this.pantallaObj = new Pantalla();
        this.ranuraDeDepositoObj = new RanuraDeDeposito();
        this.tecladoObj = new Teclado();
        
        this.inicializar();       
    }
    
    private void inicializar(){
        int numeroDeCuenta;
        int numeroDeNip;
        
        pantallaObj.mostrarMensaje("Bienvenido\n");
        pantallaObj.mostrarMensaje("Ingrese su numero de cuenta");
        numeroDeCuenta = tecladoObj.recibirEntrada();
        System.out.println("El numero de cuenta ingresado es:"+numeroDeCuenta);
        
        pantallaObj.mostrarMensaje("Ingrese su numero de NIP");
        numeroDeNip = tecladoObj.recibirEntrada();
        System.out.println("El numero de NIP ingresado es:"+numeroDeNip);
        
        while(numeroDeNip!=12345)
        {
            System.out.println("El NIP ingresado es incorrecto\n");
            System.out.println("Ingrese el numero de NIP");
            numeroDeNip = tecladoObj.recibirEntrada();
        }
                
            System.out.println("El NIP ingresado es correcto");
            System.out.println("Elija una opcion");
            System.out.println("elija una opcion");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Ver saldo");
            
            int opcion = 0;
            opcion = tecladoObj.recibirEntrada();
        if (opcion==1)
                {
                    int monto;
                    System.out.println("Ingrese el monto a depositar");
                    monto = tecladoObj.recibirEntrada();
                }
        if (opcion == 2)
        {
                    System.out.println("Ingrese el monto a retirar");
        }
        if (opcion == 3)
        {
                    System.out.println("Su saldo es");
        }
        else
        {
                    System.out.println("La opción ingresada no es correcta");
        }
    }
    
    void depositar (int monto){}
    void acreditar (int monto){}
    void mostrarSaldo (int numeroDeCuenta){}
    void retirar (int monto){}
    void debitar (int monto){}
    boolean autenticar (int nip, int numeroDeCuenta){ return true;}
            
                     
            }
    

