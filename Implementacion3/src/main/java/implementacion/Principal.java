package implementacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mgonzalez
 */
public class Principal {
    private final static Logger LOGGER = Logger.getLogger(ImplementaPatron.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clasificador clasificador = new Clasificador();
        
        LOGGER.log(Level.INFO, "Joven = {0}", clasificador.getClasificacion(TipoClasificacionEnum.JOVEN).getDetalle());
    }
    
}
