class Empleados {
    protected String nombre;
    protected double sueldo;

    public Empleados(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String mostrarinfo(){
        return "Nombre: " + nombre + ", Sueldo: " + sueldo;
    }

    public String calcularsueldo(){
        return "El sueldo es: " + sueldo;
    }
}
