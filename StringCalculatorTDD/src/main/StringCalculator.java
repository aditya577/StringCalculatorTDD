package main;

public class StringCalculator {

	public int add(String str) {
		int sum;
		
		if(str.equals(""))
			sum = 0;
		
		else {
			
			String[] numArray = str.split(",");
			
			int temp =0;
			for(String num : numArray)
			{
				temp += Integer.parseInt(num);
			}
			sum = temp;
			
		}
		
		System.out.println("sum:"+sum);
		return sum;
	}

}
