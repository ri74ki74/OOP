public class Väljasta {
    public static void valjastaMaatriks(int[][] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]);
            }
        }
    }
}
