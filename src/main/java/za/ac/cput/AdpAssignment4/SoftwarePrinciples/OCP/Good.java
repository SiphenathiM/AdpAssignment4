package za.ac.cput.AdpAssignment4.SoftwarePrinciples.OCP;

// Open-Close Principle - Good example
public class Good {


  public  class GraphicEditor {
        public void drawShape(Shape s) {
            s.draw();
        }
    }

   public abstract class Shape {
        abstract void draw();
    }

    public class Rectangle extends Shape  {
        public void draw() {
            // draw the rectangle
        }
    }
}
