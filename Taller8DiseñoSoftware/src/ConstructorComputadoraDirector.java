
public class ConstructorComputadoraDirector {
	private ConstructorComputadora constructorComp;
	
	public void establecerConstructor(ConstructorComputadora cc) {
		this.constructorComp = cc;
	}
	public Computador obtenerComputadora(){
		return constructorComp.obtenerComputador();
	}
	
	public void construirComputadora() {
		
		constructorComp.nuevo();
		constructorComp.darMarca();
		constructorComp.darModelo();
		constructorComp.darRam();
		constructorComp.darAlmacenamiento();
		constructorComp.darSistemaOperativo();
		constructorComp.darMainboard();
	}

}
