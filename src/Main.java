//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1,0,1}, {1,1,1}, {0,0,1}};
        int result = sumElements(matrix);
        if (result == -1) {
            System.out.println("Количество строк не равно количеству столбцов");
        }
        else if (result == -2) {
            System.out.println("Массив должен состоять из 0 и 1");
        }
        else  {
            System.out.println(result);
        }

    }
    public static int sumElements(int[][] matrix){
        int n = matrix.length;
        for (int[] row: matrix) {
            if (row.length != n){
                return -1;
            }
        }
    for (int[] row: matrix){
        for (int element : row) {
            if (element != 0 && element != 1){
                return -2;
            }
        }
    }
    int sum = 0;
    for (int[] row : matrix) {
        for (int element : row) {
            sum += element;
        }
    }
    return sum;
    }

}
