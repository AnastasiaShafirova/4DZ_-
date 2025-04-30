import java.util.Arrays;

class Statistics {
    public static double findAverage(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Ошибка: массив пустой или равен null");
            return Double.NaN;
        }
        double sum = 0;
        try {
            for (int num : array) {
                sum += num;
            }
        } catch (Exception e) {
            System.out.println("Ошибка при подсчете суммы: " + e.getMessage());
            return Double.NaN;
        }
        return sum / array.length;
    }
}

public class Printer {
    public static void main(String[] args) {
        int[] array;
        if (args.length > 0) {
            try {
                array = Arrays.stream(args[0].split(","))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            } catch (NumberFormatException e) {
                System.out.println("Неккоректые данные: " + e.getMessage());
                array = new int[0];
            }
        } else {
            array = new int[]{10, 20, 30, 40, 50};
        }
        double average = Statistics.findAverage(array);
        System.out.println(average);
    }
}