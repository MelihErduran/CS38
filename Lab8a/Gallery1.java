package Lab8a;

public class Gallery1
{
   public static void main(String[] args)
   {
      final int MAX_WIDTH = 720;
      final int GAP = 10;
      final int PICTURES = 20;
      Picture pic = new Picture();
      pic.load("picture1.jpg");
      int x = 0;
      int maxY = 0;
      for (int i = 2; i <= PICTURES; i++)
      {
         Picture previous = pic;
         pic = new Picture();
         pic.load("picture" + i  + ".jpg");
         x = x + previous.getWidth() + GAP;
         if (x + pic.getWidth() < MAX_WIDTH){
            pic.move(x, 0);
         } else {
            maxY = Math.max(maxY, pic.getHeight());
            pic.move(0, maxY + GAP);
         }
      }
   }
}

