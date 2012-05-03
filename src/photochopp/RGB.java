package photochopp;

import java.awt.Color;

public class RGB {

	private int red;
	private int green;
	private int blue;
	private int alpha;

	public RGB(int hexadecimal) {
		this.blue 	= (hexadecimal & 0x000000FF);
		this.green 	= (hexadecimal & 0x0000FF00) >> 8;
		this.red 	= (hexadecimal & 0x00FF0000) >> 16;
		this.alpha 	= (hexadecimal & 0xFF000000) >>> 24;
	}

	public void setRGB(int hexadecimal) {
		Color color = new Color(hexadecimal);
		this.green = color.getGreen();
		this.red = color.getRed();
		this.blue = color.getBlue();
		this.alpha = color.getAlpha();
	}

	public int getHexadecimal() {
		return (alpha << 24) | (red << 16) | (green << 8) | blue;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	public int getAlpha() {
		return alpha;
	}

	public void setAlpha(int alpha) {
		this.alpha = alpha;
	}

}
