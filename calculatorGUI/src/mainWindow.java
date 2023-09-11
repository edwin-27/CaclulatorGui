import javax.swing.*;
import java.awt.*;

public class mainWindow {

    JFrame jFrame;
    JPanel topPanel, addPanel,  subtractPanel, bottomPanel;

    JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btAdd, btSubtract, btClear, btEquals;

    JTextField jTextField;


    public mainWindow() {
        jFrame = new JFrame("simple calculator");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800, 800);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

        addPanel = new JPanel();
        btAdd = new JButton("+");
        addPanel.add(btAdd);
        jFrame.add(addPanel, BorderLayout.EAST);

        subtractPanel = new JPanel();
        btSubtract =  new JButton("-");
        subtractPanel.add(btSubtract);
        jFrame.add(subtractPanel, BorderLayout.WEST);

        bottomPanel = new JPanel();
        btEquals = new JButton("=");
        btClear = new JButton("clear");
        bottomPanel.add(btEquals);
        bottomPanel.add(btClear);

        topPanel =  new JPanel();
        jTextField =  new JTextField();

        bt1 = new JButton("1");
        bt2 =  new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 =  new JButton("5");
        bt6 = new JButton("6");
        bt7 = new JButton("7");
        bt8 = new JButton("8");
        bt9 = new JButton("9");
        bt0 = new JButton("0");






    }
}
