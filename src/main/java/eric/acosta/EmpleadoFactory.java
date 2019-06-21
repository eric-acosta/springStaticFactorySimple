package eric.acosta;

public class EmpleadoFactory {
	private EmpleadoFactory() {}
	
	public static Empleado crearEmpleado(String area) {
		Empleado emp = new Empleado();
		if("admin".equalsIgnoreCase(area)) {
			emp.setArea(area);
			emp.setEdad(11);
			emp.setNombre("administrador de sistemas");
		}
		else if("program".equalsIgnoreCase(area)) {
			emp.setArea(area);
			emp.setEdad(11);
			emp.setNombre("programador de sistemas");
		}
		else throw new RuntimeException();
		
		return emp;
	}

}
