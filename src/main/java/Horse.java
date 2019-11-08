import java.util.Scanner;

public class Horse {
    private static int DeskSize = 8;
    private static int [][] desk = new int [DeskSize][DeskSize];
    private static int[]xStep = {2, 2, -2, -2, 1, -1, 1, -1};
    private static int[] yStep = {1, -1, -1, 1, -2, -2, 2, 2};
    private static int k;
    private static int[] minStep = {8, 0, 0};
    private static int i =0;
    private static int j = 0;
    public static boolean main(int i, int j, int iFinal, int jFinal ) {




        if(i > 8){
            System.out.println("Reenter: ");

        }

        if(j > 8){
            System.out.println("reenter: ");

        }
        desk[i][j] = 1;

            minStep[0] = 8;
            for (k = 0; k < 8; k++) {
                if (0 <= (i + xStep[k]) && (i + xStep[k]) < DeskSize &&
                        0 <= (j + yStep[k]) && (j + yStep[k]) < DeskSize &&
                        desk[i + xStep[k]][j + yStep[k]] == 0 &&
                        CheckHS(i + xStep[k], j + yStep[k]) <= minStep[0]) {
                    minStep[0] = CheckHS(i + xStep[k], j + yStep[k]);
                    minStep[1] = i + xStep[k];
                    if(iFinal != minStep[1]){
                       return false;
                    }
                    minStep[2] = j + yStep[k];
                    if(jFinal!= minStep[2]){
                        return false;
                    }
                }

            }
            return false;

        }

        private static int CheckHS (int i, int j){
            int steps = 0;
            int n;

            for (n=0; n<8; n++){
                if (0<=(i+xStep[n]) && (i+xStep[n])<DeskSize && 0<=(j+ yStep[n]) &&
                        (j+ yStep[n])<DeskSize && desk[i+xStep[n]][j+ yStep[n]]==0){
                    steps++;
                }
            }
            return steps;
        }
    }


