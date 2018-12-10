package emsamablajecomputadoras.creacional;

public class ConstructorAsusZenbook extends ConstructorComputadora {

	@Override
	public void darMarca() {
		// TODO Auto-generated method stub
		computador.setMarca("Asus");
		
	}

	@Override
	public void darModelo() {
		// TODO Auto-generated method stub
		computador.setModelo("Zenbook");
	}

	@Override
	public void darRam() {
		// TODO Auto-generated method stub
		computador.setRam(16);
	}

	@Override
	public void darAlmacenamiento() {
		// TODO Auto-generated method stub
		computador.setAlmacenamiento(500);
	}

	@Override
	public void darSistemaOperativo() {
		// TODO Auto-generated method stub
		computador.setOs(new SistemaOperativo("Windows",10,"home"));
	}

	@Override
	public void darMainboard() {
		// TODO Auto-generated method stub
		computador.setPlaca(new Mainboard("Prime ","Z370"));
		
	}

}
