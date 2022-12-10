package array_revision;

import java.util.Random;


public class Array_Revision {

  
    public static void main(String[] args) {
        
        // getting a random number
        Random random = new Random();

        int intGroup [] = new int[50];
        int newValue = 0;
        
        for(int pos =0; pos < intGroup.length; pos++){
                  intGroup [pos] = random.nextInt(100) ;
            
        }
        printArr(intGroup);
        newValue = findValue(intGroup, 50);
        
        System.out.println("random = " + random.nextInt(200));

        //initilize or declaring the integar position
//        int position;
//        position = 0;
        //creating an empty array and storing 10 variables to it
        String rogerStreet[] = new String[10];
        
        // lets say Piet is staying in no 6 at rogerStreet we will declare that
       rogerStreet[0] = "Mother";         


        rogerStreet[1] = "Bunny";
        rogerStreet[2] = "Tshepiso";
        rogerStreet[3] = "Lesedi";
       rogerStreet[4] = "Piet";
        rogerStreet[5] = "Piet";
        rogerStreet[6] = "Piet";
        rogerStreet[7] = "Piet";
        rogerStreet[8] = "Piet";
        rogerStreet[9] = "Piet";
        //should get the "Piet" and "Zeenat" names as the output
        System.out.println("rogerStreet 6  " + rogerStreet[6]);
        System.out.println("rogerStreet 3  " + rogerStreet[3]);
        System.out.println("rogerStreet 6  " + rogerStreet[1]);
        System.out.println("rogerStreet 2  " + rogerStreet[2]);
         
       
          
        //to print everything in an array always use a loop
       //you will get an error that will say create a method the create it
       printArr(rogerStreet);  
    }

    private static void printArr(String inputArray[]) {
       int positions ;
//       positions =3;
//       System.out.println(positions + " = " + inputArray[3]);
//       positions =6;
//       System.out.println(positions + " = " + inputArray[6]);
//       positions =1;
     
       // using a for loop to print all the arrays that are stored 
       for(positions = 0; positions < inputArray.length; positions ++){
             System.out.println(positions + " = " + inputArray[positions]);
       }
    }

    private static void printArr(int[] inputArray) {
        int positions ;
          // using a for loop to print all the arrays that are stored 
       for(positions = 0; positions < inputArray.length; positions ++){
             System.out.println(positions + " = " + inputArray[positions]);
       }
    }

    private static int findValue(int[] inputArray, int valueToFind) {
        int output =0;
        return output;
        
    }
   
}
