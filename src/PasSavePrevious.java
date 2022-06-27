import javax.swing.*;
import java.awt.*;

public class PasSavePrevious extends PasSaveFrame {

    private JButton buttonSearch;
    public PasSavePrevious() throws HeadlessException {
        startProgram();
    }

    private static int frameHeight = 800;
    private static int frameWidth = 500;


    private void startProgram(){
        PasSaveFrame pasSavFrame = new PasSaveFrame();
        pasSavFrame.startFrame(frameHeight,frameWidth);

        buttonSearch = new JButton("search");
        buttonSearch.setSize(150,30);
        buttonSearch.setLocation(100,100);
        buttonSearch.setVisible(true);


        add(new JLabel());
        add(buttonSearch);

        add(new JLabel());
        add(labelForBackground);
    }

}
