/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw39442165
 *
 */
public class Escaleno extends Triangle {

	/**
	 * @param base
	 * @param height
	 */
	public Escaleno(double base, double height) {
		super(base, height);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		return 3 * base + height;
	}

}
