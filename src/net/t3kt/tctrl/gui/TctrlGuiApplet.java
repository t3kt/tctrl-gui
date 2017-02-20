package net.t3kt.tctrl.gui;

import controlP5.ControlP5;
import processing.core.PApplet;

public class TctrlGuiApplet extends PApplet {

    ControlP5 controlP5;
    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        controlP5 = new ControlP5(this);
        controlP5.addSlider("foo1")
                .setPosition(50, 50)
                .setSize(100, 20)
                .setRange(0, 255)
                .addCallback(theEvent -> {
                    print("hi" + theEvent.getController().getAddress());
                });
    }

    private void update() {

    }

    @Override
    public void draw() {
        update();
        clear();
        ellipse(10, 10, 10, 10);
    }

    public static void main(String[] args) {
        PApplet.main(TctrlGuiApplet.class.getName(), args);
    }
}
