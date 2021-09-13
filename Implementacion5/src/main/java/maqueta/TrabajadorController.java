package maqueta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrabajadorController {

  @Autowired
  private TrabajadorDAO trabajadorDAO;

  public void addDireccion(Trabajador trabajador, Direccion direccion) {
    trabajador.addDireccion(direccion);
  }

  public void guardar(Trabajador trabajador) {
    this.trabajadorDAO.save(trabajador);
  }

  public void mostrarTrabajador(Integer rut, Vista vista) {
    Trabajador trabajador = trabajadorDAO.getTrabajador(rut);
    vista.mostrar(trabajador);
  }
}
