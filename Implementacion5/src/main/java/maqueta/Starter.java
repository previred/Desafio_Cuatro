package maqueta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "maqueta")
@Configuration
public class Starter {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Starter.class);
    TrabajadorController controller = context.getBean(TrabajadorController.class);

    Direccion direccion = new Direccion();
    direccion.setCalle("Av. Principal");
    direccion.setNro(1234);
    direccion.setDepto("A");

    Trabajador trabajador = new Trabajador();
    trabajador.setRut(1);
    trabajador.setNombre("Cristian");
    trabajador.addDireccion(direccion);
    controller.guardar(trabajador);

    Vista vista = context.getBean(Vista.class);
    controller.mostrarTrabajador(1, vista);
  }
}
