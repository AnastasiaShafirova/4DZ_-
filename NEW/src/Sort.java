import java.util.Arrays;

class StringSorter {
    public static String[] sortString(String[] strings) {
        if (strings == null) {
            System.out.println("Ошибка: входной массив равен null. Возвращается пустой массив.");
            return new String[0];
        }
        try {
            Arrays.sort(strings);
        } catch (Exception e) {
            System.out.println("Произошла ошибка при сортировка: " + e.getMessage());
            return new String[0];
        }
        return strings;
    }
}

public class Printer {
    public static void main(String[] args) {
        String[] strings;
        if (args.length > 0) {
            strings = args[0].split(",");
        } else {
            strings = new String[]{"banana", "apple", "cherry"};
        }

        String[] result = StringSorter.sortString(strings);
        System.out.println(Arrays.toString(result));
    }
}