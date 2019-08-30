public class hw_2{



    public static void main (String[] args){



        String[][] myArray = new String[4][4];



        myArray[0][0]="1";

        myArray[0][1]="2";

        myArray[0][2]="3";

        myArray[0][3]="4";

        myArray[1][0]="5";

        myArray[1][1]="6";

        myArray[1][2]="7";

        myArray[1][3]="8";

        myArray[2][0]="9";

        myArray[2][1]="10";

        myArray[2][2]="11";

        myArray[2][3]="12";

        myArray[3][0]="13";

        myArray[3][1]="14";

        myArray[3][2]="15";

        myArray[3][3]="16";



        int i00=Integer.parseInt(myArray[0][0]);

        int i01=Integer.parseInt(myArray[0][1]);

        int i02=Integer.parseInt(myArray[0][2]);

        int i03=Integer.parseInt(myArray[0][3]);

        int i10=Integer.parseInt(myArray[1][0]);

        int i11=Integer.parseInt(myArray[1][1]);

        int i12=Integer.parseInt(myArray[1][2]);

        int i13=Integer.parseInt(myArray[1][3]);

        int i20=Integer.parseInt(myArray[2][0]);

        int i21=Integer.parseInt(myArray[2][1]);

        int i22=Integer.parseInt(myArray[2][2]);

        int i23=Integer.parseInt(myArray[2][3]);

        int i30=Integer.parseInt(myArray[3][0]);

        int i31=Integer.parseInt(myArray[3][1]);

        int i32=Integer.parseInt(myArray[3][2]);

        int i33=Integer.parseInt(myArray[3][3]);

        int sum=i00+i01+i02+i03+i10+i11+i12+i13+i20+i21+i22+i23+i30+i31+i32+i33;



        System.out.println(sum);}



}
