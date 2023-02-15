package kids.game;

import java.awt.*;

public class Gameplay {

    public void tick(){

    }


    public void render(Graphics g) {
        g.drawRect((int) ((Display.getWidth() * 0.333)-10), 390, 140,140); // obszar na karty statku
        g.drawRect((int) (Display.getWidth() * 0.333), 400, 40, 60); // karta gorna 1 x = 33% szer. okna (rzutowanie na int)
        g.drawRect((int) (Display.getWidth() * 0.333+40), 400, 40, 60); // karta gorna 2
        g.drawRect((int) (Display.getWidth() * 0.333+80), 400, 40, 60); // karta gorna 3
        g.drawRect((int) (Display.getWidth() * 0.333), 460, 40,60); // karta dolna 1
        g.drawRect((int) (Display.getWidth() * 0.333+40), 460, 40,60); // karta dolna 2
        g.drawRect((int) (Display.getWidth() * 0.333+80), 460, 40,60); // karta dolna 3

        g.drawRect((int) (Display.getWidth() * 0.333+140), 390, 70, 90); // obszar na działa
        g.drawRect((int) ((Display.getWidth() * 0.333)+150), 400, 40, 60); // działo 1
        g.drawRect((int) ((Display.getWidth() * 0.333)+160), 410, 40, 60); // działo 2

        g.drawRect((int) ((Display.getWidth() * 0.333)+140+80), 390, 80, 100); // obszar na monety
        g.drawRect((int) ((Display.getWidth() * 0.333)+150+80), 400, 40, 60); // moneta1
        g.drawRect((int) ((Display.getWidth() * 0.333)+160+80), 410, 40, 60); // moneta2
        g.drawRect((int) ((Display.getWidth() * 0.333)+170+80), 420, 40, 60); // moneta3

        g.drawRect((int) ((Display.getWidth() * 0.333)+230+80), 390, 80, 100); // obszar na karty innych statków
        g.drawRect((int) ((Display.getWidth() * 0.333)+240+80), 400, 40, 60); // karta statku 1
        g.drawRect((int) ((Display.getWidth() * 0.333)+250+80), 410, 40, 60); // karta statku 2
        g.drawRect((int) ((Display.getWidth() * 0.333)+260+80), 420, 40, 60); // karta statku 3


 /*g.setColor(new Color(45, 47, 15));
        g.fillRect(((int)(Display.getWidth() * 0.333)-10), 320, 160, 60);*/





    }
}
