package no.hvl.dat100.matriser;

public class Matriser {

    // a)
    public static void skrivUt(int[][] matrise) {
        for (int[] rad : matrise) { // ytre løkke for radene
            for (int tall : rad) {  // indre løkke for kolonnene
                System.out.print(tall + " ");
            }
            System.out.println();
        }
    }

    // b)
    public static String tilStreng(int[][] matrise) {
        String resultat = "";
        for (int[] rad : matrise) {
            for (int tall : rad) {
                resultat += tall + " ";
            }
            resultat += "\n";
        }
        return resultat;
    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {
        int antRader = matrise.length;
        int antKolonner = matrise[0].length;
        int[][] nyMatrise = new int[antRader][antKolonner];

        for (int i = 0; i < antRader; i++) {
            for (int j = 0; j < antKolonner; j++) {
                nyMatrise[i][j] = matrise[i][j] * tall;
            }
        }
        return nyMatrise;
    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {
        // først: sjekk at de har samme dimensjoner
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) {
                return false;
            }
        }
        // så: sjekk at alle elementer er like
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
