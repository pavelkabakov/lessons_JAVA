package sem_2;

public class task_4 {
    public static void main(String[] args) {
        System.out.println(Task05("1 232 21"));
    }

    /**
     * Напишите метод, который принимает на вход строку (String)
     * и определяет является ли строка палиндромом (возвращает boolean значение).
     */

    public static boolean Task05(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        String newText = stringBuilder.reverse().toString();
        return newText.equals(text);
    }
}
