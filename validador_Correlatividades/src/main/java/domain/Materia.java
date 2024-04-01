package domain;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia(String nombre) {
        this.correlativas = new ArrayList<>();
        this.nombre = nombre;
    }

    public Boolean cumpleCorrelativas(Alumno alumno){
        return alumno.materiasAp.containsAll(this.correlativas);
    }
    //Verifico que una materia cumple correlativas//

    //auxiliar functions//
    public void materiasCorrelativas(Materia ... materias){
        Collections.addAll(this.correlativas, materias);
    }

    public  Integer cantMateriasCorrelativas(){
        return this.correlativas.size();
    }






}
