package labs.comp3111.uts.hk;

public class Lab1Activity {
    public static void main(String[]args) {
    	int[]arr= {1,2,3,4,5,6,7,8,9,10};
    	int sum=0;
    	int max=arr[0];
    	int min=arr[0];
    	for(int items:arr) {
    		sum+=items;
    		if(items>max) {
    			max=items;
    		}
    		if(items<min) {
    			min=items;
    		}
    	}
    	System.out.println(String.format("Sum of the numbers is %d",sum));
    	System.out.println("Min = "+min+"; Max = "+max);
    }
}
