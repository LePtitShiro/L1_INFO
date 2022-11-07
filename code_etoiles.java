package tp2;

//import java.util.Scanner;

public class Exe5 {
	// Triangle
	public static void triangle(int h) {
		for (int i = h; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// Carre
	public static void carre(int h) {
		// barre
		String barre = "";
		for (int i = 0; i < h; i++) {
			barre += "*";
		}

		for (int i = 0; i < h; i++)// hauteur
			if (i == 0 || i == h - 1) { // Si premiere ligne ou derniere :
				System.out.println(barre);
			} else {
				for (int j = 0; j < h; j++) {
					if (j == 0 || j == h - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
	}

	// Lettre Z
	public static void lettre_z(int h) {
		// barre
		String barre = "";
		for (int i = 0; i < h; i++) {
			barre += "*";
		}
		for (int j = 1; j <= h; j++) {
			if (j == 1 || j == h) {
				System.out.println(barre);
			} else {
				for (int i = 0; i < h - j; i++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
	}

	// Lettre Z
	public static void pyramide(int h) {
		for (int i = 0; i <= h; i++) {
			for (int j = 0; j < (h - i); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i * 2 - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void lettre_n(int h) {
		for (int i = 0; i < h; i++) {
			System.out.print("*");
			for (int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}

			if (i > 0 && i < h-1) {
				System.out.print("*");
			}
			for (int k = (h-2-i); k>0;k--) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();

		}

	}

	// Figures d'étoiles
	public static void main(String[] args) {
		triangle(5);
		System.out.println();
		carre(5);
		System.out.println();
		lettre_z(5);
		System.out.println();
		pyramide(5);
		System.out.println();
		lettre_n(5);

	}
}
