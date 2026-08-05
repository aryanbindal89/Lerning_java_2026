package Array_in_java;

public class multidimensional_Arrays_in_Java {
    public static void main(String[] args) {
        //int [] marks;  -------> 1D array
        int [][] flats; //------> 2D array
        flats = new int [2][3];
        flats [0][0] = 101;
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [1][0] = 201;
        flats [1][1] = 202;
        flats [1][2] = 203;
        System.out.println(flats[0][0]);

        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
            System.out.print(flats[i][j] + " ");
            }
            System.out.println();
        }

    }
}
