import javax.swing.*;

public class loginwithswing {
	public static void main (String args[]) {
        JFrame frame = new JFrame("First");
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placecomponets(panel);
        frame.setVisible(true);
    }

    public static void placecomponets(JPanel panel){
        panel.setLayout(null);

        JLabel userlabel = new JLabel("User");
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
        JCheckBox check = new JCheckBox("Check");
        check.setBounds(80, 100, 80, 25);
        panel.add(check);
    }
}

