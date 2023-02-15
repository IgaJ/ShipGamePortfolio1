package kids.game;

import java.awt.*;

public class Gameplay {

    public void tick(){

    }


    public void render(Graphics g) {
        int p = (int) (Display.getWidth() * 0.333);
        g.drawRect((p-10), 390, 140,140); // obszar na karty statku
        g.drawRect(p, 400, 40, 60); // karta gorna 1 x = 33% szer. okna (rzutowanie na int)
        g.drawRect(p+40, 400, 40, 60); // karta gorna 2
        g.drawRect(p+80, 400, 40, 60); // karta gorna 3
        g.drawRect(p, 460, 40,60); // karta dolna 1
        g.drawRect(p+40, 460, 40,60); // karta dolna 2
        g.drawRect(p+80, 460, 40,60); // karta dolna 3

        g.drawRect(p+140, 390, 70, 90); // obszar na działa
        g.drawRect(p+150, 400, 40, 60); // działo 1
        g.drawRect(p+160, 410, 40, 60); // działo 2

        g.drawRect(p+220, 390, 80, 100); // obszar na monety
        g.drawRect(p+230, 400, 40, 60); // moneta1
        g.drawRect(p+240, 410, 40, 60); // moneta2
        g.drawRect(p+250, 420, 40, 60); // moneta3

        g.drawRect(p+310, 390, 80, 100); // obszar na karty innych statków
        g.drawRect(p+320, 400, 40, 60); // karta statku 1
        g.drawRect(p+330, 410, 40, 60); // karta statku 2
        g.drawRect(p+340, 420, 40, 60); // karta statku 3


 /*g.setColor(new Color(45, 47, 15));
        g.fillRect(((int)(Display.getWidth() * 0.333)-10), 320, 160, 60);*/





    }
}
