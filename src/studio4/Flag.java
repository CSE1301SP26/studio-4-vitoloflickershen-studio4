package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color purple = new Color(200, 0, 255);
		StdDraw.setPenColor(purple);
		StdDraw.filledCircle(0.5, 0.5, 0.15);
		Color navy = new Color(0, 0, 128);
		StdDraw.setPenColor(navy);
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		StdDraw.setPenColor(navy);
		StdDraw.filledCircle(0.25, 0.5, 0.065);
		Color silver = new Color (192, 192, 192);
		StdDraw.setPenColor(silver);
		StdDraw.filledCircle(0.25, 0.5, 0.05);
		StdDraw.setPenColor(navy);
		StdDraw.filledCircle(0.75, 0.5, 0.065);
		StdDraw.setPenColor(silver);
		StdDraw.filledCircle(0.75, 0.5, 0.05);
		Color green = new Color (0, 128, 0);
		StdDraw.setPenColor(green);
		StdDraw.filledRectangle(0.5,0.3, 0.5, 0.02);
		StdDraw.filledRectangle(0.5,0.7, 0.5, 0.02);



	}
}