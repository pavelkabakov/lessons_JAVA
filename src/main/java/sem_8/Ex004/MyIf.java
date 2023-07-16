package sem_8.Ex004;

public interface MyIf {

    int getUserID();

    default int getAdminID(){
        return 1;
    }

    static int getUniqueID(){
        return 0;
    }

}
