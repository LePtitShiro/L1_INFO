package tp3;

public class Exe3 {
	
	public static int min(int i, int j) {
		if (i >= j) {
			return j;
		} else {
			return i;
		}
	}

	// Q1 : Déterminer les dimensions de la cible en fonction de n
	
	public static int dimension(int n) { // inutile au reste
		return n*2-1;
	}
	
	// Q1 : Écrire une fonction pour afficher la i-ème ligne de la cible
	
	public static void afficherLigne(int i, int n) {

		for (int j = 1; j <= n - 1; j++) {

			System.out.print(min(j, min(i, n - 1)));
		}
		if (i < n) {
			System.out.print(i);
		} else {
			System.out.print((n * 2) - i);
		}
		for (int y = n - 1; y >= 1; y--) {
			System.out.print(min(y, i));
		}
	}
	
	// Q2 : Écrire une fonction pour afficher la cible complète
	
	public static void cible(int n) {
		for (int i = 1; i <= n; i++) {
			afficherLigne(i, n);
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			afficherLigne(i, n);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Tester ici la fonction qui affiche la cible
		cible(5);
	}
}
