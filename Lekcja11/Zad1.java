package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Zad1 {
    public static void main(String[] args) {
        JFrame window = new JFrame("Program zamieniający stopnie Celsjusza na  Fahrenheita");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(800, 200);
        window.setLocationRelativeTo(null);
        window.setLayout(null);
        JLabel num1 = new JLabel("Podaj stopnie Celsjusza");
        num1.setBounds(400, 20, 300, 30);
        window.add(num1);
        JLabel add = new JLabel("Stopnie Fahrenheita: ");
        add.setBounds(250, 120, 200, 30);
        window.add(add);
        JTextField textNum1 = new JTextField();
        textNum1.setBounds(290, 25, 100, 25);
        window.add(textNum1);

        JButton button = new JButton("Oblicz");
        button.setBounds(290, 90, 100, 30);
        window.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String num1 = textNum1.getText();
                Integer.parseInt(num1);
                int sum = (int) (Integer.parseInt(num1) * 1.8 + 32);
                add.setText("Stopnie Fahrenheita: " + sum );

            }
        }
        );
        window.setVisible(true);
    }
}
