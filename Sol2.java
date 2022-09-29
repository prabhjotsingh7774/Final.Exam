package Final_Exam;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Sol2 {
	 List<String> result=null;
	    String[] mapping = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	    public List<String> letterCombinations(String digits) {
	        result = new ArrayList<>();
	        if(digits.length()==0) return result;
	        dfs(0,digits,new StringBuilder());
	        return result;
	    }
	    
	    void dfs(int length,String digits,StringBuilder temp){
	        if(length == digits.length()){
	            result.add(temp.toString());
	            return;
	        }
	        
	        //loop digit present at length index of digits string;
	        char ch= digits.charAt(length);
	        String str = mapping[ch-'0'];
	        for(char c:str.toCharArray()){
	            temp.append(c);
	            dfs(length+1,digits,temp);
	            temp.deleteCharAt(temp.length()-1);
	        }
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number=sc.nextInt();
		
	}

}
