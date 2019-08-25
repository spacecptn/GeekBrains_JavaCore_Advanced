package hw1;

public class Robot {
    int run;
    int jump;
    int length;
    int height;

    public void RunRobot() {
        if (length>10000 ){
            System.out.println("Robot  can't  runnin'");}
        else
        {System.out.println("Robot  is runnin'");}
    }

    public void JumpRobot() {
        if (height>3){
            System.out.println("Robot  can't  jumpin'");}
        else
        {System.out.println("Robot  is jumpin'");}
    }
}
