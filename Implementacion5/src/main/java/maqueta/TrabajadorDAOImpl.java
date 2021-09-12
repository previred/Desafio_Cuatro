package maqueta;

import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

@Component
public class TrabajadorDAOImpl implements TrabajadorDAO {

  /*
  * Se utiliza un ConcurrentHashMap para evitar problemas de concurrencia al ser esta una única instancia de TrabajadorDAO
  * */
  private ConcurrentHashMap<Integer, Trabajador> map = new ConcurrentHashMap<>();

  @Override
  public void save(Trabajador trabajador) {
    map.putIfAbsent(trabajador.getRut(), trabajador);
  }

  @Override
  public Trabajador getTrabajador(Integer rut) {
    return map.get(rut);
  }
}
