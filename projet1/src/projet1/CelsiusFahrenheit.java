package projet1;

import java.util.Arrays;
import java.util.Scanner;

import com.openclassrooms.ideinstall.List;

public class CelsiusFahrenheit {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Méthode main
		 */
		/*String prenom;
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);
		while (reponse == 'O')
		{
			System.out.println("Donnez un prénom :");
			prenom = sc.nextLine();
			System.out.println("Bonjour " + prenom );
			reponse = ' ';
			
			while (reponse != 'O' && reponse != 'N')
			{
				System.out.println("Voulez-vous réessayer ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			}
		}
		System.out.println("Au revoir...");*/

/*		List<String> input = Arrays.asList("F", "G", "F", "B", "F", "G", "F", "G", "H");
		Map<Integer, Integer> map = new HashMap<>();
		map.contain  */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CONVERTISSEUR DEGRÉS CELSIUS ET DEGRÉS FAHRENHEIT");
		System.out.println("-------------------------------------------------");		
		char again = 'O';
		while (again == 'O')
		{			
			int mode = 0;			
			while (mode != 1 && mode != 2)
			{
				System.out.println("Choisissez le mode de conversion :");
				System.out.println("1 - Convertisseur Celsius - Fahrenheit");
				System.out.println("2 - Convertisseur Fahrenheit - Celsius");
				mode = sc.nextInt();
				sc.nextLine();
			}
			//if (mode == 1) System.out.println("C F");
			//if (mode == 2) System.out.println("F C");
			
			int temp = 0;
			System.out.println("Température à convertir :");				
			temp = sc.nextInt();
			sc.nextLine();
			
			double finaltemp = (mode==1) ? CtoF(temp) : FtoC(temp);
			if (mode == 1)
				System.out.println(arrondi(temp, 1) + " °C correspond à : "
										+ finaltemp + " °F.");
			else
				System.out.println(arrondi(temp, 1) + " °F correspond à : "
										+ finaltemp + " °C.");
			
			again = ' ';
			while (again != 'O' && again != 'N')
			{
				System.out.println("Souhaitez-vous convertir une autre température ?(O/N)");
				again = sc.nextLine().charAt(0);
			}
		}
		
		System.out.println("Au revoir !");
	}
	
	public static double arrondi(double A, int B) {
		return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
	
	public static double CtoF(int C) {
		return arrondi(9 * C / 5.0 + 32, 1);
	}
	
	public static double FtoC(int F) {
		return arrondi(5 * (F - 32) / 9.0, 2);
	}

}
