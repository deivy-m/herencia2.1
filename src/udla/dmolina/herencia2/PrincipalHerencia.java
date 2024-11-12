package udla.dmolina.herencia2;

public class PrincipalHerencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        //Persona alumno = new Alumno();
        //esto pasa por la herencia
        //beneficio es que se hereda directamente

        Alumno alumno = new Alumno();
        alumno.setNombre("Julio");
        alumno.setApellido("Jaramillo");
        alumno.setCarrera("Ing. Software");
        alumno.setEdad(22);
        alumno.setNotap1(7D);
        System.out.println("Datos alumno: ");
        System.out.println("Nombre y apellido: " +alumno.getNombre()+ ""+ alumno.getApellido());

        AlumnoInt alumnoint = new AlumnoInt();



        /*alumno.setNotap2(8D);
        alumno.setNotap3(9D);*/
        //no se usa el protected por el principio de encapsulamiento


        Profesor profesor = new Profesor();
    }
}