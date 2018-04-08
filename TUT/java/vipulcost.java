import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

interface Cost {
    public void calcPrice(double qty);
}

class vipulcost extends Frame implements Cost{
    TextField dcodeTF;
    TextField dnameTF;
    TextField priceTF;
    TextField qtyTF;
    Label dcodeL;
    Label dnameL;
    Label priceL;
    Label qtyL;
    Label showDcodeL;
    Label showDnameL;
    Label showPriceL;
    Label showQtyL;
    Label showCalc;
    Button calculateB;

    final int buttonLength = 80;
    final int buttonHeight = 30;
    int buttonAlignX = 120;
    int buttonAlignY = 275;

    final int textFieldLength = 120;
    final int textFieldHeight = 25;
    final int textFieldAlignX = 100;
    int textFieldAlignY = 0;

    final int labelLength = 60;
    final int labelHeight = 25;
    final int labelAlignX = 30;
    final int labelAlignX2 = 250;
    int labelAlignY;

    final int spaceY = 30;

    long dcode;
    String dname;
    double price;

        Drinks() {
        dcodeTF = new TextField("Enter drink code");
        dnameTF = new TextField("Enter drink name");
        priceTF = new TextField("Enter price");
        qtyTF = new TextField("Enter quantity");

        dcodeL = new Label("Code");
        dcodeL.setBackground(Color.WHITE);
        dnameL = new Label("Name");
        dnameL.setBackground(Color.WHITE);
        priceL = new Label("Price");
        priceL.setBackground(Color.WHITE);
        qtyL = new Label("quantity");
        qtyL.setBackground(Color.WHITE);

        showDcodeL = new Label();
        showDcodeL.setBackground(Color.WHITE);
        showDnameL = new Label();
        showDnameL.setBackground(Color.WHITE);
        showPriceL = new Label();
        showPriceL.setBackground(Color.WHITE);
        showQtyL = new Label();
        showQtyL.setBackground(Color.WHITE);
        showCalc = new Label();
        showCalc.setBackground(Color.WHITE);

        calculateB = new Button("Calculate");

        increaseSpace();
        dcodeL.setBounds(labelAlignX,labelAlignY,labelLength,labelHeight);
        dcodeTF.setBounds(textFieldAlignX,textFieldAlignY,textFieldLength,textFieldHeight);
        showDcodeL.setBounds(labelAlignX2,labelAlignY,labelLength,labelHeight);
        increaseSpace();
        dnameL.setBounds(labelAlignX,labelAlignY,labelLength,labelHeight);
        dnameTF.setBounds(textFieldAlignX,textFieldAlignY,textFieldLength,textFieldHeight);
        showDnameL.setBounds(labelAlignX2,labelAlignY,labelLength,labelHeight);
        increaseSpace();
        priceL.setBounds(labelAlignX,labelAlignY,labelLength,labelHeight);
        priceTF.setBounds(textFieldAlignX,textFieldAlignY,textFieldLength,textFieldHeight);
        showPriceL.setBounds(labelAlignX2,labelAlignY,labelLength,labelHeight);
        increaseSpace();
        qtyL.setBounds(labelAlignX,labelAlignY,labelLength,labelHeight);
        qtyTF.setBounds(textFieldAlignX,textFieldAlignY,textFieldLength,textFieldHeight);
        showQtyL.setBounds(labelAlignX2,labelAlignY,labelLength,labelHeight);

        calculateB.setBounds(buttonAlignX, buttonAlignY, buttonLength, buttonHeight);
        showCalc.setBounds(buttonAlignX + 100, buttonAlignY, labelLength, labelHeight);
        calculateB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                inputDetails();
                showDetails();
            }
        });

        dcodeTF.setVisible(true);
        dnameTF.setVisible(true);
        priceTF.setVisible(true);
        qtyTF.setVisible(true);
        dcodeL.setVisible(true);
        dnameL.setVisible(true);
        priceL.setVisible(true);
        qtyL.setVisible(true);
        calculateB.setVisible(true);

        add(dcodeTF); add(dnameTF); add(priceTF); add(qtyTF); add(dcodeL); add(dnameL); add(priceL); add(qtyL); add(calculateB);
        add(showDcodeL); add(showDnameL); add(showPriceL); add(showQtyL); add(showCalc);
        setSize(350,350);
        setBackground(Color.gray);
        setLayout(null);
        setVisible(true);
    }

    void increaseSpace() {textFieldAlignY += spaceY + textFieldHeight; labelAlignY += spaceY + labelHeight;}

    void inputDetails() {
        dcode = Long.parseLong(dcodeTF.getText());
        dname = dnameTF.getText();
        price = Double.parseDouble(priceTF.getText());
        calcPrice(Double.parseDouble(qtyTF.getText()));
    }

    void showDetails(){
    showDcodeL.setText(dcodeTF.getText());
    showDnameL.setText(dnameTF.getText());
    showPriceL.setText(priceTF.getText());
    showQtyL.setText(qtyTF.getText());
    }

    public void calcPrice(double qty){
        showCalc.setText(String.valueOf(qty*price));
    }
}

public class JavaApplication52 {

    public static void main(String[] args) {
        new SoftDrink();
    }
}
