import java.awt.Color;

/* 
 * The program morphs an image into its grescaled version. 
 */

public class Editor4 {
    public static void main (String[] args) {
        String imageName = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] image = Runigram.read(imageName);
		Color[][] greyImage = Runigram.grayScaled(image);
		Runigram.setCanvas(image);
		Runigram.morph(image, greyImage, n);
    }
}
