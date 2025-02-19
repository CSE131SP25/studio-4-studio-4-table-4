package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType=in.next();
		int red=in.nextInt();
		int green=in.nextInt();
		int blue=in.nextInt();
		boolean isFilled=in.nextBoolean();
		double x=in.nextDouble();
		double y=in.nextDouble();
		double Halfwidth=in.nextDouble();
		double HalfHeight=in.nextDouble();
		if(shapeType.equals("rectangle") && isFilled==true){
			StdDraw.setPenColor(red,green,blue);
			StdDraw.filledRectangle(x, y, Halfwidth, HalfHeight);
			}
		if(shapeType.equals("rectangle") && isFilled==false) {
			StdDraw.rectangle(x, y, Halfwidth, HalfHeight);
		}
		if(shapeType.equals("ellipse") && isFilled==false) {
			StdDraw.ellipse(x, y, HalfHeight, Halfwidth);
		}
		if(shapeType.equals("ellipse") && isFilled==true) {
			StdDraw.setPenColor(red,green,blue);
			StdDraw.filledEllipse(x, y, HalfHeight, Halfwidth);
		}

		}
	}

