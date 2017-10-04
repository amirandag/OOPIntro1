/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw39442165
 *
 */
public class Isosceles extends Triangle {

	private double side;
	
	/**
	 * @param base
	 * @param height
	 */
	public Isosceles(double base, double height, double side) {
		super(base, height);
		this.side = side;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * side + base;
	}

}
