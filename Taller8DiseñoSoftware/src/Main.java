import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		ConstructorComputadoraDirector director = new ConstructorComputadoraDirector();
		ConstructorComputadora constructor= null;
		
		int respuesta = -1;
		while (respuesta!=3) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese la opcion:\n1)AsusROGE\n2)AsusZenbook\n3)Salir");
			respuesta = sc.nextInt();
	
			if(respuesta==1) {
				constructor = new ConstructorAsusROGE();
			}
			else if(respuesta == 2) {
				constructor = new ConstructorAsusZenbook();
			}
			if(respuesta!=3) {
				
				director.establecerConstructor(constructor);
				director.construirComputadora();
				
				Computador computador = director.obtenerComputadora();
				System.out.println("*********************");
				System.out.println(computador.especificacionesTecnicas());
				System.out.println("*********************");
			}
		}
	}
}
