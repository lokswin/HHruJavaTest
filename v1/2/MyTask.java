//\t new ln 
import java.util.Arrays;
//import java.io.File;
//import java.io.IOException;
//import java.util.Scanner;
import java.util.*;
import java.io.*;
public class MyTask {
    public static void main(String[] args)throws IOException {   		
   	   	File file = new File("inputFile.txt");
   	   	MyTask task = new MyTask();        
        int[] test = task.getData(file);
      
        for (int p : test) {
       	System.out.print(p + " ");}
        //-------------------------------
    	int[] pos = Arrays.stream(test).filter(x -> x >= 1).toArray();
    		//sort
    		Arrays.sort(pos);
    		//find min,create start-var
    		int currentMin = pos[0];    		
    		for(int i=0;i<=pos.length;i++){
    			if(pos[i]-currentMin>=2){
    				currentMin = currentMin+1;
    				System.out.println("\n\t"+"Answer:"+currentMin+"\n\t");
    				break;
    			}
    			else{
    				currentMin = pos[i];
    			}
    		}	   	 		
    	 	
   		
    }
    public int[] getData(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        int [] inputNum = new int[100];
		int i = 1;
		while(sc.hasNextInt()){
 			inputNum[i] = sc.nextInt();
 			i++;
 						
		}
			return inputNum;
	}
}
