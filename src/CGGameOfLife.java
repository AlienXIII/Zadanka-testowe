import java.util.Arrays;

public class CGGameOfLife {

    //Game of Life

    public void main(String[] args) {

        // 6x6 szybowiec

        int n = 6;
        int[][] tablicaPozniej = new int[6][6];
        int[][] tablicaTeraz = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };


        for (int x = 0; x < 4; x++) {

            //rysowanie tabelek

            System.out.println("ITERACJA" + x + "\n");
            for (int i = 0; i < n; i++) {        //petla w dol (i)

                for (int j = 0; j < n; j++) {   //petla w prawo (j)

                    if (tablicaTeraz[i][j] == 0) System.out.print(".");
                    else System.out.print("#");
                }
                System.out.println();
            }


            //Sprawdzanie kazdej komorki po kolei
            for (int i = 0; i < n; i++) {        //petla w dol (i)

                for (int j = 0; j < n; j++) {   //petla w prawo (j)


                    int zywySasiad = 0;
                    boolean ded;
                    if (tablicaTeraz[i][j] == 0) ded = true;
                    else ded = false;

                    if (i == 0) {

                        if (j == 0) {
                            //0,0  (lewy gorny rog)
                            if (tablicaTeraz[((tablicaTeraz[i].length) - 1)][((tablicaTeraz[i].length) - 1)] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[((tablicaTeraz[i].length) - 1)][j] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[((tablicaTeraz[i].length) - 1)][j + 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i][((tablicaTeraz[i].length) - 1)] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i][j + 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i + 1][((tablicaTeraz[i].length) - 1)] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i + 1][j] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i + 1][j + 1] != 0) {
                                zywySasiad++;
                            }
                        } else if (j == (tablicaTeraz[i].length) - 1) {
                            //0,max  (prawy gorny rog)
                            if (tablicaTeraz[((tablicaTeraz[i].length) - 1)][j - 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[((tablicaTeraz[i].length) - 1)][j] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[((tablicaTeraz[i].length) - 1)][0] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i][j - 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i][0] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i + 1][j - 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i + 1][j] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i + 1][0] != 0) {
                                zywySasiad++;
                            }
                        } else {

                            //tutaj metody dla komorek na samej gorze

                            if (tablicaTeraz[((tablicaTeraz[i].length) - 1)][j - 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[((tablicaTeraz[i].length) - 1)][j] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[((tablicaTeraz[i].length) - 1)][j + 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i][j - 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i][j + 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i + 1][j - 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i + 1][j] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i + 1][j + 1] != 0) {
                                zywySasiad++;
                            }
                        }
                    }

                    //sama gora sprawdzona, teraz sam dol

                    else if (i == (tablicaTeraz[i].length) - 1) {

                        if (j == 0) {
                            //tutaj max,0 (lewy dolny rog)

                            if (tablicaTeraz[i - 1][((tablicaTeraz[i].length) - 1)] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i - 1][j] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i - 1][j + 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i][((tablicaTeraz[i].length) - 1)] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i][j + 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[0][((tablicaTeraz[i].length) - 1)] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[0][j] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[0][j + 1] != 0) {
                                zywySasiad++;
                            }
                        } else if (j == ((tablicaTeraz[i].length) - 1)) {

                            //max,max  (prawy dolny rog)
                            if (tablicaTeraz[i - 1][j - 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i - 1][j] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i - 1][0] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i][j - 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i][0] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[0][j - 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[0][j] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[0][0] != 0) {
                                zywySasiad++;
                            }
                        } else {
                            //metody dla komorek na samym dole

                            if (tablicaTeraz[i - 1][j - 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i - 1][j] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i - 1][j + 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i][j - 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[i][j + 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[0][j - 1] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[0][j] != 0) {
                                zywySasiad++;
                            }
                            if (tablicaTeraz[0][j + 1] != 0) {
                                zywySasiad++;
                            }
                        }
                    }  //komorki na dole sprawdzone, zostaly boki, ale bez rogow


                    else if (j == 0 && i > 0 && i < ((tablicaTeraz[i].length) - 1)) {

                        //komorka po lewej bez rogow

                        if (tablicaTeraz[i - 1][((tablicaTeraz[i].length) - 1)] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i - 1][j] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i - 1][j + 1] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i][((tablicaTeraz[i].length) - 1)] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i][j + 1] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i + 1][((tablicaTeraz[i].length) - 1)] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i + 1][j] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i + 1][j + 1] != 0) {
                            zywySasiad++;
                        }
                    } else if (j == ((tablicaTeraz[i].length) - 1) && i > 0 && i < ((tablicaTeraz[i].length) - 1)) {
                        //komorka po prawej stronie bez rogow

                        if (tablicaTeraz[i - 1][j - 1] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i - 1][j] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i - 1][0] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i][j - 1] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i][0] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i + 1][j - 1] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i + 1][j] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i + 1][0] != 0) {
                            zywySasiad++;
                        }
                    } else {      //obramowka sprawdzona, teraz czas na wszystko inne

                        if (tablicaTeraz[i - 1][j - 1] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i - 1][j] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i - 1][j + 1] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i][j - 1] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i][j + 1] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i + 1][j - 1] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i + 1][j] != 0) {
                            zywySasiad++;
                        }
                        if (tablicaTeraz[i + 1][j + 1] != 0) {
                            zywySasiad++;
                        }
                    }

                    tablicaPozniej[i][j] = tablicaTeraz[i][j];

                    if (ded && zywySasiad == 3) {
                        tablicaPozniej[i][j] = 1;       //narodziny komorki
                    }
                    if (!ded && (zywySasiad < 2 || zywySasiad > 3)) {
                        tablicaPozniej[i][j] = 0;      //zabita komorka
                    }

                }
            }
            for (int i = 0; i < tablicaPozniej.length; i++) {
                tablicaTeraz[i] = Arrays.copyOf(tablicaPozniej[i], tablicaPozniej[i].length);
            }

        }
    }
}



