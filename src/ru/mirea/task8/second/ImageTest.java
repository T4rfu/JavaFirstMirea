import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.Scanner;

public class ImageTest{
    public static String name;
    public static void main(String[] args)
    {
                System.out.println("Введите путь картинки: ");
                Scanner console  = new Scanner(System.in);
                name = console.nextLine();

                ImageFrame frame = new ImageFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
    }
}
class ImageFrame extends JFrame
{
    public ImageFrame()
    {
        setTitle("Image");
        setSize(1920, 1080);
        ImageComponent component = new ImageComponent();
        add(component);
    }
}
class ImageComponent extends JComponent
{
    public ImageComponent()
    {
        try
        {
            image = ImageIO.read(new File(ImageTest.name));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics g)
    {
        if(image == null) return;
        int imageWidth = image.getWidth(this);
        int imageHeight = image.getHeight(this);
        g.drawImage(image, 0, 0, null);
    }
    private Image image;
}