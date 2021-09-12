package maqueta;

public interface TrabajadorDAO {
  void save(Trabajador trabajador);
  Trabajador getTrabajador(Integer rut);
}
