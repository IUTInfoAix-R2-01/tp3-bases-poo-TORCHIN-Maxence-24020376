package YAIP;

public class Rectangle {
	   private float length;
	   private float width;
	   
	   public Rectangle() {  // 1st (default) constructor
	      length = 1.0f;
	      width = 2.0f;
	   }
	   
	   public Rectangle(float Lenght, float Width) {  // 2nd constructor
	      this.length = Lenght;
	      this.width = Width;
	   }
	  
	   public float getLength() {
	        return length;
	    }
	    public void setLength(float length) {
	        this.length = length;
	    }
	    public float getWidth() {
	        return width;
	    }
	    public void setWidth(float width) {
	        this.width = width;
	    }
	    public float getArea() {
	        return length * width;
	    }
	    public float getPerimeter() {
	        return 2 * length + 2 * width;
	    }
	    public String toString() {
	        return "Rectangle [length=" + length + ", width=" + width + "]";
	    }
	}