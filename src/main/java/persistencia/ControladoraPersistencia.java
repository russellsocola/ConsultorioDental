package persistencia;

import logica.Usuario;

public class ControladoraPersistencia {
    HorarioJpaController horaJpa = new HorarioJpaController();
    OdontologoJpaController odontoJpa = new OdontologoJpaController();
    PacienteJpaController pacJpa= new PacienteJpaController();
    PersonaJpaController persJpa = new PersonaJpaController();
    SecretarioJpaController secreJpa = new SecretarioJpaController();
    TurnoJpaController turnoJpa= new TurnoJpaController();
    UsuarioJpaController usuJpa= new UsuarioJpaController();

    public ControladoraPersistencia() {
    }

    
    public void crearUsuario(Usuario usu) {
        
        usuJpa.create(usu);
    }
    
}
