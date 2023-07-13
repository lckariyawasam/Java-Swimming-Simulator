public class Swimmer extends Person {
    public String gender;
    public String clothingColour;

    public Swimmer(int id, String name) {
        super(id, name);
    }

    public void swim() {
        System.out.println(this.name + " is swimming");
    }
}
