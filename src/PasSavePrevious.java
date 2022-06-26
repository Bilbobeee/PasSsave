import javax.swing.*;
import java.awt.*;

public class PasSavePrevious extends PasSaveFrame {
    public PasSavePrevious() throws HeadlessException {
        startProgram();

    }

    private static int frameHeight = 600;
    private static int frameWidht = 400;


    private void startProgram(){
        PasSaveFrame pasSavFrame = new PasSaveFrame();
        pasSavFrame.startFrame(frameHeight,frameWidht);




    }

}
