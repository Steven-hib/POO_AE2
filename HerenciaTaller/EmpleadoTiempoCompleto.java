
public class EmpleadoTiempoCompleto extends Empleados {

    private double bonificacion;

    public EmpleadoTiempoCompleto(String nombre, double sueldo, double bonificacion) {
        super(nombre, sueldo);
        this.bonificacion = bonificacion;
    }

    @Override
    public String mostrarinfo() {
        return super.mostrarinfo() + ", Bonificación: " + bonificacion;
    }

    @Override
    public String calcularsueldo() {
        return "El sueldo total es: " + (getSueldo() + bonificacion);
    }
}