import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainWindow implements ActionListener {

    JFrame jFrame;
    JPanel topPanel, addPanel,  subtractPanel, bottomPanel, centrePanel;

    JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btAdd, btSubtract, btClear, btEquals;

    JTextField jTextField;

    int operand1, operand2, operandsResult=0;

    boolean isPlus = true;


    public mainWindow() {
        jFrame = new JFrame("simple calculator");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800, 800);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setLayout(new BorderLayout());
        jFrame.setLocationRelativeTo(null);

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
        jFrame.add(bottomPanel,BorderLayout.SOUTH);

        topPanel =  new JPanel();
        jTextField =  new JTextField();
        jTextField.setEditable(false);

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

        centrePanel = new JPanel();
        centrePanel.add(bt1);
        centrePanel.add(bt2);
        centrePanel.add(bt3);
        centrePanel.add(bt4);
        centrePanel.add(bt4);
        centrePanel.add(bt5);
        centrePanel.add(bt6);
        centrePanel.add(bt7);
        centrePanel.add(bt8);
        centrePanel.add(bt9);
        centrePanel.add(bt0);
        jFrame.add(centrePanel,BorderLayout.CENTER);
        jFrame.add(jTextField,BorderLayout.NORTH);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        bt0.addActionListener(this);



        btClear.addActionListener(new ActionListener() {



            public void actionPerformed(ActionEvent e) {
                isPlus = true;
                operandsResult = 0;
                operand1 = 0;
                jTextField.setText("");
            }
        });

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                                              
                jTextField.setText(jTextField.getText() + "1");
            }
        });

        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jTextField.setText(jTextField.getText() + "2");
            }
        });

        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jTextField.setText(jTextField.getText() + "3");
            }
        });

        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jTextField.setText(jTextField.getText() + "4");
            }
        });

        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jTextField.setText(jTextField.getText() + "5");
            }


        });

        bt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jTextField.setText(jTextField.getText() + "6");
            }
        });

        bt7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jTextField.setText(jTextField.getText() + "7");
            }
        });

        bt8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jTextField.setText(jTextField.getText() + "8");
            }
        });

        bt9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jTextField.setText(jTextField.getText() + "9");
            }
        });

        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jTextField.setText(jTextField.getText() + "0");
            }
        });

        btAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(jTextField.getText().isEmpty()) {
                    operand1 = 0;
                }
                if(isPlus == false){

                    String displayNumber = jTextField.getText();
                    operand1 = Integer.parseInt(displayNumber);
                    operandsResult-=operand1;

                }
                else {

                    String displayNumber = jTextField.getText();
                    operand1 = Integer.parseInt(displayNumber);
                    operandsResult += operand1;

                }
                jTextField.setText("");
                jTextField.setText("+");
                isPlus = true;




            }
        });

        btSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(jTextField.getText().isEmpty()) {
                    operand1 = 0;
                }

                if(isPlus == true){
                    String displayNumber = jTextField.getText();
                    operand1 = Integer.parseInt(displayNumber);
                    operandsResult+=operand1;

                }
                else {

                    String displayNumber = jTextField.getText();
                    operand1 = Integer.parseInt(displayNumber);
                    operandsResult -= operand1;

                }
                jTextField.setText("");
                jTextField.setText("-");
                isPlus = false;

            }
        });

        btEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(jTextField.getText().isEmpty()) {
                    operand1 = 0;
                }
                if(isPlus == false){
                    String displayNumber = jTextField.getText();
                    operand1 = Integer.parseInt(displayNumber);
                    operandsResult-=operand1;

                }
                else {

                    String displayNumber = jTextField.getText();
                    operand1 = Integer.parseInt(displayNumber);
                    operandsResult += operand1;

                }
                jTextField.setText("");
                String result = Integer.toString(operandsResult);
                jTextField.setText(result);
                isPlus = true;
            }
        });




    }





    public void actionPerformed(ActionEvent actionEvent){
//        jTextField.setText();
    }

}