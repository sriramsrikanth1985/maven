package docker.github;

import java.awt.GradientPaint;

public class GreaterNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 10;
		int n2 = 20;
		GreaterNum gn = new GreaterNum();
		System.out.println("Greater number is: "+gn.greaterNumber(10,20));

	}
	
	public int greaterNumber(int num1, int num2) {
		return num1>num2?num1:num2;
	}

}
