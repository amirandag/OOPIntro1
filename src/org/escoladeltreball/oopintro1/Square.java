/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw39442165
 *
 */
public class Square extends FigureImpl {

	private double base;
	
	/**
	 * @param base
	 */
	public Square(double base) {
		this.base = base;
	}

	
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		return 4 * base;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#area()
	 */
	@Override
	public double area() {
		return Math.pow(base, 2);
	}

}
