package java_Utility;

import java.util.Random;

public class java {
	
	public int randomNum() {
		Random ran = new Random();
		int num = ran.nextInt(1000);
		return num;
	}

}
