import java.io.IOException;

import photochopp.EfeitoBlur;

import filters.BlurFilter;
import filters.ColorFilter;
import filters.RotateFilter;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		new EfeitoBlur().aplicarEfeitoBlur("/home/viktor/Workspace/Photochopp/image.jpg");
	}
	
	public static void colorTest() {
		new ColorFilter("/home/viktor/Workspace/Photochopp/image.jpg");
	}

	public static void blurTest() {
		new BlurFilter("/home/viktor/Workspace/Photochopp/image.jpg");
	}
	
	public static void rotateTest() throws IOException {
		new RotateFilter("/home/viktor/Workspace/Photochopp/image.jpg", 0);
	}
}
