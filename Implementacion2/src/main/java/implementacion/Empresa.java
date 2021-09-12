package implementacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mgonzalez
 */
public class Empresa extends GenericEntity<Integer> {

    private String nombre;
    private List<Persona> personas;
    
    /**
     * @param nombre
     * @param id
     */
    public Empresa(int id, String nombre) {
        super(id);
        this.nombre = nombre;
        personas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void addPersona(Persona persona) {
        personas.add(persona);
    }

    @Override
    public String displayEntity() {
        return nombre;
    }
}
