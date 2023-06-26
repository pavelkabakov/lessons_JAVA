package sem_2;

public class string_builder {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        for(int i=0; i<7; i++)
        {
            string.append("#");
            System.out.println(string);

        }
    }
}
