
import java.io.IOException;
public class Main {
    private  static String CalculateArray(String length,String Array){
       int [] inputNumbers = new int[]{0,46,-2,3,10};
        int sumPositive=0;
        int minEl=Integer.parseInt(inputNumbers[0]);
        int minElPosition=0;
        int maxElPosition=0;
        int maxEl=Integer.parseInt(inputNumbers[0]);
        int multiply=1;
        for(int i=0;i<inputNumbers.length;i++){
            int el=Integer.parseInt(inputNumbers[i]);
            if(el>0){
                sumPositive+=el;
            }
            if(el>maxEl){
                maxElPosition=i;
            }
            if(el<minEl){
                minElPosition=i;
            }
        }
        if(minElPosition<maxElPosition){
            for(int i=minElPosition+1;i<maxElPosition;i++){
                multiply*=Integer.parseInt(inputNumbers[i]);
            }
        }else{
            for(int i=maxElPosition+1;i<minElPosition;i++){
                multiply*=Integer.parseInt(inputNumbers[i]);
            }
        }
        result=sumPositive+" "+multiply;
        return result;
    }