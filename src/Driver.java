public class Driver {

    public String name;
    public int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void drive() {
        System.out.println(name + " is driving");
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
