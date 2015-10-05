package toi.drawing.shapes;

/**
 * Un point en deux dimensions.
 * 
 * @version oct.2015
 * @author MAXIMILANGE
 * 
 */
public class Point {
	/** L'abscisse du point. */
	private double x;

	/** L'ordonn�e du point. */
	private double y;

	/**
	 * Initialise un point � partir de deux coordonn�es.
	 * 
	 * @param x
	 *            l'abscisse du point.
	 * @param y
	 *            l'ordonn�e du point.
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Renvoie l'abscisse du point.
	 * 
	 * @return l'abscisse du point.
	 */
	public double getX() {
		return x;
	}

	/**
	 * Renvoie l'ordonnee du point.
	 * 
	 * @return l'ordonnee du point.
	 */
	public double getY() {
		return y;
	}

	/**
	 * Translate le point.
	 * 
	 * @param dx
	 *            d�placement en abscisse.
	 * @param dy
	 *            d�placement en ordonn�es.
	 */
	public void translate(double dx, double dy) {
		x += dx;
		y += dy;
	}

	/**
	 * Retourne une chaine décrivant le point.
	 * 
	 * @return la représentation textuelle du point.
	 */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append('(');
		str.append(x);
		str.append(", ");
		str.append(y);
		str.append(')');
		return str.toString();
	}
}