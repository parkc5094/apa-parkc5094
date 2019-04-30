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
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
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
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  public static void testMirrorDiagonal()
  {
    Picture caterpillar1 = new Picture("beach.jpg");
    caterpillar1.explore();
    caterpillar1.mirrorDiagonal();
    caterpillar1.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  public static void testMirrorGull()
  {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }
  public static void testMirrorRectangle()
  {
    Picture seagull1 = new Picture("seagull.jpg");
    seagull1.explore();
    seagull1.mirrorRectangle(237,233,344,322, true);
    seagull1.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    //canvas.explore();
    canvas.createCollage();
    canvas.explore();
  }
  public static void testMyCollage()
  {
    Picture canvas = new Picture("7inX95in.jpg");
    //canvas.explore();
    canvas.createMyCollage();
    canvas.explore();
  }
  
  public static void testCopy()
  {
    Picture canvas = new Picture("640x480.jpg");
    Picture koala = new Picture("koala.jpg");
    koala.explore();
    canvas.copy(koala, 10, 20);
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(10.0);
    swan.explore();
  }
  public static void testNegate() {
	  Picture beach1 = new Picture("beach.jpg");
	  beach1.explore();
	  beach1.Negate();
	  beach1.explore();
  }
  public static void testGrayscale() {
	  Picture beach2 = new Picture("beach.jpg");
	  beach2.explore();
	  beach2.grayscaleAverage();
	  beach2.explore();
	  beach2.grayscaleLuminosity();
	  beach2.explore();
	  beach2.grayscaleLightness();
	  beach2.explore();
  }
  public static void testFixUnderwater() {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  public static void testBlur(int x, int y, int w, int h, int n) {
	  Picture redMoto = new Picture("redMotorcycle.jpg");
	  redMoto.explore();
	  
	  for(int i=0; i< n; i++) {
		  redMoto.blur(x,y,w,h);  
	  }
	  redMoto.explore();
  }
  /*
  public static void testluminGrayscale() {
	  Picture beach2 = new Picture("beach.jpg");
	  beach2.explore();
	  beach2.luminGrayscale();
	  beach2.explore();
  }
  public static void testLightGrayscale() {
	  Picture beach2 = new Picture("beach.jpg");
	  beach2.explore();
	  beach2.LightGrayscale();
	  beach2.explore();
  }*/
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
  /*
    testGrayscale();
    testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBotToTop();
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    testMirrorDiagonal();
	testMirrorRectangle();
    testCollage();
    testCopy();
	testMyCollage();
    testEdgeDetection();
    testEdgeDetection2();
    
  */
    testBlur(180,160,25,25,10);
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}