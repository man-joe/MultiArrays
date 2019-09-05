public class MultidimensionalArrays {
    public static void main(String[] args){
        int[][] printMulti = new int[10][5];

        for(int row = 0; row < 10; row++) {
            for (int col = 0; col < 5; col++) {
                printMulti[row][col] = row;
                System.out.print("row " + printMulti[row][col] + " col " + col + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Sample Output:");
        System.out.println();

        int[][] multiTable = new int[12][12];

        for(int row = 0; row < 12; row++){
            for(int col = 0; col < 12; col++){
                multiTable[row][col] = (row + 1)*(col + 1);
                System.out.print(multiTable[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
