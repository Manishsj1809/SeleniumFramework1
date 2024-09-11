package Generic_Utilities;

import java.util.Random;

public class Java_Utility {
	/**
	 * this method is used make java generic
	 * @return
	 * @author manish
	 */
	
	public int getRandomNum() 
	{
		Random ran = new Random();
		int ranNum = ran.nextInt();
		return ranNum;
	}

}
