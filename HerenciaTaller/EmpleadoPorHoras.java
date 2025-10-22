class EmpleadoPorHoras extends Empleados {

    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, double sueldo, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, sueldo);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public String mostrarinfo() {
        return super.mostrarinfo() + ", Horas Trabajadas: " + horasTrabajadas + ", Tarifa por Hora: " + tarifaPorHora;
    }

    @Override
    public String calcularsueldo() {
        double sueldoTotal = horasTrabajadas * tarifaPorHora;
        return "El sueldo total por horas es: " + sueldoTotal;
    }
}