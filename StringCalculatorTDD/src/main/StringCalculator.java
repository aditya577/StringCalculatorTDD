package main;

public class StringCalculator {

	public int add(String str) {
		int sum =0;
		
		if(str.equals(""))
			return 0;
		
		String[] numArray = str.split(",");
		for(String num : numArray)
		{
			sum = sum + Integer.parseInt(num);
		}
		
		
		return sum;
	}

}
