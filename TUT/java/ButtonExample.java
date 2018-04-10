import javax.swing.*;

public class ButtonExample{
    public static void main(String[] args){
        JFrame f = new JFrame("Button BRO Example");
        JButton b = new JButton("Don't click Here");
        b.setBounds(50,100,195,30);
        f.add(b);
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
