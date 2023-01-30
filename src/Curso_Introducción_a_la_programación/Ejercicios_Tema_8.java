package Curso_Introducción_a_la_programación;

public class Ejercicios_Tema_8 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(23);
        persona.setNombre("Jaime");
        persona.setTelefono("+57 320 559 0364");

        System.out.println(persona.getEdad() + " " + persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}