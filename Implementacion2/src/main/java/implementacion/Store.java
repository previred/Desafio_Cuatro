package implementacion;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;

/**
 * Clase creada solo para contener datos para el ejemplo
 * @author mgonzalez
 */
public class Store <T extends GenericEntity> {
    private final HashMap<Serializable, T> entities;

    public Store() {
        entities = new HashMap<>();
    }

    public void addEntity(T entity) {
        entities.put(entity.getId(), entity);
    }

    public T getEntity(Serializable idEntity) {
        return entities.get(idEntity);
    }

    public void deleteEntity(Serializable idEntity) {
        entities.remove(idEntity);
    }

    public Set<Serializable> getIds() {
        return entities.keySet();
    }
}
