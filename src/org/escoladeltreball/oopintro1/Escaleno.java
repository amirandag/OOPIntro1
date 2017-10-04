/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw39442165
 *
 */
public class Escaleno extends Triangle {
	
	private double side1;
	private double side2;
	
	/**
	 * @param base
	 * @param height
	 */
	public Escaleno(double base, double height, double side1, double side2) {
		super(base, height);
		this.side1 = side1;
		this.side2 = side2;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		return base + side1 + side2;
	}

}
