package implementacion;

import java.io.Serializable;

/**
 * Clase genérica utilizada para representar una entidad con un id asociado
 * @param <S>
 */
public abstract class GenericEntity<S extends Serializable> {
  private S id;

  protected GenericEntity(S id) {
    this.id = id;
  }

  public S getId() {
    return id;
  }

  public abstract String displayEntity();
}
