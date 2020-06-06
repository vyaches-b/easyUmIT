package module2.lesson3;

public class Crocodile extends Swimmable{

    public Crocodile(String name, String sound, int maxDepth) {
        super(name, sound, maxDepth);
    }

    @Override
    public void showAdditionalInfo(){
        System.out.println("I'm the oldest animal on the planet");
        super.showAdditionalInfo();
    }
}
