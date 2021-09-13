package maqueta;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Trabajador implements Serializable {

  private String nombre;
  private Integer rut;
  private List<Direccion> direcciones;


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Integer getRut() {
    return rut;
  }

  public void setRut(Integer rut) {
    this.rut = rut;
  }

  public List<Direccion> getDirecciones() {
    return direcciones;
  }

  public void addDireccion(Direccion direccion) {
    if (this.direcciones == null) {
      this.direcciones = new ArrayList();
    }

    this.direcciones.add(direccion);
   }

}
