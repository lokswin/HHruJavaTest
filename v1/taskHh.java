//\t new ln 
import java.util.Arrays;
//import java.io.File;
//import java.io.IOException;
//import java.util.Scanner;
import java.util.*;
import java.io.*;
public class MyTask {
    public static void main(String[] args)throws IOException {   		
   	   	MyTask task = new MyTask();
        File file = new File("inputNum.txt");
        int[] A = task.getData(file);
        //-------------------------------
    	int[] pos = Arrays.stream(A).filter(x -> x >= 1).toArray();
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
        int [] dataArray = new int[1000000];
		int i = 0;
		while(sc.hasNextInt()){
 			dataArray[i] = sc.nextInt();
 			i++;
		}
			return dataArray;
	}
}
