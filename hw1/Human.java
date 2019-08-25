package hw1;

public class Human {
    int run;
    int jump;
    int length;
    int height;


    public void RunHuman() {
        if (length>=3000){
            System.out.println("Human  can't  runnin'");}
        else
        {System.out.println("Human  is runnin'");}
    }

    public void JumpHuman() {
        if (height>1){
        System.out.println("Human  can't  jumpin'");}
        else
        {System.out.println("Human  is jumpin'");}
    }
}