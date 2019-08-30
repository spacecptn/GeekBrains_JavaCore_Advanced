public class hw_3{

               

                public static void main (String[] args){

                              

                               String[] myArray = new String[10];

                              

                               String i0=myArray[0]="Ivanov";

                               String i1=myArray[1]="Petrov";

                               String i2=myArray[2]="Sidorov";

                               String i3=myArray[3]="Kozlov";

                               String i4=myArray[4]="Baranov";

                               String i5=myArray[5]="Petuhov";

                               String i6=myArray[6]="Ivanov";

                               String i7=myArray[7]="Ivanov";

                               String i8=myArray[8]="Golubev";

                               String i9=myArray[9]="Sidorov";

                               for(int i=0;i<10;i++){

                                               for(int j=0;j<10;j++){

                                               if(myArray[i]==myArray[j]){

                                                               System.out.println(myArray[i]+"  "+"repeat's");

                                               } else{System.out.println("No repeats");}

                                              

                                              

                                              

                               }

                              

                               }

               

}

}