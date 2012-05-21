package photochopp;

import java.awt.image.BufferedImage;

public class EfeitoMatrizGenerica extends Convolucao{
	public void aplicarEfeitoBlur(String caminhoOrigem, String caminhoDestino, float[][] filtro)
	{
		ImageLoader imgLoader = new ImageLoader();
		BufferedImage imagem = imgLoader.loadImage(caminhoOrigem);
		
		super.aplicarFiltro(filtro, imagem);
		
		imgLoader.WriteImage(imagem, caminhoDestino);
	}


}
