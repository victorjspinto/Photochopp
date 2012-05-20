package photochopp;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ReadWrite {
	BufferedImage in;
	BufferedImage out;
	public BufferedImage Read(String path){
		try{
			in = ImageIO.read(new File(path));
		}catch(IOException e){
			System.out.println(e.getMessage());
		}finally{
			return in;
		}
	}
	public boolean Write(BufferedImage BI, String path){
		try{
			ImageIO.write(BI, "jpg", new File(path));
		}catch(IOException e){
			System.out.println(e.getMessage());
			return false;
		}finally{
			return true;
		}
	}
}
