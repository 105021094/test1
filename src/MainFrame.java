import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame{
    private int frmW = 300,frmH = 150,screenW,screenH;
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    private JLabel jlab = new JLabel("資工系林馥柔");
    public MainFrame(){
        initcomp();
    }
    private void initcomp(){
    screenW = dim.width;
    screenH = dim.height;
    this.setBounds(screenW/2-frmW-2,screenH/2-frmH/2,frmW,frmH);
    this.setLayout(null);
    this.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            super.windowClosing(e);
            System.exit(0);
        }
    });
    jlab.setOpaque(true);
    jlab.setBackground(Color.yellow);
    jlab.setBounds(10,10,100,50);
    this.add(jlab);
    }
}
