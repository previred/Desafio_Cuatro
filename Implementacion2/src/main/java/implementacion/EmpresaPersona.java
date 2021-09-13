package implementacion;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author mgonzalez
 */
public class EmpresaPersona {

    private Store<Empresa> empresasStore;

    public EmpresaPersona(Store<Empresa> empresasStore) {
        this.empresasStore = empresasStore;
    }

    /**
     * Retorna la lista de empleados de una empresa por su id
     * @param idEmpresa id de la empresa
     * @return Lista de string con los nombres de las personas
     */
    public List<String> personasEmpresa(int idEmpresa) {
        Empresa empresa = empresasStore.getEntity(idEmpresa);
        return empresa.getPersonas().stream().map(p -> p.displayEntity()).collect(Collectors.toList());
    }
    
    /**
     * Retorna la lista completa de id's de empresas
     * @return Lista de idis de empresas
     */
    public List<Integer> empresasId(){
        return empresasStore.getIds().stream().map(m -> (Integer) m).collect(Collectors.toList());
    }
}
