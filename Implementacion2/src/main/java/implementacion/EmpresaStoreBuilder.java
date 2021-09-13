package implementacion;

import java.time.Instant;
import java.util.Date;

public class EmpresaStoreBuilder implements IStoreBuilder<Empresa> {

  @Override
  public Store createStore() {
    Store store = new Store();
    Date fecha1 = Date.from(Instant.parse("1995-10-23T10:12:35Z"));
    Persona persona1 = new Persona(1, "Juan","Antonio","Rojas","Sandoval",fecha1,"juan@gmail.com");

    Date fecha2 = Date.from(Instant.parse("1963-02-01T12:06:10Z"));
    Persona persona2 = new Persona(2, "Claudio","Jose","Aralla","Bellone",fecha2,"claudio@gmail.com");

    Date fecha3 = Date.from(Instant.parse("1970-08-01T04:11:11Z"));
    Persona persona3 = new Persona(3, "Jose","Alejandro","Ribera","Gonzalez",fecha3,"claudio@gmail.com");


    Empresa empresa1 = new Empresa(1,"Empresa 1");
    empresa1.addPersona(persona3);
    empresa1.addPersona(persona1);

    store.addEntity(empresa1);

    Empresa empresa2 = new Empresa(2,"Empresa 2");
    empresa2.addPersona(persona1);
    empresa2.addPersona(persona2);

    store.addEntity(empresa2);
    return store;
  }
}
