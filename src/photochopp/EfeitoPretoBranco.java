package photochopp;

import java.awt.image.BufferedImage;

public class EfeitoPretoBranco 
{
	public void aplicarEfeitoPretoBranco(String caminhoOrigem, String caminhoDestino)
	{
		ImageLoader imgLoader = new ImageLoader();
		BufferedImage imagem = imgLoader.loadImage(caminhoOrigem);
		int imgWidth = imagem.getWidth();
		int imgHeigth = imagem.getHeight();
		
		BufferedImage imagemDestino = new BufferedImage(imgWidth, imgHeigth, BufferedImage.TYPE_BYTE_GRAY);
		
		for (int i = 0; i < imgWidth; i++)
			for (int j = 0; j < imgHeigth; j++) {
				RGB pixel = new RGB(imagem.getRGB(i, j));

				int intensity = (int) (pixel.getRed() * .3 + pixel.getGreen() * .59
						+ pixel.getBlue() * .11);
				pixel.setBlue(intensity);
				pixel.setRed(intensity);
				pixel.setGreen(intensity);
				imagemDestino.setRGB(i, j, pixel.getHexadecimal());
			}
		
		imgLoader.WriteImage(imagemDestino, caminhoDestino);
	}
}
