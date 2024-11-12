package udla.dmolina.herencia2;

public class Alumno extends Persona{
    private String carrera;
    /*private double notap1;
    private double notap2;
    private double notap3;*/

    /*public Alumno(){
    }*/
    //si se crea un constructor vacio y luego otro con parametros esto produce un error en un tema de herencia

    //se puede crear un constructor desde una base hija en este caso Alumno
    public Alumno (String nombre, String apellido){
        super(nombre,apellido);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /*public double getNotap1() {
        return notap1;
    }

    public void setNotap1(double notap1) {
        this.notap1 = notap1;
    }

    public double getNotap2() {
        return notap2;
    }

    public void setNotap2(double notap2) {
        this.notap2 = notap2;
    }

    public double getNotap3() {
        return notap3;
    }

    public void setNotap3(double notap3) {
        this.notap3 = notap3;
    }*/
}