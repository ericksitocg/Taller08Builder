package emsamablajecomputadoras.creacional;

public abstract class ConstructorComputadora {
	protected Computador computador;
	public void nuevo() {
		computador = new Computador();
	}
	public Computador obtenerComputador() {
		return computador;
	}
	
	public abstract void darMarca();
	public abstract void darModelo();
	public abstract void darRam();
	public abstract void darAlmacenamiento();
	public abstract void darSistemaOperativo();
	public abstract void darMainboard();

}
