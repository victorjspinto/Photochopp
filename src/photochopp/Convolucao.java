package photochopp;

import java.awt.image.BufferedImage;

public abstract class Convolucao 
{
	public void aplicarFiltro(float[][] filtro, BufferedImage imagem)
	{
		int imgWidth = imagem.getWidth();
		int imgHeight = imagem.getHeight();
		
		int middleFilter = filtro.length / 2;
		
		for(int imgW = 0; imgW< imgWidth; imgW++)
			for(int imgH = 0; imgH < imgHeight; imgH++)
			{
				int resultRed = 0;
				int resultGreen = 0;
				int resultBlue = 0;
				for(int filW = 0; filW < filtro.length; filW++)
					for(int filH = 0; filH < filtro[filW].length; filH++)
					{
						int targetW = imgW + (filW - middleFilter);
						int targetH = imgH + (filH - middleFilter);
						RGB targetRGB = null;
						
						if(targetW < 0 || targetH < 0 || targetW > imgWidth - 1 || targetH > imgHeight - 1)
							continue;
						
						targetRGB = new RGB(imagem.getRGB(targetW, targetH));
						
						resultBlue += targetRGB.getBlue() * filtro[filW][filH];
						resultRed += targetRGB.getRed() * filtro[filW][filH];
						resultGreen += targetRGB.getGreen() * filtro[filW][filH];
					}
				imagem.setRGB(imgW, imgH, new RGB(resultBlue, resultRed, resultGreen).getHexadecimal());	
			}
	}
}
