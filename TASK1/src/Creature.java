
class Creature {
    public String name;
    public int weight;
    public int age;
}

class Animal extends Creature {

    public String name;
    public int age;

    /* Constructor */
    public Animal(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String Innoculate(int age) {

        String status;

        if (age < 3) {
            status = "Underaged for innoculation...";
        } else {
            status = "Successfully innoculated!";
        }
        return status;
    }
}
