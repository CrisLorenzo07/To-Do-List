package logica;

import java.util.ArrayList;

public class ListaDeTareas {

    private static ListaDeTareas instancia; //Atributo estatico, evita crear multiples instancias//
    private ArrayList<Tarea> listadoTareas;

    public static ListaDeTareas getInstancia() {
        if (instancia == null) {
            instancia = new ListaDeTareas();
        }
        return instancia;
    }

 ////////////*********************************/////////////
    
// ListaDeTareas: Gestionar un conjunto de tareas //
// listadoTareas: Colección de tareas //
    
    public ListaDeTareas() {
        listadoTareas = new ArrayList<>();
    }

    public ArrayList<Tarea> getListadoTareas() { //Metodo que devuelve todas las tareas//
        return listadoTareas;
    }

    public void setListadoTareas(ArrayList<Tarea> listadoTareas) { //Metodo que remplaza la lista de tareas que existe// Toma un nuevo ArrayList<Tarea> como parametro y lo asigna al atributo listadoTarea//
        this.listadoTareas = listadoTareas;
    }

   
    public void agregarTarea(Tarea tarea){ //Metodo para crear una nueva tarea//
        listadoTareas.add(tarea);
    }

    public ArrayList<Tarea> tareasPendientes(int i){ //Metodo que devuelve las tareas que estan aun pendientes//
        ArrayList<Tarea> pendiente = new ArrayList<>();
        for (Tarea tarea : listadoTareas){
            if (!tarea.isRealizada()) {
                pendiente.add(tarea);
            }
            
        }
        return pendiente;
    }
    
    public ArrayList<Tarea> tareasRealizadas(){ //Metodo que devuelve las tareas que estan realizadas//
        ArrayList<Tarea> realizada = new ArrayList<>();
        for (Tarea tarea : listadoTareas){
            if (tarea.isRealizada()) {
                realizada.add(tarea);
            }
        }
        return realizada;
    }

    public int tamanioTareas(){ //Metodo que devuelve el tamaño de la lista de tareas//
        return listadoTareas.size();
}    
    
}
