package hw1;

public class Cat {
    int run;
    int jump;
    int length;
    int height;

    public void RunCat() {
        if (length>300 ){
            System.out.println("Cat  can't  runnin'");}
        else
        {System.out.println("Cat  is runnin'");}
    }

    public void JumpCat() {
        if (height>2){
            System.out.println("Cat  can't  jumpin'");}
        else
        {System.out.println("Cat  is jumpin'");}
    }
}
