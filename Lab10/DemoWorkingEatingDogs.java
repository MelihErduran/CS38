package Lab10;

public class DemoWorkingEatingDogs
{
  public static void main(String[] args)
  {
    WorkingEatingDog aSheepHerder = new WorkingEatingDog();
    WorkingEatingDog aSeeingEyeDog = new WorkingEatingDog();
    
    aSheepHerder.setName("Simon, the Border Collie");
    aSeeingEyeDog.setName("Sophie, the German Shepard");

    aSheepHerder.setHoursOfTraining(40);
    aSeeingEyeDog.setHoursOfTraining(300);

    System.out.println(aSheepHerder.getName() + " Says ");
    aSheepHerder.speak();
    aSheepHerder.work();
    aSheepHerder.eat();
    System.out.println();

    System.out.println(aSeeingEyeDog.getName() + " Says ");
    aSeeingEyeDog.speak();
    aSeeingEyeDog.work();
    aSeeingEyeDog.eat();
    System.out.println();
  }
}
   
