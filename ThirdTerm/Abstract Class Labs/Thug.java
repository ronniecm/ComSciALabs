public class Thug extends Warrior
{
   
   /**
     * pre:    none
        post:  getName() = name
               getIQ = iq
               getStrength = strength
    **/

   public Thug(String name)
   {
      super(name);
      generateStats();
   }
   
   /**
     * pre:    none
        post:   120 <= iq <= 180
                20 <= strength <= 80
    **/

   public void generateStats()
   {
      iq = (int)(Math.random() * 31 + 60);
      strength = (int)(Math.random() * 21 + 80);
   }
}//class