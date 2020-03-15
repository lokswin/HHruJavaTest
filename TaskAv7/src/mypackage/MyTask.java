package mypackage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MyTask {
    public static void main(String[] args)throws IOException {   		
        //Put inputFile.txt filled with your numbers in current folder.
        int [] inputNumbers=new int[1000000];
        int i=0;
        Scanner s = new Scanner(new File("inputFile.txt"));
          while(s.hasNext())
          {
            inputNumbers[i++]=s.nextInt();                      
          }
        //-----------------------------------------------------------------
        //positive only
        int[] pos = Arrays.stream(inputNumbers).filter(x -> x >=1).toArray();
    		//sort
    		Arrays.sort(pos);
        //create start-var,find min
    		int currentMin = pos[0];
        int	lastItem=	pos[pos.length-1];
    		for(int m=1;m<pos.length;m++){
          if(pos[m]-currentMin>=2){
              currentMin = currentMin+1;
    				  System.out.println(currentMin);
              break;                				  
    		 	  }else currentMin = pos[m];    
    		}
        //1 2 3 exception 
            if(lastItem==currentMin){
              currentMin=currentMin+1;
              System.out.println(currentMin);
            }	           
    }
}
