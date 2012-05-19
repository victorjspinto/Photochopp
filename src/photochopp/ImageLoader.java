package photochopp;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	public BufferedImage loadImage(String imageLocation) {
		BufferedImage img = null;
		try 
		{
			img = ImageIO.read(new File(imageLocation));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
	}

	public BufferedImage createImage(String caminhoDestino) {
		return null;
		//ImageIO.write(, "png", new File(caminhoDestino));
	}

	public void WriteImage(BufferedImage imagem, String caminho) {
		// TODO Auto-generated method stub
		
	}
}
