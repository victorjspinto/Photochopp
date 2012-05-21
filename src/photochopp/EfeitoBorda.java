package photochopp;

import java.awt.image.BufferedImage;

public class EfeitoBorda extends Convolucao{

	public static final float[][] primeiroFiltro = { 
		{ -1.0f, 0.0f, +1.0f },
		{ -2.0f, 0.0f, +2.0f }, 
		{ -1.0f, 0.0f, +1.0f } 
	};

	public static final float[][] segundoFiltro = { 
		{ -1.0f, -2.0f, -1.0f },
		{ 0.0f, 0.0f, 0.0f }, 
		{ +1.0f, +2.0f, +1.0f } 
	};
	
	public void aplicarEfeitoBorda(int limiar,String caminhoOrigem, String caminhoDestino)
	{
		ImageLoader imgLoader = new ImageLoader();
		BufferedImage imagemGx = imgLoader.loadImage(caminhoOrigem);
		BufferedImage imagemGy = imgLoader.loadImage(caminhoOrigem);

		RGB selected = new RGB(0);
		selected.setAlpha(255);
		selected.setBlue(255);
		selected.setGreen(255);
		selected.setRed(255);
		
		super.aplicarFiltro(primeiroFiltro, imagemGx);
		super.aplicarFiltro(segundoFiltro, imagemGy);

		new ImageLoader().WriteImage(imagemGx, caminhoDestino);
		
		for(int imageW = 0; imageW < imagemGx.getWidth(); imageW++)
			for(int imageH = 0; imageH < imagemGx.getHeight(); imageH++)
			{
				int G = new RGB(imagemGx.getRGB(imageW, imageH)).getBlue() ^ 2;
				G += new RGB(imagemGy.getRGB(imageW, imageH)).getBlue() ^ 2;
				if(G >= limiar)
					imagemGx.setRGB(imageW, imageH, selected.getHexadecimal());
				else
					imagemGx.setRGB(imageW, imageH, 0);					
			}
		imgLoader.WriteImage(imagemGx, caminhoDestino);
	}
}
