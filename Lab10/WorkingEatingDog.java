package Lab10;

public class WorkingEatingDog extends Dog implements Worker, Eater
{
   private int hoursOfTraining;

   public int getHoursOfTraining()
   {
     return hoursOfTraining;
   }
  
   public void setHoursOfTraining(int hrs)
   {
     hoursOfTraining = hrs;
   }

   public void work()
   {
      speak();
      System.out.println("I am a dog who works");
      System.out.println("I have " + hoursOfTraining +
         " hours of training!");
   }

   public void eat() {
      speak();
      System.out.println("I like kibble!");
   }
}
