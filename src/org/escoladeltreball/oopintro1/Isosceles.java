/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw39442165
 *
 */
public class Isosceles extends Triangle {

	/**
	 * @param base
	 * @param height
	 */
	public Isosceles(double base, double height) {
		super(base, height);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * base + height;
	}

}
