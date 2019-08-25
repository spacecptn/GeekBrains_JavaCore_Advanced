package hw1;

public class MainClass {
    public static void main(String [] args){
        Road r1=new Road();
        r1.length=1000;
        Wall w1=new Wall();
        w1.height=2;
Human man1 = new Human ();
man1.run=3000;
man1.jump=1;
man1.length=r1.length;
man1.height=w1.height;
Cat cat1= new Cat();
cat1.run=300;
cat1.jump=2;
cat1.length=r1.length;
cat1.height=w1.height;
Robot bot1= new Robot();
bot1.run=10000;
bot1.jump=3;
bot1.length=r1.length;
bot1.height=w1.height;
man1.JumpHuman();
man1.RunHuman();
cat1.JumpCat();
cat1.RunCat();
bot1.JumpRobot();
bot1.RunRobot();
    }
}
