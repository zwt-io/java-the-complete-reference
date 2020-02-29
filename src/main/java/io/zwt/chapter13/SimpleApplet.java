package io.zwt.chapter13;

import java.applet.Applet;
import java.awt.*;

@SuppressWarnings("deprecation")
public class SimpleApplet extends Applet {
    public void paint(Graphics graphics) {
        graphics.drawString("A Simple Applet", 20, 20);
    }
}
