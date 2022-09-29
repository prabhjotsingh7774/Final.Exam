package Final_Exam;
import java.util.*;

public class Solution1 {

	public static String RomanNum(int num){

	int arr[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
	String roman[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
	//These two arrays will help us in converting each integer to its Roman equivalent
	
	int n=12,d; // Here n is the size of the array we defined above

	String ans=new String(""); // Empty string

	while(num>0)
	{
	d=num/arr[n]; // Note: The value of n here will be 12,the first time
	// arr[12]=1000 so, d= 3002/1000 => d=3
	// So here we can see that we have to print "M" 3 times
	// We are using n to get the values of arrays in reverse order

	num=num%arr[n]; 

	// This while loop will simply print roman number we have got above,
	// 'd' number of times
	while(d>0)
	{
	ans+=roman[n]; // this will concatenate roman number to the ans
	d--;
	}
	--n; // at each iteration value of n will decrease by 1
	}
	return ans;
	}
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number=sc.nextInt();

	String s=RomanNum(number);
	System.out.print(s);
	}
	}


