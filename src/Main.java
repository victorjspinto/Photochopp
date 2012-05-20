import java.io.IOException;

import filters.BlurFilter;
import filters.ColorFilter;
import filters.RotateFilter;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		blurTest();
	}
	
	public static void colorTest() {
		new ColorFilter("/home/luk4x/Projects/Photochopp/image.jpg");
	}

	public static void blurTest() {
		new BlurFilter("/home/luk4x/Projects/Photochopp/image.jpg");
	}
	
	public static void rotateTest() throws IOException {
		new RotateFilter("/home/luk4x/Projects/Photochopp/image.jpg", 0);
	}
}
