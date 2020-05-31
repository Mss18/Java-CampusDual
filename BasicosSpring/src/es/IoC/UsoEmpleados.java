package es.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
//		Empleados jefeUno = new DirectorEmpleado();
//		
//		System.out.println(jefeUno.getTareas());
		
		// Creación del contexto
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados Martin = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Martin.getTareas());
		
		System.out.println(Martin.getInforme());
		
		contexto.close();

	}

}
