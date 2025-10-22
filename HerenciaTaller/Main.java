class Main {
    public static void main(String[] args) {

        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("Juan", 3000, 500);
        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("Ana", 2000, 40, 25);

        // Info
        System.out.println(empleado1.mostrarinfo());
        System.out.println(empleado2.mostrarinfo());

        // Sueldo
        System.out.println(empleado1.calcularsueldo());
        System.out.println(empleado2.calcularsueldo());
    }
}
