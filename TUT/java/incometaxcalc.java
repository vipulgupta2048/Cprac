import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class incometaxcalc extends Applet
{
    TextField t1,t2,t3,t4,t5,t6,t7;
    Button b1,b2;

    public void init()
    {
        t1= new TextField(10);
        t1.setBounds(100,50,150,20);

        t2= new TextField(30);
        t2.setBounds(350,50,200,20);

        t3= new TextField(10);
        t3.setBounds(175,100,150,20);

        t4= new TextField(10);
        t4.setBounds(50,200,100,20);

        t5= new TextField(10);
        t5.setBounds(220,200,100,20);

        t6= new TextField(10);
        t6.setBounds(400,200,100,20);

        t7= new TextField(10);
        t7.setBounds(300,300,100,20);

        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
     t1.setText ("Enter Emp code");
     t2.setText ("Enter name");
     t3.setText ("Enter Income");
     t4.setText ("Income Tax");
     t5.setText ("Edu. Tax");
     t6.setText ("Subcharge");
     t7.setText ("Total Amount");
     b1 = new Button("Calculate");
     b1.setBounds(100,150,100,30);
     b1.setVisible(true);
     add(b1);
     b1.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
            int x=0,y=0;
            String z,p,q,r;
            String a,b,c;
            String name;
            x = Integer.parseInt(t1.getText());
            name= t2.getText();
            y = Integer.parseInt(t3.getText());
            a = inctax(y);
            b = edctax(y);
            c = surtax(y);
            t4.setText(a);
            t5.setText(b);
            t6.setText(c);
            t7.setText(String.valueOf(Double.parseDouble(a)+ Double.parseDouble(b) + Double.parseDouble(c)));
            return;
         }
     });
     b2 = new Button("Clear");
     b2.setBounds(250,150,100,30);
     b2.setVisible(true);
     add(b2);
     b2.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent ae){
            t1.setText("0");
            t2.setText("0");
            t3.setText("0");
            t4.setText("0");
            t5.setText("0");
            t6.setText("0");
            t7.setText("0");
            return;
         }
     });
     setSize(600,600);
     setLayout(null);
     setVisible(true);
    }



        String inctax(double s)
    {
       if (s>= 0 && s<100000)
       {
           s = (s);
       }
       else if(s>= 100000&& s<150000)
       {
         s= (0.1*s) + (s);
         }
         else if(s>= 150000 && s<250000)
         {
          s= 5000 + (0.2*s);
        }
        else
        {
            s= 25000+(0.3*s);
        }
       return String.valueOf(s);
    }

    String edctax(double s)
    {
       if (s>= 0 && s<100000)
       {
           s = (s);
       }
       else if(s>= 100000&& s<150000)
       {
         s= (0.2*s) + (s);
         }
         else if(s>= 150000 && s<250000)
         {
          s= (0.2*s);
        }
        else
        {
            s= (0.2*s);
         }
    return String.valueOf(s);
    }

    String surtax(double s)
    {
       if (s>= 0 && s<100000)
       {
           s = (s);
       }
       else if(s>= 100000&& s<150000)
       {
         s= (s);
         }
         else if(s>= 150000 && s<250000)
         {
          s= (s);
        }
        else
        {
            s= (0.1*s);
         }
    return String.valueOf(s);
    }

    public void paint( Graphics g)
    {
        Font font = new Font ("Serif", Font.PLAIN, 20);
        g.setFont (font);
        g.drawString("Income Tax Calculator",190,20);
        Font fon = new Font("Serif", Font.PLAIN, 10);
        g.setFont (fon);
        g.drawString("Employee Code",100,40);
        g.drawString("Employee Name",350,40);
        g.drawString("Enter your Salary",175,90);
        g.drawString("Income Tax",50,240);
        g.drawString("Education Tax",220,240);
        g.drawString("Surcharge",400,240);
        g.drawString("Total Tax",300,390);
    }
}

