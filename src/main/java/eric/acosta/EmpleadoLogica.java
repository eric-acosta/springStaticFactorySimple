package eric.acosta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpleadoLogica {
	public static void main(String args[]) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Empleado empleado = (Empleado)applicationContext.getBean("empleado");
		System.out.println(empleado);
	}

}
