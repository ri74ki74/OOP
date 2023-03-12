public class Main {
    public static void main(String[] args) {
        /*
        1. loo laud ehk arvuti laevad paika
        2. loob mängigija laua
        3. mängija paigutab laevad
        4. sõda
        5. lõpp
         */

        LaevadePommitamine mängulaud = new LaevadePommitamine();
        Väljasta.valjastaMaatriks(mängulaud.mänguLaud());
        System.out.println();
        mängulaud.lisaLaev(mängulaud.getLaevKahene1_A1(), mängulaud.mänguLaud());
    }
}
