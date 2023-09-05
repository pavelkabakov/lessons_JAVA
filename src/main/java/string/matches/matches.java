package string.matches;

public class matches {
    public static void main(String[] args) {
        /*
        String input = "+12343454556";
        boolean result = input.matches("(\\+*)\\d{11}");
        if(result){
            System.out.println("It is a phone number");
        }
        else{
            System.out.println("It is not a phone number!");
        }
         */


        String input = "01.01.2022";
        boolean result = input.matches("([0-9]{2})(\\.)([0-9]{2})(\\.)([0-9]{4})");
        if(result){
            System.out.println("это дата");
        }
        else{
            System.out.println("это не дата!");
        }



        /*
        String input = "999-123-45-67";
//        String input = "999-";
        boolean result = input.matches("([0-9]{3})(\\-)([0-9]{3})(\\-)([0-9]{2})(\\-)([0-9]{2})");
        if(result){
            System.out.println("это телефонный номер");
        }
        else{
            System.out.println("это не телефонный номер!");
        }
        */

/*
        String input = "f";
        boolean result = input.matches("[f,m]");
        if(result){
            System.out.println("это пол");
        }
        else{
            System.out.println("это не пол!");
        }
*/


        /*
        String input = "Иванов";
        boolean result = input.matches("[а-яёА-ЯЁ]+");
        if(result){
            System.out.println("это фамилия");
        }
        else{
            System.out.println("это не фамилия!");
        }
        */

        /*
        Для работы с регулярными выражениями в Java существуют классы Pattern и Matcher:

        String regex = "[а-яёА-ЯЁ]+";
        String str = "Работа не walk - работа work";

        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(str);
        if (m.find()){
            //делаем что-то
        }
        К предыдущему ответу добавлю что [а-яА-Я]+ не включает символы ё и Ё
        */

        /*
        // email адрес в формате xxx@xxx.xxx (регистр букв игнорируется)
        Pattern pattern = Pattern.compile("^([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z\\.]{2,6})$", Pattern.CASE_INSENSITIVE);
         */

    }
}
