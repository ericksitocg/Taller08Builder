import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		ConstructorComputadoraDirector director = new ConstructorComputadoraDirector();
		ConstructorComputadora constructor;
		
		int respuesta;
		Scanner sc = new Scanner();
		System.out.println("Ingrese la opcion:\n 1)AsusROGE\n2)AsusZenbook\n");
		respuesta = sc.nextInt();
		while(respuesta!=2||respuesta!=1) {
			System.out.println("Ingrese la opcion:\n 1)AsusROGE\n2)AsusZenbook\n");
			respuesta = sc.nextInt();
		}
		if(respuesta==1) {
			constructor = new ConstructorAsusROGE();
		}
		else {
			constructor = new ConstructorAsusZenbook();
		}
		
		director.estableceConstructor(constructor);
		director.construirComputadora();
		
		Computador computador = director.obtenerComputadora();
	}

}
