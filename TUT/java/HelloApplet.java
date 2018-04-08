// A Hello World Applet
// Save file as HelloWorld.java

import java.applet.*;
import java.awt.*;

// HelloWorld class extends Applet
public class HelloApplet extends Applet
{
    // Overriding paint() method
    @Override
    public void paint(Graphics g)
    {
        g.drawString("Hello World", 20, 20);
    }

}
