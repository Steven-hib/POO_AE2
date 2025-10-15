// Explicacion:
/** El codigo esta con estas 3 cosas
 * - El nombre del titular
 * - El numero de Cuenta
 * - El saldo
 * 
 * Los atributos estas privados y se acceden con get y set 
 * 
 * Deposita - Suma dinero si lo que tiene es mayor que 0
 * Retirar - resta dinero si se puede
 */


 // Clase CuentaBancaria
public class CuentaBancaria {
    
    // Atributos (privados)
    private String titular;
    private String numeroCuenta;
    private double saldo;

    // Constructor por defecto (sin parámetros)
    public CuentaBancaria() {
        titular = "Sin nombre";
        numeroCuenta = "000000";
        saldo = 0;
    }

    // Constructor con parámetros
    public CuentaBancaria(String t, String n, double s) {
        titular = t;
        numeroCuenta = n;
        if (s >= 0) {
            saldo = s;
        } else {
            saldo = 0;
        }
    }

    // Métodos get y set
    public String getTitular() {
        return titular;
    }

    public void setTitular(String t) {
        titular = t;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String n) {
        numeroCuenta = n;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
        } else {
            System.out.println("El monto debe ser mayor a 0");
        }
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo = saldo - monto;
        } else {
            System.out.println("No se puede retirar ese monto");
        }
    }

    // Método para mostrar la información
    public void mostrarInfo() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }
}
