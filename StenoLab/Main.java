import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList; // import the ArrayList class
class Main {
  public static void main(String[] args) {
      //Color pickedColor = ColorChooser.pickAColor();
      //System.out.println(pickedColor);
    
    
   // Picture beach = new Picture("beach.jpg");
   // beach.explore();
   // Picture copy = testClearLow(beach);
   // copy.explore();
    



   Picture beach = new Picture ("beach.jpg");
   Picture blueMark = new Picture ("blue-mark.jpg");
   Picture flower1 = new Picture ("flower1.jpg");
   Picture robot = new Picture ("robot.jpg");
   beach.explore();


    Picture hidden1 = hidePicture(beach, robot, 65, 200);
    Picture hidden2 = hidePicture(hidden1, flower1, 280,110);
    hidden2.explore();

    Picture unhidden = revealPicture(hidden2);
    unhidden.explore();


    System.out.print(isSame(beach, robot));



    



/*
        Picture copy2 = hidePicture(beach, blueMark,20,20);
        Picture copy3 = revealPicture(copy2);
        copy3.explore();
        copy2.explore();*/

    

    
  }


    // Clears the lower 2 bits (LSBs in a pixel value (0 -> 255))
    public static void clearLow(Pixel p) {

      p.setRed( (p.getRed() / 4 ) * 4 );
      p.setGreen( (p.getGreen() / 4 ) * 4 );
      p.setBlue( (p.getBlue() / 4 ) * 4 );

    }

  public static Picture testClearLow(Picture pic) {

      
      for(int row = 0; row < pic.getWidth(); row++) {

          for(int height = 0; height < pic.getHeight(); height++) {

            clearLow(pic.getPixel(row,height));

          }

      
      }
    return pic;
  }

  //Set the lower 2 bits in apxel to whatever the highest 2 bits in c are.

  public static void setLow(Pixel p, Color c) {

    clearLow(p);
    
    p.setRed(  ( p.getRed() + (c.getRed()/64))       );
    p.setGreen(( p.getGreen() + (c.getGreen()/64)      ));
    p.setBlue(( p.getBlue() + (c.getBlue()/64))    );

    
  }

      


  public static Picture testSetLow(Picture pic, Color c) {



     for(int row = 0; row < pic.getWidth(); row++) {

          for(int height = 0; height < pic.getHeight(); height++) {

            setLow(pic.getPixel(row, height), c);

          }
     }
    return pic;
  }






  /*
  Goofy ah method to take the lowest  two bits of each pixel's colors
 makes them the lowest the highest two bitsof each pixels colors

  */


  public static Picture revealPicture(Picture hidden) {


    Picture copy = new Picture(hidden);
    Pixel[][] pixels = copy.getPixels2D();
    Pixel[][] source = hidden.getPixels2D();
    
      for(int r = 0; r < pixels.length; r++) {
        
        for(int c = 0; c < pixels[0].length; c++) {

          Color col = source[r][c].getColor();


          int newRed = ((col.getRed())%4);
          int newGreen = ((col.getGreen())%4);
          int newBlue = ((col.getBlue())%4);


          pixels[r][c].setRed(newRed*64);
          pixels[r][c].setGreen(newGreen*64);
          pixels[r][c].setBlue(newBlue*64);

        }


        
      }
    
     

    return copy;
  }



//Requires that two pictues are the same height and width

  public static boolean canHide(Picture source, Picture secret) {

    if((source.getHeight() >= secret.getHeight()) && (source.getWidth() >= secret.getWidth())) {
      return true;
    }
    else {
      return false;
    }
  }


  public static Picture hidePicture(Picture source, Picture secret, int startRow, int startColumn) {

    
  


    Pixel[][] pixelsSource = source.getPixels2D();
    Pixel[][] pixelsSecret = secret.getPixels2D();


    for(int r = 0; r < pixelsSecret.length; r++) {
      
        for(int c = 0; c < pixelsSecret[0].length; c++) {
          
          if((startRow >= r) && (startColumn >= c)) {

            Color col = pixelsSecret[r][c].getColor();

            setLow(pixelsSource[r+startRow][c+startColumn], col);     
         }
          
    
        }
    
  }
    return source;
  }


  //Bruh momment method to check if pictures are the same as one another
  public static boolean isSame(Picture pic1, Picture pic2) {

    boolean crazy = true;

    Pixel[][] pixelsP1 = pic1.getPixels2D();
    Pixel[][] pixelsP2 = pic2.getPixels2D();

     for(int r = 0; r < pixelsP1.length; r++) {
      
        for(int c = 0; c < pixelsP1[0].length; c++) {

          try {

          if( !((pixelsP1[r][c].getRed()) == (pixelsP2[r][c].getRed()))) {
            crazy = false;
          }
          if( !((pixelsP1[r][c].getGreen()) == (pixelsP2[r][c].getGreen()))) {
            crazy = false;
          }
          if( !((pixelsP1[r][c].getBlue()) == (pixelsP2[r][c].getBlue()))) {
            crazy = false;
          }
          }
          catch(Exception e) {
            crazy = false;
            return crazy;
            }
        }
     }

return crazy;
    }





   //Finds differences in 2 pictures makes array list of points and returns that
  public static ArrayList<Point> findDifferences(Picture pic1, Picture pic2) {
    ArrayList<Point> points = new ArrayList<Point>();
    Pixel[][] pixelsP1 = pic1.getPixels2D();
    Pixel[][] pixelsP2 = pic2.getPixels2D();

     for(int r = 0; r < pixelsP1.length; r++) {
      
        for(int c = 0; c < pixelsP1[0].length; c++) {

          try {

          if( !((pixelsP1[r][c].getRed()) == (pixelsP2[r][c].getRed()))) {
            points.add(new Point(r,c));
          }
          if( !((pixelsP1[r][c].getGreen()) == (pixelsP2[r][c].getGreen()))) {
            points.add(new Point(r,c));
          }
          if( !((pixelsP1[r][c].getBlue()) == (pixelsP2[r][c].getBlue()))) {
            points.add(new Point(r,c));
          }
          }
          catch(Exception e) {
            points.add(new Point(r,c));
            }
        }
     }
    return points;
  }

}

// L + Ratio somehow codded this whole thing by hand. Mr. J Hows it goin
// This is crazy. If you see this say hello.

