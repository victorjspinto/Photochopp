package filters;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import photochopp.ReadWrite;

public class BlurFilter {
	private BufferedImage sourceImage;
	private BufferedImage destImage;
	private BufferedImage blurredImage;

	public float[] Intensidade(int i) {
		if (i == 1)
			return new float[] { 0.111f, 0.111f, 0.111f, 0.111f, 0.111f,
					0.111f, 0.111f, 0.111f, 0.111f, };
		if (i == 2) {
			float[] matriz2 = new float[400];
			for (int k = 0; k < 400; k++) 
			{
				matriz2[k] = 1.0f / 400.f;
			}
			return matriz2;
		}
		return null;
	}

	public BlurFilter(String path) {
		sourceImage = new ReadWrite().Read(path);

		BufferedImageOp BI = new ConvolveOp(new Kernel(3, 3, Intensidade(1)));

		blurredImage = BI.filter(sourceImage, destImage);

		StringBuilder bd = new StringBuilder(path);
		bd.setCharAt(bd.length() - 5, '1');

		new ReadWrite().Write(blurredImage, bd.toString());

	}
	
	public BufferedImage getImage(){
		return blurredImage;
	}

}
