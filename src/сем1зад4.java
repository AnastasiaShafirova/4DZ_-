import java.util.ArrayList;
import java.util.List;

public class сем1зад4 {
    public static void main(String[] args) {
        Integer[] arr = {1, 7, 2, 5, 3};
        List<Integer> nullElements = checkArray(arr);
        if (nullElements.size() > 0){
            System.out.println("Массив содержит пустые элементы на позициях " + nullElements);
        }
        else  {
            System.out.println("Массив не содержит пустых элементов");
        }
    }
    public static List<Integer> checkArray(Integer[] arr) {
        List<Integer> nullElements = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i]== null){
                nullElements.add(i);
            }
        }
    return nullElements;
    }
}