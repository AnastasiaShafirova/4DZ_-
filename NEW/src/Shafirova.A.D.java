class DateValidator {
    public static String validateDate(String date) {
        // Проверим длинну строки
        if (date == null || date.length() != 10) {
            return "Ошибка: формат даты должен быть YYYY-MM-DD.";
        }

        // Проверим с помощью substring
        if (date.charAt(4) != '-' || date.charAt(7) != '-') {
            return "Ошибка: формат разделителей должен быть YYYY-MM-DD.";
        }

        // Разделяем части строки в отдельные строки
        String yearStr = date.substring(0, 4);
        String monthStr = date.substring(5, 7);
        String dayStr = date.substring(8, 10);

        int year, month, day;

        // Преобразовываем из строк в числа
        try {
            year = Integer.parseInt(yearStr);
            month = Integer.parseInt(monthStr);
            day = Integer.parseInt(dayStr);
        } catch (NumberFormatException e) {
            return "Ошибка: в дате присутствуют некорректные символы.";
        }

        // Проверяем диапозон
        if (year < 1 || year > 9999) {
            return "Ошибка: год должен быть в диапазоне от 0001 до 9999.";
        }
        if (month < 1 || month > 12) {
            return "Ошибка: месяц должен быть в диапазоне от 01 до 12.";
        }

        // Создаем массив для хранения количества дней в каждом месяце
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Проверяем дни, учитывая высокостный год
        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // февраль в високосном году
        }

        if (day < 1 || day > daysInMonth[month - 1]) {
            return "Ошибка: некорректное число дней для данного месяца.";
        }

        // Проверяем, что дата в пределах допустимого диапазона
        if (date.compareTo("0001-01-01") < 0 || date.compareTo("9999-12-31") > 0) {
            return "Ошибка: дата должна быть в диапазоне от 0001-01-01 до 9999-12-31.";
        }

        // Если все ок, то возвращаем дату
        return date;
    }

    // Дополнительный метод для определения високосного года
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

//нужно написать что-то новое для Git

//и еще что-то написать для выбора коммитов