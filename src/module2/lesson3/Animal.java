package module2.lesson3;

public abstract class Animal {
    protected String name;
    protected String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void sound(){
        System.out.println(sound);
    }

    public void showName(){
        System.out.println(name);
    }

    public void showDescription(){
        System.out.println("Hello! I'm " + name + ". " + sound);
        showAdditionalInfo();
    }

    protected abstract void showAdditionalInfo();
}
