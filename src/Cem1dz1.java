public class Cem1dz1 {
    public static void main(String[] args) {
        String[] strings = {"10", "70", "Hello"};

        try {
            int result = convertAndSum(strings);
            System.out.println("Сумма: " + result);
        } catch (NumberFormatException | ArithmeticException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    public static int convertAndSum(String[] strings) {
        int sum = 0;
        for (String str : strings) {
            try {
                int number = Integer.parseInt(str);
                sum += number;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Невозможно преобразовать строку: " + str);
            }
        }
        if (sum > 100) {
            throw new ArithmeticException("Превышен лимит суммы");
        }
        return sum;
    }
}
