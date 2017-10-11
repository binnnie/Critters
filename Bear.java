import java.awt.*;

/**
   Brandon Dixon
   CS 145
   Lab 2
   Bear.java
   10/5/2017
   
   Class for the critter bear. Has behavior which makes it interact uniquely in the critter 
   simulation.
 */

public class Bear extends Critter{
   private boolean polar;
   private String name;
//    private boolean alternate;
//    public static final String[] NAMES = {"/", "\\"};
   
   //Constructs a new instance of the bear critter. Accepts a boolean isPolar which determines 
   //whether the bear is a polar bear.
   public Bear(boolean isPolar){
      polar = isPolar;
      name = "/";
//       alternate = false;
   }
   
   //Returns white if the bear is a polar bear and black otherwise.
   public Color getColor(){
      if(polar)
         return Color.WHITE;
      else
         return Color.BLACK;
   }
   
   //Returns the display name of the bear.
   public String toString(){
      return name;
   }
   
   //Accepts a parameter of CritterInfo to provide information of the bear's surroundings. This 
   //information is used to determine the bear's next move.
   public Action getMove(CritterInfo info){
//       alternate = alternate == false;
//       name = NAMES[(alternate) ? 1 : 0];
       if(name.equals("/"))
          name = "\\";
       else
          name = "/";
      if(info.getFront() == Neighbor.OTHER)
         return Action.INFECT;
      else if(info.getFront() == Neighbor.EMPTY)
         return Action.HOP;
      else
         return Action.LEFT;
   }
}