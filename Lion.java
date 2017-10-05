import java.awt.*;
import java.util.Random;

/**
   Brandon Dixon
   CS 145
   Lab 2
   Lion.java
   10/5/2017
   
   Class for the critter lion. Has behavior which makes it interact uniquely in the critter 
   simulation.
 */

public class Lion extends Critter{
   private int turn;
   private Color lionColor;
   
   //Constructs a new instance of the Lion object.
   public Lion(){
      turn = 3;
      lionColor = chooseColor();
   }
   
   //Returns the lion's display color.
   public Color getColor(){
      return lionColor;
   }
   
   //Accepts a CritterInfo parameter to provide information of the lion's surroundings. Using this 
   //information the lion's next move is determined. Also determines what color the lion will be on
   //the next iteration.
   public Action getMove(CritterInfo info){
      if(turn > 0){
         turn--;
      }else{
         turn = 3;
         lionColor = chooseColor();
      }
      if(info.getFront() == Neighbor.OTHER)
         return Action.INFECT;
      else if(info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL)
         return Action.LEFT;
      else if(info.getFront() == Neighbor.SAME)
         return Action.RIGHT;
      else
         return Action.HOP;
   }
   
   //Returns the lion's display name. In the case of the lion it will always be "L"
   public String toString(){
      return "L";
   }
   
   //Returns a random color out of the three red, green, and blue. Called when the lion's color 
   //needs to be changed on the next iteration.
   public Color chooseColor(){
      Random rand = new Random();
      int chooseColor = rand.nextInt(3);
      if(chooseColor == 0)
         return Color.RED;
      else if(chooseColor == 1)
         return Color.GREEN;
      else
         return Color.BLUE;
   }
}