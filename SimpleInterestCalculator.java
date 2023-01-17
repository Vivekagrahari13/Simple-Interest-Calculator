package simple.interest.calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SimpleInterestCalci extends JFrame
{
    JPanel p1,p2;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3;
    JButton b;
    class Calculation implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                String s1=t1.getText();
                String s2=t2.getText();
                String s3=t3.getText();
                
                double p=Double.parseDouble(s1);
                double r=Double.parseDouble(s2);
                double t=Double.parseDouble(s3);
                
                double si=(p*r*t)/100.0;
                double fin_amt=p+si;
                l5.setText(si+"");
                l7.setText(fin_amt+"");
            }
            catch(Exception x){
                JOptionPane.showMessageDialog(null, "Invalid Input");
            } 
    }
    }
    SimpleInterestCalci()
    {
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(450,550);//W,H
        setLocationRelativeTo(null);
        setTitle("Simple Interest Calcultator");
        getContentPane().setBackground(Color.BLACK);
        
        Font f1=new Font(Font.MONOSPACED,Font.BOLD,18);
        Font f2=new Font(Font.SANS_SERIF,Font.BOLD,21);
        
        p1=new JPanel();
        p1.setBackground(Color.CYAN);
        p1.setBounds(10,10,413,350);
        p1.setLayout(null);
        add(p1);
        
        l1=new JLabel("Principle:");
        l1.setBounds(30,20,170,30);
        l1.setFont(f1);
        p1.add(l1);
        
        t1=new JTextField();
        t1.setBounds(220,20,150,30);
        t1.setFont(f2);
        t1.setForeground(Color.RED);
        t1.setHorizontalAlignment(0);
        p1.add(t1);
        
        l2=new JLabel("Rate(in %):");
        l2.setBounds(30,70,170,30);
        l2.setFont(f1);
        p1.add(l2);
        
        t2=new JTextField();
        t2.setBounds(220,70,150,30);
        t2.setFont(f2);
        t2.setForeground(Color.RED);
        t2.setHorizontalAlignment(0);
        p1.add(t2);
        
        l3=new JLabel("Time(in years):");
        l3.setBounds(30,120,170,30);
        l3.setFont(f1);
        p1.add(l3);
        
        t3=new JTextField();
        t3.setBounds(220,120,150,30);
        t3.setFont(f2);
        t3.setForeground(Color.RED);
        t3.setHorizontalAlignment(0);
        p1.add(t3);
        
        b=new JButton("Find");
        b.addActionListener(new Calculation());//Registeration
        b.setFont(f1);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(170,200,80,45);
        p1.add(b);
        
        p2=new JPanel();
        p2.setBackground(Color.YELLOW);
        p2.setBounds(10,370,413,130);
        p2.setLayout(null);
        add(p2);
        
        l4=new JLabel("Interest Amount:");
        l4.setBounds(30,20,190,30);
        l4.setFont(f1);
        p2.add(l4);
        
        l5=new JLabel("----------");
        l5.setBounds(240,20,150,30);
        l5.setFont(f1);
        p2.add(l5);
        
        l6=new JLabel("Final Balance:");
        l6.setBounds(30,70,190,30);
        l6.setFont(f1);
        p2.add(l6);
        
        l7=new JLabel("----------");
        l7.setBounds(240,70,150,30);
        l7.setFont(f1);
        p2.add(l7);
    }
}
public class SimpleInterestCalculator {
    public static void main(String[] args) {
       SimpleInterestCalci obj=new SimpleInterestCalci();
       obj.setVisible(true);
    }
    
}
