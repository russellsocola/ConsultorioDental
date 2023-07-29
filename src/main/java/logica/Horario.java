package logica;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horario implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_horario;
    private int horario_inicio;
    private int horario_fin;

    public Horario() {
    }

    public Horario(int id_horario, int horario_inicio, int horario_fin) {
        this.id_horario = id_horario;
        this.horario_inicio = horario_inicio;
        this.horario_fin = horario_fin;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public int getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(int horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public int getHorario_fin() {
        return horario_fin;
    }

    public void setHorario_fin(int horario_fin) {
        this.horario_fin = horario_fin;
    }
    
    
}
