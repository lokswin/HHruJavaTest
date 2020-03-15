//\t new ln 
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class taskHhruA {

    public static void main(String[] args) {
   		
//int [] inputNum = new int [100];
   		try {
        Scanner sc = new Scanner(new File("inputNum.txt"));
			int [] inputNum = new int[100];
			for(int i = 0;i<inputNum,length
			while(sc.hasNextInt()){
 			  inputNum[i++] = sc.nextInt();
			}
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    	
        if(inputNum.length<=100){
    		int[] pos = Arrays.stream(inputNum).filter(x -> x >= 1).toArray();
    		
    		//sort
    		Arrays.sort(pos);
    		//print sorted pos
    		//System.out.println("Here is the sorted & positive");
    		//for (int p : pos) {
        	//System.out.print(p + " ");}
        	        	//begin var
    		int currentMin = pos[0];
    		//find min
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
   		else {
   			System.out.println("Too many input characters");
    	}
    }
}
