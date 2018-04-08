/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Sachin
 */
public class TestNuron {

    public static void main(String[] args) {
        boolean k = false;
       //int k=0;
        double[][] errorValue = new double[16][16];
        CreateNet n1 = new CreateNet();
        
        NumberFormat nf = new DecimalFormat("#0.00");

        
        
  while(k!=true){
           
               System.out.println("_________________|___________________|_________________|___");
               System.out.println("**Output values**|**expected values**|  **Error**");
               System.out.println("_________________|___________________|_________________|___");
            for (int i = 0; i < 16; i++) {
                //set nuron value
                n1.N1.setInput(n1.inputVal[i][0], n1.inputVal[i][1], n1.inputVal[i][2], n1.inputVal[i][3]);
                n1.N2.setInput(n1.inputVal[i][0], n1.inputVal[i][1], n1.inputVal[i][2], n1.inputVal[i][3]);
                n1.N3.setInput(n1.inputVal[i][0], n1.inputVal[i][1], n1.inputVal[i][2], n1.inputVal[i][3]);
                
                //Calculate error 
                double e1 = n1.N1.error(n1.trainData[i][0]);
                double e2 = n1.N2.error(n1.trainData[i][1]);
                double e3 = n1.N3.error(n1.trainData[i][2]);
                
                //Save Error
                errorValue[i][0] = e1;
                errorValue[i][1] = e2;
                errorValue[i][2] = e3;
                
                System.out.println(nf.format(n1.N1.getOutput()) + "," + nf.format(n1.N2.getOutput()) + "," 
                        + nf.format(n1.N3.getOutput()) + "   |    " + n1.trainData[i][0] + "," + n1.trainData[i][1] 
                        + "," + n1.trainData[i][2]+ "          | " +nf.format(e1)+ "," +nf.format(e2)+ "," +nf.format(e3)+ "  |");

              //Set new weights  
              n1.N1.setWeight(n1.trainData[i][0]);
              n1.N2.setWeight(n1.trainData[i][1]);
              n1.N3.setWeight(n1.trainData[i][2]);
           
            }
           
            k = checkValue(errorValue);
           /*
           for(int z=0;z<16;z++){
           for(int l=0;l<3;l++){
               System.out.println("array"+errorValue[z][l]);
           
           }
            System.out.println("");
        }*/
            }
          System.out.println("");
          System.out.println("****Finished Training****");
           
           
        
    }
       
//This method is to compare the Error value
    public static boolean checkValue(double[][] array) {
        double val1 = 0;
        double val2 = 0;
        double val3 = 0;
        boolean no = false;
        int count = 0;

        for (int k = 0; k < 16; k++) {

         
            val1 = array[k][0];
            val2 = array[k][1];
            val3 = array[k][2];

            //For this error value it takes time to be compiled(Trained)
            //Give output within short time for val=0.27
            
            if (val1 < 0.22 && val2 < 0.22 && val3 < 0.22) {
                
                count++;
            }
        }

        if (count == 16) {
            no = true;
        }

        return no;
    }

}
