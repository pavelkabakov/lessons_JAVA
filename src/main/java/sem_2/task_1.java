package sem_2;

public class task_1 {
    public static void main(String[] args) {
        System.out.println(task0(10, 'a', 'b'));
    }

//     Текст задачи:
//     Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
//     которая состоит из чередующихся символов c1 и c2, начиная с c1.
    static String task0 (int n, char c1, char c2){
        if(n%2==0){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < n/2; i++) {
                stringBuilder.append(c1).append(c2);
            }
            return stringBuilder.toString();
        } else {
            System.out.println("N is not even number! ");
            return null;
        }

    }
}
