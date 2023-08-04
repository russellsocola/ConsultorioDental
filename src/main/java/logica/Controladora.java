package logica;

import persistencia.ControladoraPersistencia;

public class Controladora {
ControladoraPersistencia controlPersis = new ControladoraPersistencia();    

public void crearUsuario(String nombreUsuario, String contrasena, String rol){
 Usuario usu = new Usuario();
 usu.setNombreUsuario(nombreUsuario);
 usu.setContrasenia(contrasena);
 usu.setRol(rol);
 controlPersis.crearUsuario(usu);
}
}
