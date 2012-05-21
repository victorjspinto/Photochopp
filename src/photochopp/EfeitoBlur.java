package photochopp;

import java.awt.image.BufferedImage;
import java.security.spec.MGF1ParameterSpec;

public class EfeitoBlur extends Convolucao {

	
	public float[]  asd = {1,1,1};
	
	public static final float[][] filtro= 
		{
			{0.0352f, 0.0387f, 0.0398f, 0.0387f, 0.0352f},
			{0.0387f, 0.0425f, 0.0438f, 0.0425f, 0.0387f},
			{0.0398f, 0.0438f, 0.0452f, 0.0438f, 0.0398f},
			{0.0387f, 0.0425f, 0.0438f, 0.0425f, 0.0387f},
			{0.0352f, 0.0387f, 0.0398f, 0.0387f, 0.0352f}
		};

	public void aplicarEfeitoBlur(String caminhoOrigem)
	{
		String caminhoDestino = caminhoOrigem + "(Blur)";
		ImageLoader imgLoader = new ImageLoader();
		BufferedImage imagem = imgLoader.loadImage(caminhoOrigem);
		
		super.aplicarFiltro(filtro, imagem);
		
		imgLoader.WriteImage(imagem, caminhoDestino);
	}
	
}
