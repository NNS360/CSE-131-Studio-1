package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		int[] nums = {x, y,};
       
        float sum = 0;
        int i=0;
        while(i < nums.length) {
            sum += nums[i];
            i++;
        }
         
        float average = (sum / nums.length); 
         
        System.out.println("Average : "+average);//

	}

}
