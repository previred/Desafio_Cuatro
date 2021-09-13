package maqueta;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class JsonVista implements Vista {

  private Logger logger = Logger.getLogger(getClass().getName());

  public void mostrar(Serializable serializable) {
    ObjectMapper om = new ObjectMapper();
    try {
      String s = om.writeValueAsString(serializable);
      System.out.printf("Modelo como JSON: %s", s);
    } catch (JsonProcessingException e) {
      logger.log(Level.SEVERE, "Error en serialización.", e);
    }
  }
}
