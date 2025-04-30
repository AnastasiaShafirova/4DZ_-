public class cem1zad8 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        if (checkArray(arr)){
            System.out.println("Количество строк и столбцов совпаает");
        }
        else{
            System.out.println("Количество столбцов е свпадает");
        }
    }
    public static boolean checkArray(int[][] arr){
        //подсчитаем количество строк
        int rows = arr.length;
        if (rows == 0){
            return true;
        }
        for (int i =1; i < rows; i++){
            if (arr[i].length != rows){
                return  false;
            }
        }
    return true;
    }
}
