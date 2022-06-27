import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasSaveFrame extends JFrame {

    JLabel labelForBackground;
    int frameWidth ;
    int frameHeight ;

    public PasSaveFrame() throws HeadlessException {
        super("PasSaVe");


    }

    public void startFrame(int frameHeight, int frameWidth){
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("resources/icons(passave).png"));
        setIconImage(icon.getImage());

        ImageIcon imageBackground = new ImageIcon(getClass().getClassLoader().getResource("resources/background(500x800).jpg"));
        labelForBackground = new JLabel(imageBackground);
        labelForBackground.setSize(500,800);


        this.frameHeight = frameHeight;
        this.frameWidth = frameWidth;

        setSize(frameWidth,frameHeight);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
