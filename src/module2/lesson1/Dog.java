package module2.lesson1;

public class Dog {

    private String name;
    private boolean isGoodBoy;

    public Dog() {
    }

    public Dog(String name, boolean isGoodBoy) {
        this.name = name;
        this.isGoodBoy = isGoodBoy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGoodBoy() {
        return isGoodBoy;
    }

    public void setGoodBoy(boolean goodBoy) {
        isGoodBoy = goodBoy;
    }

    @Override
    public String toString() {
        String dogDescription = name;

        if(isGoodBoy){
            dogDescription += " хороший мальчик :)";
        }
        else{
            dogDescription += " плохой мальчик :(";
        }
        return dogDescription;
    }
}
