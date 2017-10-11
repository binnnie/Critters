import java.awt.*;
import java.util.Random;

/**
   Brandon Dixon
   CS 145
   Lab 2
   Husky.java
   10/11/2017
   
   Class for the critter husky. Has behavior which makes it interact uniquely in the critter 
   simulation.
 */

public class Husky extends Critter{
   public static final Color[] RAINBOW = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, 
      Color.CYAN, Color.MAGENTA};
   public static final String[] NAMES = {"H", "U", "S", "K", "Y"};
   private Color color;
   private String name;
   private int stepC;
   private int stepN;
   
   //Constructs a new instance of the Husky object.
   public Husky(){
      color = Color.RED;
      name = "H";
      stepC = 1;
      stepN = 1;
   }
   
   //Cycles through the state for the husky and returns its next action.
   public Action getMove(CritterInfo info){
      Random rand = new Random();
      if(stepC >= 7){
         stepC = 0;
      }   
      if(stepN >= 5){
         stepN = 0;
      }   
      color = RAINBOW[stepC];
      name = NAMES[stepN];
      stepC++;
      stepN++;
      if(info.getFront() == Neighbor.OTHER){
         return Action.INFECT;
      }else if(info.getFront() == Neighbor.WALL){
         int choice = rand.nextInt(2);
         if(choice == 0)
            return Action.RIGHT;
         else
            return Action.LEFT;
      }else if(info.getFront() == Neighbor.SAME){
         int choice = rand.nextInt(2);
         if(choice == 0)
            return Action.RIGHT;
         else
            return Action.LEFT;
      }else{
         return Action.HOP;
      }
   }
   
   //Returns the husky's color.
   public Color getColor(){
      return color;
   }
   
   //Returns the husky's name.
   public String toString(){
      return name;
   }
}