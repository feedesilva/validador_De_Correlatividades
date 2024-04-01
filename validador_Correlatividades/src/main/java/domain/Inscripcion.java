package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Inscripcion(Alumno alumno) {
        this.materias = new ArrayList<>();
        this.alumno = alumno;
    }

    public void inscribirMaterias(Materia ... materiasInscribir){
        Collections.addAll(materias, materiasInscribir);
    }

    public boolean aprobada(){
         return this.materias.stream().allMatch((materia -> materia.cumpleCorrelativas(this.alumno)));
    }
}
