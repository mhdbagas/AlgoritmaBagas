package Tabel;

public class Urut {
    public static int[] getas(String text, int amount){
        int num, i, j, temp;
        num = amount;
        int array[] = new int[num];
        String[] strimp = text.split(",");
        int a = 0;
        for (String s : strimp){
            array[a] = Integer.parseInt(s.trim());
            a++;
        }
        for (i = 0; i < ( num - 1 ); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] getdes(String teks, int amount){
        int num, i, j, temp;
        num = amount;
        int array[] = new int[num];
        String[] stmp = teks.split(",");
        int a = 0;
        for (String s : stmp){
            array[a] = Integer.parseInt(s.trim());
            a++;
        }
        for (i = 0; i < ( num - 1 ); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] < array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}


