public class Person {
    public static int count = 0;
    public String name;
    public int id;
    
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void check_scorebaord() {
        System.out.println(this.name + " has checked the scoreboard");
    }
}
