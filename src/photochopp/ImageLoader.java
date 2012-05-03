package photochopp;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	public void loadImage(String imageLocation) {
		BufferedImage img;
		try {
			img = ImageIO.read(new File(imageLocation));
			final int red = 0xFF0000FF;
			final int green = 0xFF00FF00;
			final int blue = 0xFFFF0000;
			for (int i = 0; i < img.getWidth(); i++)
				for (int j = 0; j < img.getHeight(); j++) {
					RGB pixel = new RGB(img.getRGB(i, j));
					new BufferedImage(800, 600, BufferedImage.TYPE_BYTE_GRAY);
//					Negativo
//					pixel.setRed(255 - pixel.getRed());
//					pixel.setBlue(255 - pixel.getBlue());
//					pixel.setGreen(255 - pixel.getGreen());
					
//					Preto e Branco
//					int intensity = (int) (pixel.getRed() * .3 + pixel.getGreen() * .59
//							+ pixel.getBlue() * .11);
//					pixel.setRed(intensity);
//					pixel.setGreen(intensity);
//					pixel.setBlue(intensity);

					float[][] teste= {
							{1,1,1},
							{1,1,1},
							{1,1,1}
					};
					
					
					img.setRGB(i, j, pixel.getHexadecimal());
				}

			ImageIO.write(img, "png", new File(imageLocation + "1"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
