package photochopp;

import java.awt.image.BufferedImage;

public class EfeitoNegativo 
{
	public void aplicarEfeitoNegativo(String caminhoOrigem, String caminhoDestino)
	{
		ImageLoader imgLoader = new ImageLoader();
		BufferedImage imagem = imgLoader.loadImage(caminhoOrigem);
		int imgWidth = imagem.getWidth();
		int imgHeigth = imagem.getHeight();
		
		BufferedImage imagemDestino = new BufferedImage(imgWidth, imgHeigth, BufferedImage.TYPE_INT_BGR);
		
		for (int i = 0; i < imgWidth; i++)
			for (int j = 0; j < imgHeigth; j++) {
				RGB pixel = new RGB(imagem.getRGB(i, j));

				pixel.setRed(255 - pixel.getRed());
				pixel.setBlue(255 - pixel.getBlue());
				pixel.setGreen(255 - pixel.getGreen());
				
				imagemDestino.setRGB(i, j, pixel.getHexadecimal());
			}
		
		imgLoader.WriteImage(imagemDestino, caminhoDestino);
	}
}
