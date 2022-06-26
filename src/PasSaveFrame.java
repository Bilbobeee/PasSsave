import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasSaveFrame extends JFrame {

    int frameWidth ;
    int frameHeight ;

    public PasSaveFrame() throws HeadlessException {

    }

    public void startFrame(int frameHeight, int frameWidth){
        ImageIcon image = new ImageIcon("D:\\MY-DEV\\PaSSave\\PasSsave\\resources\\background.jpg");
        JLabel background = new JLabel("",image,JLabel.CENTER);
        background.setBounds(0,0,300,800);
        background.setLayout(null);

        this.frameHeight = frameHeight;
        this.frameWidth = frameWidth;

        JPanel panel = new JPanel();
        Button buttonSearch = new Button("search");

        buttonSearch.setVisible(true);
        buttonSearch.setBounds(100,300,100,30);
        panel.add(buttonSearch);
        panel.setLayout(null);


        add(background);
        getContentPane().add(panel);


        buttonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(this.getClass().getClassLoader().getResource(""));
            }
        });

        setSize(frameWidth,frameHeight);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
