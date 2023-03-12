import java.util.Arrays;

public class LaevadePommitamine {
    private int read = 3;
    private int veerud = 3;
    private int[][] mängulaud;
    int i = 1;
    int j = 1;

    int[][] laevKahene1_A1 = {{i,j}, {i,j+1}};

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    public int getVeerud() {
        return veerud;
    }

    public void setVeerud(int veerud) {
        this.veerud = veerud;
    }

    public int[][] getLaevKahene1_A1() {
        return laevKahene1_A1;
    }

    public void setLaevKahene1_A1(int[][] laevKahene1_A1) {
        this.laevKahene1_A1 = laevKahene1_A1;
    }

    public int[][] mänguLaud() {
        int[][] laud = new int[getRead()][getVeerud()];
        return laud;
    }

    public void lisaLaev(int[][] laev, int[][] laud){
        for (int k = 0; k < laev.length; k++) {
            laud[laev[k][0]][laev[k][1]] = 4;
        }
        Väljasta.valjastaMaatriks(laud);
    }


}
