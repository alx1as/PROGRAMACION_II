/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author alexia
 */
public class CuentaBancaria {
    private int cbu, saldo;
    private ClaveSeguridad clave;
    private Titular titular;
    public CuentaBancaria(int cbu, int saldo, ClaveSeguridad clave) {
        this.cbu=cbu;
        this.saldo=saldo;
        this.clave=clave; //Cuenta bancaria contiene a clave.
    }

    public int getCbu() {
        return cbu;
    }

    public int getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }
    
   //asociacion bidireccional
   public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }
    
    public void mostrar() {
    System.out.println("CUENTA BANCARIA");
    System.out.println("CBU: " + cbu);
    System.out.println("Saldo: $" + saldo);
    System.out.println("Clave: " + clave.getCodigo() + " (última modificación: " + clave.getUltimaModificacion() + ")");
    
    if (titular != null) {
        System.out.println("Titular: " + titular.getNombre() + " - DNI: " + titular.getDni());
    } else {
        System.out.println("Titular no asignado");
    }
}

    
}
