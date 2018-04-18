import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class button extends applet{
    Label l1;
    button b1;

    public void init(){
        l1 = new Label("hefnsdlf");
        b1 = new button("Yo");
        add(l1);
        add(b1);
        b1.addActionListener(this);
    }



    public void paint(graphics g){
        g.drawString("Thanks", 10, 100);
    }
}
