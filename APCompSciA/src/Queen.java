import java.awt.Point;

public class Queen extends Point
{

  // NOTE: This class extends Point and some incorrectly formatted variables which are used come from Point
  
  public boolean isReal;

  
  Queen() {
    
    this(0, 0, false);
    
  }
  
  Queen(int x, int y, boolean isReal) {
    
    super(x, y);
    
    this.isReal = isReal;
    
  }

  public void increment() {
    
    super.translate(1, 0);
    
  }
  
  public boolean testOverlap(Queen testQueen) {
    
    if (super.x == testQueen.x) return true;
    if (super.y == testQueen.y) return true;
    if (Math.abs(super.x - testQueen.x) == Math.abs(super.y - testQueen.y)) return true;
    
    return false;
    
  }
  
  public void reset() {
    
    // this used for consistency
    super.x = 0;
    super.y = 0;
    this.isReal = false;
    
  }
  
  public void makeReal() {
    
    this.isReal = true;
    
  }
  
  
  
}
