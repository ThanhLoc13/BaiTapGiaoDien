/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class SimpleCalculator extends JFrame {

    private JLabel lbNum1, lbNum2, lbResult;
    private JTextField txtNum1, txtNum2, txtResult;
    private JButton btnAdd, btnSub, btnMul, btnDiv,btnEnd;

    public SimpleCalculator(String title) {
        super(title);

        JPanel p = new JPanel();
        p.setLayout(null);
        p.add(lbNum1 = new JLabel("Num1"));
        p.add(lbNum2 = new JLabel("Num2"));
        p.add(lbResult = new JLabel("Result"));

        p.add(txtNum1 = new JTextField(10));
        p.add(txtNum2 = new JTextField(10));
        p.add(txtResult = new JTextField(10));

        p.add(btnAdd = new JButton("Cộng"));
        p.add(btnSub = new JButton("Trừ"));
        p.add(btnMul = new JButton("Nhân"));
        p.add(btnDiv = new JButton("Chia"));
        p.add(btnEnd = new JButton("Kết thúc"));

        lbNum1.setBounds(10, 10, 250, 30);
        txtNum1.setBounds(120, 10, 400, 30);

        lbNum2.setBounds(10, 50, 250, 30);
        txtNum2.setBounds(120, 50, 400, 30);

        lbResult.setBounds(10, 100, 250, 30);
        txtResult.setBounds(120, 100, 400, 30);

        btnAdd.setBounds(20, 150, 85, 40);
        btnSub.setBounds(120, 150, 85, 40);
        btnMul.setBounds(220, 150, 85, 40);
        btnDiv.setBounds(320, 150, 85, 40);
        btnEnd.setBounds(415, 150, 85, 40);
        
        //phép cộng
        btnAdd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                double x = Double.parseDouble(txtNum1.getText());
                double y = Double.parseDouble(txtNum2.getText());
                double kq = x+y;
                txtResult.setText(String.valueOf(kq));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ");
                }
            }          
        });
        //phép trừ
        btnSub.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                double x = Double.parseDouble(txtNum1.getText());
                double y = Double.parseDouble(txtNum2.getText());
                double kq = x-y;
                txtResult.setText(String.valueOf(kq));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ");
                }
            }          
        });
        //phép nhân
        btnMul.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                double x = Double.parseDouble(txtNum1.getText());
                double y = Double.parseDouble(txtNum2.getText());
                double kq = x*y;
                txtResult.setText(String.valueOf(kq));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ");
                }
            }          
        });
        //phép chia
        btnDiv.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                double x = Double.parseDouble(txtNum1.getText());
                double y = Double.parseDouble(txtNum2.getText());
                double kq = x/y;
                txtResult.setText(String.valueOf(kq));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ");
                }
            }          
        });
        
        btnEnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int chon = JOptionPane.showConfirmDialog(null, "bạn có chắc đóng ứng dụng không?","Exit",JOptionPane.YES_NO_OPTION);
                if(chon ==JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
        
        
        
        
        add(p);
        setResizable(false); //khóa phóng to nhỏ
        setSize(550, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SimpleCalculator frm = new SimpleCalculator("Simple Calculator");
        frm.setVisible(true);
    }
}
