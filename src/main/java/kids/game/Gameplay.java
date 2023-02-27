package kids.game;

import java.awt.*;

public class Gameplay {

    public void tick(){

    }

    public void render(Graphics g) {
        int widthPosition = (int) (Display.getWidth() * 0.333); //p = 33% szer. okna
        int heightPosition = (int) (Display.getHeight() * 0.333);

        double widthFactor = 0.1;
        int cardWidth = (int) (Display.getHeight()* widthFactor);
        double heightFactor = 0.2;
        int cardHeight = (int) (Display.getHeight()* heightFactor);
        double separationWidthFactor = 0.009;
        double separationHeightFactor = 0.009;
        int separationWidth = (int) (Display.getWidth() * separationWidthFactor + cardWidth);
        int separationHeight = (int) (Display.getHeight() * separationHeightFactor + cardHeight);

        //g.drawRect(p-10, 390, 140,140); // obszar na karty statku
        g.drawRect(widthPosition, heightPosition, cardWidth, cardHeight); // karta gorna 1
        g.drawRect(widthPosition+separationWidth, heightPosition, cardWidth, cardHeight); // karta gorna 2
        g.drawRect(widthPosition+(separationWidth*2), heightPosition, cardWidth, cardHeight); // karta gorna 3

        g.drawRect(widthPosition, heightPosition+separationHeight, cardWidth,cardHeight); // karta dolna 1
        g.drawRect(widthPosition+separationWidth, heightPosition+separationHeight, cardWidth,cardHeight); // karta dolna 2
        g.drawRect(widthPosition+(separationWidth*2), heightPosition+separationHeight, cardWidth,cardHeight); // karta dolna 3

        /*//g.drawRect(p+140, 390, 70, 90); // obszar na działa
        g.drawRect(widthPosition+150, 400, cardWidth, cardHeight); // działo 1
        g.drawRect(widthPosition+160, 410, cardWidth, cardHeight); // działo 2

        //g.drawRect(p+220, 390, 80, 100); // obszar na monety
        g.drawRect(widthPosition+230, 400, cardWidth, cardHeight); // moneta 1
        g.drawRect(widthPosition+240, 410, cardWidth, cardHeight); // moneta 2
        g.drawRect(widthPosition+250, 420, cardWidth, cardHeight); // moneta 3

        //g.drawRect(p+310, 390, 80, 100); // obszar na karty innych statków
        g.drawRect(widthPosition+320, 400, cardWidth, cardHeight); // karta statku 1
        g.drawRect(widthPosition+330, 410, cardWidth, cardHeight); // karta statku 2
        g.drawRect(widthPosition+340, 420, cardWidth, cardHeight); // karta statku 3
*/

 /*g.setColor(new Color(45, 47, 15));
        g.fillRect(((int)(Display.getWidth() * 0.333)-10), 320, 160, 60);*/


    }
}
