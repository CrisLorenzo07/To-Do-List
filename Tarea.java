
package logica;

import java.util.ArrayList;


public class Tarea {
    private String nombre;
    private String direccion;
    private String telefono; 
    private String descripcion;
    private int prioridad; //1,2,3,4,5//
    private boolean realizada; //Estados: Realizados o no Realizado//
    private Persona asignada; // Estados: Asignado o no Asignado//
    private ArrayList<Tarea>Subtareas; //SubTareas dentro de las Tareas//

    public Tarea(){
}
    
    public Tarea(String nombre, String direccion, String telefono, String descripcion, int prioridad, boolean realizada, Persona asignada, ArrayList<Tarea> Subtareas) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.realizada = realizada;
        this.asignada = asignada;
        this.Subtareas = new ArrayList<>();
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    
    public boolean isRealizada() { //Metodo que indica si la tarea ya fue realizada//
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public Persona getAsignada() { //Metodo para asignar una persona a la tarea//
        return asignada;
    }

    public void setAsignada(Persona asignada) { //Metodo para obtener la persona que esta asignada//
        this.asignada = asignada;
    }

    public ArrayList<Tarea> getSubtareas() {
        return Subtareas;
    }

    public void setSubtareas(ArrayList<Tarea> Subtareas) {
        this.Subtareas = Subtareas;
    }
    
    ////////********************///////////////
    
    public void tareaRealizada(){
        this.realizada = true; //Metodo para marcar la tarea como realizada//
    }
    
}
