package es.cj.clases;

public class Alumno {

	private Asignatura a1;
	private Asignatura a2;
	private Asignatura a3;
	
	public Alumno(Asignatura a1, Asignatura a2, Asignatura a3) {
		super();
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}
	
	public Alumno(int id1, int id2, int id3) {
		this.a1 = new Asignatura(id1);
		this.a2 = new Asignatura(id2);
		this.a3 = new Asignatura(id3);
	}

	public Asignatura getA1() {
		return a1;
	}

	public Asignatura getA2() {
		return a2;
	}

	public Asignatura getA3() {
		return a3;
	}

	@Override
	public String toString() {
		return "Alumno [a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + "]";
	}
}