package main;

public class StringCalculator {

	public int add(String str) {
		int sum =0;
		
		if(str.equals(""))
			sum = 0;
		
		else {
			int num = Integer.parseInt(str);
			sum = num;
		}
		
		return sum;
	}

}
