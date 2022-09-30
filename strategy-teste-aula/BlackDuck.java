

public class BlackDuck extends Duck{
    public BlackDuck(){
            flyBehavior = new WingsFly();
            quackBehavior = new SickQuack();
    }
    public void display(){
        System.out.println("Black duck");
    }
}