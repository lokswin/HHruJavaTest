import java.util.Arrays;
public class MyTask{
    public static void main(String[] args) {
int [] inputNumbers = new int[]{-5,0,1};
    //-----------------------------------------------------------------
    //positive only
    int[] pos = Arrays.stream(inputNumbers).filter(x -> x >=1).toArray();
    //sort
    Arrays.sort(pos);
        
    //create start-var,find min
    int currentMin = pos[0];
    int firstItem=pos[0];
    int lastItem= pos[pos.length-1];
    if(lastItem==currentMin&&pos.length!=1){
        currentMin++;
        System.out.println(currentMin);
        }else if(pos.length==1&&pos[0]==1){
            currentMin=2;
            System.out.println(currentMin);
            
        }else if(firstItem!=1){
            currentMin=1;
            System.out.println(currentMin);
            return;
        }
        else if(pos.length==1&&pos[0]!=1){
            currentMin=1;
            System.out.println(currentMin);
            
        }
  for(int m=1;m<pos.length;m++){
    if(pos[m]-currentMin>=2&&currentMin!=pos[0]){
            currentMin++;
            System.out.println(+currentMin);
            break;
    }
        else if(pos[m]-currentMin>=2&&currentMin==pos[0]&&pos[0]!=1){
            currentMin=1;
            System.out.println(currentMin);
            break;
                }else if(pos[m]-currentMin>=2&&currentMin==pos[0]&&pos[0]==1){
                    currentMin=2;
                    System.out.println(currentMin);
                    break;
        }else{
            currentMin = pos[m];}
        }
    }
}