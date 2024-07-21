import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.util.Scanner;

public class Calculator extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField input;
    private double answer, number;
    int operation;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator frame = new Calculator();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void calculate() {
        switch (operation) {
            case 1:
                answer = number + Double.parseDouble(input.getText());
                input.setText(Double.toString(answer));
                break;
            case 2:
                answer = number - Double.parseDouble(input.getText());
                input.setText(Double.toString(answer));
                break;
            case 3:
                answer = number * Double.parseDouble(input.getText());
                input.setText(Double.toString(answer));
                break;
            case 4:
                answer = number / Double.parseDouble(input.getText());
                input.setText(Double.toString(answer));
                break;
        }
    }

    public void addInput(String str) {
        input.setText(input.getText() + str);
    }

    /**
     * Create the frame.
     */
    public Calculator() {
        setTitle("Calculator");
        setType(Type.UTILITY);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel screen = new JPanel();
        screen.setBounds(10, 10, 366, 61);
        contentPane.add(screen);
        screen.setLayout(null);

        input = new JTextField();
        input.setEditable(false);
        input.setHorizontalAlignment(SwingConstants.RIGHT);
        input.setFont(new Font("Tahoma", Font.BOLD, 24));
        input.setBounds(0, 20, 366, 41);
        screen.add(input);
        input.setColumns(10);

        JLabel lbl = new JLabel("");
        lbl.setFont(new Font("Tahoma", Font.BOLD, 10));
        lbl.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl.setBounds(0, 0, 366, 23);
        screen.add(lbl);

        JPanel control = new JPanel();
        control.setBounds(10, 81, 366, 372);
        contentPane.add(control);
        control.setLayout(new GridLayout(4, 3, 20, 20));

        JButton btnNewButton = new JButton("5");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });

        JButton btnNewButton_3 = new JButton("7");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 23));
        control.add(btnNewButton_3);

        JButton btnNewButton_1_1 = new JButton("8");
        btnNewButton_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
        control.add(btnNewButton_1_1);

        JButton btnNewButton_1 = new JButton("9");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
        control.add(btnNewButton_1);

        JButton btnNewButton_2_1 = new JButton("+");
        btnNewButton_2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(input.getText());
                operation = 1;
                input.setText("");
                lbl.setText(number + e.getActionCommand());
            }
        });
        btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 23));
        control.add(btnNewButton_2_1);

        JButton btnNewButton_2 = new JButton("4");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 23));
        control.add(btnNewButton_2);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
        control.add(btnNewButton);

        JButton btnNewButton_2_2 = new JButton("6");
        btnNewButton_2_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 23));
        control.add(btnNewButton_2_2);

        JButton btnNewButton_1_2 = new JButton("-");
        btnNewButton_1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(input.getText());
                operation = 2;
                input.setText("");
                lbl.setText(number + e.getActionCommand());
            }
        });
        btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 23));
        control.add(btnNewButton_1_2);

        JButton btnNewButton_1_4 = new JButton("1");
        btnNewButton_1_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 23));
        control.add(btnNewButton_1_4);

        JButton btnNewButton_1_3 = new JButton("2");
        btnNewButton_1_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 23));
        control.add(btnNewButton_1_3);

        JButton btnNewButton_1_3_1 = new JButton("3");
        btnNewButton_1_3_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        btnNewButton_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 23));
        control.add(btnNewButton_1_3_1);

        JButton btnNewButton_1_5 = new JButton("*");
        btnNewButton_1_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(input.getText());
                operation = 3;
                input.setText("");
                lbl.setText(number + e.getActionCommand());
            }
        });
        btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 23));
        control.add(btnNewButton_1_5);

        JButton btnNewButton_1_6 = new JButton("0");
        btnNewButton_1_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput(e.getActionCommand());
            }
        });
        btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 23));
        control.add(btnNewButton_1_6);

        JButton btnNewButton_1_3_2 = new JButton("=");
        btnNewButton_1_3_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (operation > 0 && operation < 4) {
                    calculate();
                    lbl.setText("");
                } else if (operation == 4) {
                    if(Double.parseDouble(input.getText()) == 0) {
                        input.setText("Can not divide by zero");
                        lbl.setText("");
                    } else {
                        calculate();
                        lbl.setText("");
                    }
                }

            }
        });
        btnNewButton_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 23));
        control.add(btnNewButton_1_3_2);

        JButton btnNewButton_1_3_3 = new JButton("C");
        btnNewButton_1_3_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText("");
                lbl.setText("");
            }
        });
        btnNewButton_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 23));
        control.add(btnNewButton_1_3_3);

        JButton btnNewButton_1_3_4 = new JButton("/");
        btnNewButton_1_3_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number = Double.parseDouble(input.getText());
                operation = 4;
                input.setText("");
                lbl.setText(number + e.getActionCommand());
            }
        });
        btnNewButton_1_3_4.setFont(new Font("Tahoma", Font.BOLD, 23));
        control.add(btnNewButton_1_3_4);
    }
}

