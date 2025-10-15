public class Principal {
    public static void main(String[] args) {

        // Crear cuenta con constructor por defecto
        CuentaBancaria c1 = new CuentaBancaria();
        c1.mostrarInfo();

        System.out.println();

        // Crear cuenta con constructor parametrizado
        CuentaBancaria c2 = new CuentaBancaria("Juan Pérez", "123456", 1000);
        c2.mostrarInfo();

        System.out.println("\n--- Operaciones ---");
        c2.depositar(500); // debería sumar
        c2.retirar(300);   // debería restar
        c2.retirar(2000);  // no debería permitir
        c2.mostrarInfo();
    }
}
