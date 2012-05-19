package photochopp;

import java.awt.image.BufferedImage;

public abstract class Convolucao 
{
	public void aplicarFiltro(float[][] filtro, BufferedImage imagem)
	{
		int imgWidth = imagem.getWidth();
		int imgHeight = imagem.getHeight();
		
		for(int imgW = 0; imgW< imgWidth; imgW++)
			for(int imgH = 0; imgH < imgHeight; imgH++)
			{
				int result = 0;
				for(int filW = 0; filW < filtro.length; filW++);
					for(int filH = 0; filH < filtro[filW].length; filH++)
						
			}
	}
}
