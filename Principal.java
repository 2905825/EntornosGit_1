public class Principal {
	public static void main(String[] args){
		System.out.println("Hola gente, soy Antonio de primero de DAM");
        mostrarFechaHora();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de usuarios: ");
        int numeroDeUsuarios = scanner.nextInt();
        Usuario[] usuarios = crearUsuarios(numeroDeUsuarios);
        



	}
}
