package domain;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Alumno {
    private String nombre;
    private String legajo;
    public List<Materia> materiasAp;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public Alumno(String nombre, String legajo) {
        this.materiasAp = new ArrayList<>();
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public void agregarMateriasAprobadas(Materia ... materias){
        Collections.addAll(this.materiasAp, materias);
    }

    public Integer cantAprobadas(){
        return this.materiasAp.size();
    }



}
