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
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import photochopp.ReadWrite;

public class RotateFilter {
	private BufferedImage img;
	// private BufferedImage saidaBI =null;
	// private Insets fInsets;

	public RotateFilter(String path, int degrees){
		img = new ReadWrite().Read(path);
		
		Graphics2D g2d = (Graphics2D) img.getGraphics();
		
		AffineTransform at = new AffineTransform();
		at.rotate(2);
		g2d.drawImage(img, at, null);
		
		
		new ReadWrite().Write(img, path + "1");
			
		

	}
}
