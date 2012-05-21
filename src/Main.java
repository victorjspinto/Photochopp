import java.io.IOException;
import java.util.Arrays;

import photochopp.EfeitoBlur;
import photochopp.EfeitoBorda;
import photochopp.EfeitoMatrizGenerica;
import photochopp.EfeitoNegativo;
import photochopp.EfeitoPretoBranco;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Nenhum argumento informado");
			return;
		}

		if (args[0].equals("complemento")) {
			Complemento(args);
		} else if (args[0].equals("rgb-para-cinza")) {
			RgbParaCinza(args);
		} else if (args[0].equals("bordas")) {
			Bordas(args);
		} else if (args[0].equals("filtro-gaussiano")) {
			FiltroGaussiano(args);
		} else if (args[0].equals("filtro-linear")) {
			FiltroLinear(args);
		} else {
			System.out.println("Argumento informato nao identificado.");
		}

	}

	private static void FiltroLinear(String[] args) {
		int k = Integer.parseInt(args[1]);
		int index = 2;
		float[][] filtro = new float[k][k];
		
		for(int i = 0; i < k;i++)
			for(int j = 0; j < k;j++)
			{
				filtro[i][j] = Float.parseFloat(args[index]);
				index++;
			}
		new EfeitoMatrizGenerica().aplicarEfeitoBlur(args[index], args[index+1], filtro);
	}

	private static void FiltroGaussiano(String[] args) {
		new EfeitoBlur().aplicarEfeitoBlur(args[1], args[2]);
	}

	private static void Bordas(String[] args) {
		new EfeitoBorda().aplicarEfeitoBorda(Integer.parseInt(args[1]),
				args[2], args[3]);
	}

	private static void RgbParaCinza(String[] args) {
		new EfeitoPretoBranco().aplicarEfeitoPretoBranco(args[1], args[2]);
	}

	private static void Complemento(String[] args) {
		new EfeitoNegativo().aplicarEfeitoNegativo(args[1], args[2]);
	}
}
