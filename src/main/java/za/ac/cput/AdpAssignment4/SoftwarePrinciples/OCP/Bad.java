package za.ac.cput.AdpAssignment4.SoftwarePrinciples.OCP;

public class Bad {

    // Open-Close Principle - Bad example
   public class GraphicEditor {

        public void drawShape(Shape s) {
            if (s.m_type==1)
                drawRectangle((Rectangle) s);
            else if (s.m_type==2)
                drawCircle((Circle) s);
        }
        public void drawCircle(Circle r) {

        }
        public void drawRectangle(Rectangle r) {

        }
    }

   public class Shape {
        int m_type;
    }

   public class Rectangle extends Shape {
        Rectangle() {
            super.m_type=1;
        }
    }

   public class Circle extends Shape {
        Circle() {
            super.m_type=2;
        }
    }

}
