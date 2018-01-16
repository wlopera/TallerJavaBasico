package com.pranical.clase;

public class MiClase {
	    public String nombre;
	    public int cedula;
	    public String telefono;
	    public String correo;
	    public String profesion;
	    
	    
	    public MiClase(String nombre, int cedula, String telefono, String correo, String profesion) {
			this.nombre = nombre;
			this.cedula = cedula;
			this.telefono = telefono;
			this.correo = correo;
			this.profesion = profesion;
		}

		public void imprimir(MiClase miClase) {
	        System.out.println("Nombre: \t"+ miClase.nombre);
	        System.out.println("Cédula: \t"+ miClase.cedula);
	        System.out.println("Teléfono: \t"+ miClase.telefono);
	        System.out.println("Correo: \t"+ miClase.correo);
	        System.out.println("Profesión: \t"+ miClase.profesion);
	    }
	    
	    public static void main(String[] ar) {
	    	MiClase miClase =new MiClase("William Lopera", 9232978, "0424-1621921", "william.lopera@pranical.com", "Ingeniero");
	        miClase.imprimir(miClase);
	    }
}
