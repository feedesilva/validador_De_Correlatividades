package domain;

import org.junit.Assert;
import org.junit.Test;

public class AlumnoTest {
    @Test
    public void materiaCorrTrue() {
        Alumno jose = new Alumno("jose", "208");
        Materia pdp = new Materia("pdp");
        Materia ssl = new Materia("ssl");
        jose.agregarMateriasAprobadas(ssl, pdp);
        Materia so = new Materia("sistemas Operativos");
        so.materiasCorrelativas(ssl, pdp);
        Materia ads = new Materia("ads");
        ads.materiasCorrelativas(pdp);
        Inscripcion insc = new Inscripcion(jose);
        insc.inscribirMaterias(so,ads);
        //Verifico inscripcion aprobada//
        Assert.assertEquals(true, insc.aprobada());
    }

    @Test
    public void materiaCorrFalse(){
        Alumno juan = new Alumno("juan", "369");
        Materia pdp = new Materia("pdp");
        Materia md = new Materia("matematica discreta");
        Materia ssl = new Materia("ssl");
        juan.agregarMateriasAprobadas(ssl,pdp);
        Materia so = new Materia("sistemas Operativos");
        so.materiasCorrelativas(ssl,pdp);
        Materia ads = new Materia("ads");
        ads.materiasCorrelativas(md);
        Inscripcion insc2 = new Inscripcion(juan);
        insc2.inscribirMaterias(so,ads);
        //Verifico que no se apruba la inscripcion por falta de correltivas en ADS//
        Assert.assertEquals(false,insc2.aprobada());
    }
}
