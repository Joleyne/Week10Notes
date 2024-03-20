// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Airplane plane = new Airplane(500, "A3X95");
        Bee bee1 = new Bee(3);
        HoneyBee hbee = new HoneyBee(4);
        plane.takeOff();
        hbee.howMuchHoney();
        plane.land();
        bee1.fly();
    }
}

interface Flyer{
    void takeOff();
    void fly();
    void land();
}
interface Honey{
    void howMuchHoney();

}

class Airplane implements Flyer{
    int speed;
    String registration;

    public Airplane(int speed, String registration) {
        this.speed = speed;
        this.registration = registration;
    }

    @Override
    public void takeOff() {
        System.out.println("Airplane is taking off");
    }

    @Override
    public void fly() {
        System.out.println("Woosh Airplane is flying");
    }

    @Override
    public void land() {
        System.out.println("Airplane is landing");
    }
}

class Bee implements Flyer{
    int age;

    public Bee(int age) {
        this.age = age;
    }

    @Override
    public void takeOff() {
        System.out.println("Bee starting fly");
    }

    @Override
    public void fly() {
        System.out.println("Bee flying");
    }

    @Override
    public void land() {
        System.out.println("Bee landing");
    }
}

class HoneyBee extends Bee implements Honey, Flyer{
    public HoneyBee(int age){
        super(age);
    }

    @Override
    public void howMuchHoney() {
        System.out.println("Five Gallons");
    }

    @Override
    public void takeOff() {
        super.takeOff();
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void land() {
        super.land();
    }
}