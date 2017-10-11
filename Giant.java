import java.awt.*;

/**
   Brandon Dixon
   CS 145
   Lab 2
   Giant.java
   10/5/2017
   
   Class for the critter giant. Has behavior which makes it interact uniquely in the critter 
   simulation.
 */

public class Giant extends Critter{
   private int turn;
   private String name;
   private int step;
   public static final String[] SERIES = {"fee", "fie", "foe", "fum"};
   
   //Constructs a new instance of the Giant object.
   public Giant(){
      turn = 6;
      step = 0;
      name = SERIES[0];
   }
   
   //Returns the color of the Giant instance. In case of the Giant it will always be gray.
   public Color getColor(){
      return Color.GRAY;
   }
   
   //Accepts a parameter of CritterInfo which provides information of the Giant's surroundings.
   //Returns the giants next move based on its surroundings. Determines the Giant's display name
   //for this iteration.
   public Action getMove(CritterInfo info){
      if(turn > 0){
         turn--;
      }else{
         turn = 6;
         if(step == 3)
            step = 0;
         else
            step++;
         name = SERIES[step];
      }
      if(info.getFront() == Neighbor.OTHER)
         return Action.INFECT;
      else if(info.getFront() == Neighbor.EMPTY)
         return Action.HOP;
      else
         return Action.RIGHT;
   }
   
   //Returns the Giant's display name.
   public String toString(){
      return name;
   }
}