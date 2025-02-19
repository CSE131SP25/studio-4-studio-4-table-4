package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(255, 175, 175);
		StdDraw.filledRectangle(50, 50, 50, 50);
		StdDraw.setPenColor(0, 255, 255);
		StdDraw.filledEllipse(0.2, 0.2, 0.15, 0.5);
		StdDraw.filledEllipse(0.6, 0.6, 0.5, 0.15);
		StdDraw.setPenColor(255, 200, 0);
		StdDraw.filledRectangle(0.7, 0.7, 0.1, 0.1);
		
	}
}