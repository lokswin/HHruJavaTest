import java.util.Arrays;
public class MyTask{
    public static void main(String[] args) {
//# Pass 1, move every value to the position of its value
    	int [] pos = new int[]{-1,0,-78,0,1};
	int N=pos.length
	for (cursor in range(N)){
    	target = array[cursor];
    	while(target < N && target != array[target]){
        	new_target = array[target];
        	array[target] = target;
        	target = new_target;
        }
}
//# Pass 2, find first location where the index doesn't match the value
for(cursor in range(N){
    if(array[cursor] != cursor){
        return cursor;
    }
return N;
}
System.out.println(n);

}