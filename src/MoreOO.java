
public class MoreOO {

	public static void main(String[] args) {
		Rectangle r = new Square(4);
		r.setHeight(2);
		r.setWidth(5);
		System.out.println(computeVolOfRectangularPrism(r, 10));
		
	}
	static double computeVolOfRectangularPrism(Rectangle r, double depth){
		return r.getArea() * depth;
	}

}

class Rectangle{
	protected double width, height;
	
	public Rectangle(double w, double h){
		width = w; height =h;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea(){
		return width * height;
	}
		
}

class Square extends Rectangle{

	public Square(double side) {
		super(side, side);
		//width = height;
	}
	public void setWidth(double width) {
		this.width = this.height= width;
	}
	public void setHeight(double height) {
		this.height = this.width = height;
	}
	
}

class RectangularPrism extends Rectangle{
	double depth;
	public RectangularPrism(double w, double h, double d){
		super(w, h);
		depth = d;
	}
	
	public double getVOlume(){
		return super.getArea() * depth;
	}
}

class RectangularPrism1{
	double depth;
	Rectangle rect;
	public RectangularPrism1(double w, double h, double d){
		depth = d;
		rect = new Rectangle(w, h);
	}
	
	public double getVOlume(){
		return rect.getArea() * depth;
	}	
}