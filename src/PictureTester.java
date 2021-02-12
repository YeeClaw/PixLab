import javax.swing.text.PasswordView;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  public static void testExplore() {
    Picture water = new Picture("seagull.jpg");
    water.explore();
  }

  public static void testMirrorVerticalRightToLeft() {
    Picture picture = new Picture("CumberlandIsland.jpg");
    picture.explore();
    picture.mirrorVerticalRightToLeft();
    picture.explore();
  }

  public static void testMyCollage() {
    Picture canvas = new Picture("640x480.jpg");
    canvas.explore();
    canvas.myCollage();
  }

  public static void testMirrorHorizontal() {
    Picture picture = new Picture("CumberlandIsland.jpg");
    picture.explore();
    picture.mirrorHorizontal();
    picture.explore();
  }

  public static void testMirrorHorizontalBotToTop() {
    Picture picture = new Picture("CumberlandIsland.jpg");
    picture.explore();
    picture.mirrorHorizontalBotToTop();
    picture.explore();
  }

  public static void testMirrorArms() {
    Picture picture = new Picture("snowman.jpg");
    picture.explore();
    picture.mirrorArms();
    picture.explore();
  }

  public static void testFixUnderwater() {
    Picture water = new Picture("water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }

  public static void testMirrorGull() {
    Picture picture = new Picture("seagull.jpg");
    picture.explore();
    picture.mirrorGull();
    picture.explore();
  }

  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("seagull.jpg");
    beach.explore();
    beach.mirrorGull();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue() {

    Picture beach = new Picture("catcry.png");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

  public static void testNegate() {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }

  public static void testGrayscale() {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testExplore();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    testMyCollage();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}