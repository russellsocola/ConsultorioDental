package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable{
    
    //private int id_paciente;
    private boolean tiene_SIS;
    private String tipoSangre;
    @OneToOne
    private Responsable unResponsable;
    @OneToMany(mappedBy="pacien")
    private List<Turno> listaTurnos;
    
    public Paciente() {
    }

    public Paciente(boolean tiene_SIS, String tipoSangre, Responsable unResponsable, List<Turno> listaTurnos) {
        this.tiene_SIS = tiene_SIS;
        this.tipoSangre = tipoSangre;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }

    
    /*public Paciente(int id_paciente, boolean tiene_SIS, String tipoSangre, Responsable unResponsable, List<Turno> listaTurnos, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.id_paciente = id_paciente;
        this.tiene_SIS = tiene_SIS;
        this.tipoSangre = tipoSangre;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }*/

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    /*public int getId_paciente() {
        return id_paciente;
    }*/

    /*public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }*/

    public boolean isTiene_SIS() {
        return tiene_SIS;
    }

    public void setTiene_SIS(boolean tiene_SIS) {
        this.tiene_SIS = tiene_SIS;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    
    
}
