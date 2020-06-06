package module2.lesson3;

public abstract class Swimmable extends Animal {
    private int maxDepth;

    public Swimmable(String name, String sound, int maxDepth) {
        super(name,sound);
        this.maxDepth = maxDepth;

    }

    public void showDepth(){
        System.out.println("I can dive to " + maxDepth);
    }

    @Override
    public void showAdditionalInfo(){
        showDepth();
    }
}
