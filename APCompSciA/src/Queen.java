import java.awt.Point;

public class Queen extends Point
{

  // NOTE: This class extends Point, so things from point may not be formatted correctly due to Point not being my code
  
  public boolean isReal = false;
 

  public void increment() {
    
    this.translate(1, 0);
    
  }
  
  public boolean testOverlap(Queen queenTest) {
    
    
    
    return true;
    
  }
  
  public void reset() {
    
    this.x = 0;
    this.y = 0;
    this.isReal = false;
    
  }
  
  public void makeReal() {
    
    this.isReal = true;
    
  }
  
  
  
}
