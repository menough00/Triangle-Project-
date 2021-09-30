
public class Triangle {
	private int a;
	private int b;
	private int c;
	//constructor for the triangle 
	public Triangle(int a, int b, int c) {
		// checking to see if a is a valid length and if its invalid it throws exception
		if(a<1||a>200) {
			throw new IllegalArgumentException("a must be between 1...200 inclusive: "+a);

		}
		if(b<1||b>200) {
			throw new IllegalArgumentException("b must be between 1...200 inclusive: "+b);

		}
		if(c<1||c>200) {
			throw new IllegalArgumentException("c must be between 1...200 inclusive: "+c);

		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public boolean isTriangle() {
		return a<b+c && b<a+c && c<a+b;
	}

	public boolean isEquilateral() {
		return isTriangle()&& a==b && b==c;
	}
	public boolean isIsosceles() {
		return isTriangle()&&( (a==b && b!=c && a!=c) || (a!=b && b==c && a!=c)||(a!=b && b!=c && a==c));
	}
	public boolean isScalene() {
		return isTriangle()&& a!=b && b!=c && a!=c;
	}

}
