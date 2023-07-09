package sem_5;
//Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//123456 Иванов
//321456 Васильев
//234561 Петрова
//234432 Иванов
//654321 Петрова
//345678 Иванов
//Вывести данные по сотрудникам с фамилией Иванов.
public class Ex001_Map {
    public static void main(String[] args) {
    task();
    }

    static void task(){
        Ex001_Passport passport = new Ex001_Passport();
        passport.add("123456", "Иванов");
        passport.add("321456", "Васильев");
        passport.add("234561", "Петрова");
        passport.add("234432", "Иванов");
        passport.add("654321", "Петрова");
        passport.add("345678", "Иванов");

        System.out.print(passport.getByLastName("Иванов"));
        System.out.println(passport.getByPassNum("321456"));
        System.out.println(passport.getAll_2());

    }


}
