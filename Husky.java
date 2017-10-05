import java.awt.*;

public class Husky extends Critter{
   static final Color[] RAINBOW = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, 
      Color.CYAN, Color.MAGENTA};
   static final String[] NAMES = {"H", "U", "S", "K", "Y"};
   private Color color;
   private String name;
   private int step;
   
   public Husky(){
      color = Color.RED;
      name = "H";
      step = 1;
   }
   public Action getMove(CritterInfo info){
      
      
      return Action.INFECT;
   }
}