/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class DemoJRadioButton extends JFrame {

    private JLabel lbNum1, lbNum2, lbResult,lbOp;
    private JTextField txtNum1, txtNum2, txtResult;
    private JButton btnTinh,btnNhapLai;
    private JRadioButton rdAdd, rdSub, rdMul, rdDiv;

    public DemoJRadioButton(String title) {
        super(title);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5, 2, 10, 10));
        p.add(lbNum1 = new JLabel("Num1"));
        p.add(lbNum2 = new JLabel("Num2"));

        p.add(txtNum1 = new JTextField(10));
        p.add(txtNum2 = new JTextField(10));

        JPanel pPhepTinh = new JPanel();
        pPhepTinh.add(rdAdd = new JRadioButton("+"));
        pPhepTinh.add(rdSub = new JRadioButton("-"));
        pPhepTinh.add(rdMul = new JRadioButton("*"));
        pPhepTinh.add(rdDiv = new JRadioButton("/"));
        
        p.add(lbOp = new JLabel("Phép tính"));
        p.add(pPhepTinh);
        
        p.add(lbResult = new JLabel("Result"));
        p.add(txtResult = new JTextField(10));
        txtResult.setEditable(false);
        
        p.add(btnTinh = new JButton("Tính"));
        p.add(btnNhapLai = new JButton("Nhập lại"));
        
        add(p);

        ButtonGroup btgPhepTinh = new ButtonGroup();
        btgPhepTinh.add(rdAdd);
        btgPhepTinh.add(rdSub);
        btgPhepTinh.add(rdMul);
        btgPhepTinh.add(rdDiv);
        
        rdAdd.setSelected(true);
        
        
        btnTinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x = Double.parseDouble(txtNum1.getText());
                    double y = Double.parseDouble(txtNum2.getText());
                    double kq=0;
                    
                    if(rdAdd.isSelected()){
                        kq=x+y;
                    }else if(rdSub.isSelected()){
                        kq=x-y;
                    }else if(rdMul.isSelected()){
                        kq=x*y;
                    }else{
                        kq=x/y;
                    }
                    
                    txtResult.setText(String.valueOf(kq));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Lỗi nhập liệu","thông báo",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        btnNhapLai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNum1.setText("");
                txtNum2.setText("");
                txtResult.setText("");
                rdAdd.setSelected(true);
                
                txtNum1.requestFocus();
            }
        });
        
        
        
        setResizable(false); //khóa phóng to nhỏ
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        DemoJRadioButton frm = new DemoJRadioButton("Simple Calculator");
        frm.setVisible(true);
    }
}
