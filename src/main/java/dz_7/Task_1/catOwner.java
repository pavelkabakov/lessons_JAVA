package dz_7.Task_1;

public class catOwner implements catOwnerInterface {

    public catOwner(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String getName() {
        return name;
    }

}
