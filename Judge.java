public class Judge extends Person {

    public Judge(int id, String name) {
        super(id, name);
    }

    void blow_whistle() {
        System.out.println(this.name + " blows whistle. Competition started!");
    }
}
