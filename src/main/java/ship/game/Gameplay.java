package ship.game;

import java.awt.*;

public class Gameplay {

    public void tick(){

    }

    public void render(Graphics g) {
        int widthPosition = (int) (Display.getWidth() * 0.333); // 33% szer. okna
        int heightPosition = (int) (Display.getHeight() * 0.333);

        double widthFactor = 0.1;
        int cardWidth = (int) (Display.getHeight()* widthFactor);
        double heightFactor = 0.15;
        int cardHeight = (int) (Display.getHeight()* heightFactor);
        double separationWidthFactor = 0.009;
        double separationHeightFactor = 0.015;
        int separationWidth = (int) (Display.getWidth() * separationWidthFactor + cardWidth);
        int separationHeight = (int) (Display.getHeight() * separationHeightFactor + cardHeight);

        //g.drawRect(p-10, 390, 140,140); // obszar na karty statku
        g.drawRect(widthPosition, heightPosition, cardWidth, cardHeight); // karta gorna 1
        g.drawRect(widthPosition+separationWidth, heightPosition, cardWidth, cardHeight); // karta gorna 2
        g.drawRect(widthPosition+(separationWidth*2), heightPosition, cardWidth, cardHeight); // karta gorna 3

        g.drawRect(widthPosition, heightPosition+separationHeight, cardWidth,cardHeight); // karta dolna 1
        g.drawRect(widthPosition+separationWidth, heightPosition+separationHeight, cardWidth,cardHeight); // karta dolna 2
        g.drawRect(widthPosition+(separationWidth*2), heightPosition+separationHeight, cardWidth,cardHeight); // karta dolna 3

        // działa
        g.drawRect(widthPosition, (int) (heightPosition - separationHeight*0.7), cardHeight, cardWidth); // działo 1, cardHeight celowo zaminione z cardWidth
        g.drawRect(widthPosition+(int) (separationWidth*1.45), (int) (heightPosition - separationHeight*0.7), cardHeight, cardWidth); // działo 2, cardHeight celowo zaminione z cardWidth

        // monety
        double separationWidthCoinFactor = widthPosition * 0.03;
        double separationHeightCoinFactor = heightPosition * 0.05;
        g.drawRect(widthPosition+(separationWidth*3), heightPosition, cardWidth, cardHeight); // moneta 1
        g.drawRect(widthPosition+(separationWidth*3) + (int) separationWidthCoinFactor, heightPosition + (int) separationHeightCoinFactor, cardWidth, cardHeight); // moneta 2
        g.drawRect(widthPosition+(separationWidth*3) + (int) separationWidthCoinFactor*2, heightPosition + (int) separationHeightCoinFactor*2, cardWidth, cardHeight); // moneta 3
        g.drawRect(widthPosition+(separationWidth*3) + (int) separationWidthCoinFactor*3, heightPosition + (int) separationHeightCoinFactor*3, cardWidth, cardHeight); // moneta 4

        // karty innych statków
        g.drawRect(widthPosition+(separationWidth*4) + (int) separationWidthCoinFactor*3, heightPosition, cardWidth, cardHeight); // karta innego statku 1
        g.drawRect(widthPosition+(separationWidth*4) + (int) separationWidthCoinFactor*4, heightPosition + (int) separationHeightCoinFactor, cardWidth, cardHeight); // karta innego statku 2
        g.drawRect(widthPosition+(separationWidth*4) + (int) separationWidthCoinFactor*5, heightPosition + (int) separationHeightCoinFactor*2, cardWidth, cardHeight); // karta innego statku 3
        g.drawRect(widthPosition+(separationWidth*4) + (int) separationWidthCoinFactor*6, heightPosition + (int) separationHeightCoinFactor*3, cardWidth, cardHeight); // karta innego statku 4

        // testowy kolor dowolnego pola
        //g.setColor(new Color(150, 150, 200));
        //g.fillRect(widthPosition+(separationWidth*4) + (int) separationWidthCoinFactor*3, heightPosition, cardWidth, cardHeight);



    }
}
