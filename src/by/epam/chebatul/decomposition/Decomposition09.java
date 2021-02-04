package by.epam.chebatul.decomposition;

/*
 Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */

public class Decomposition09 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		int z = 8;
		int t = 7;
		System.out.println("Площадь прямоугольного четырехугольника со сторонами " + x + " " + y + " " + z + " " + t
				+ " = " + findAreaOfQuadrangle(x, y, z, t));

	}

	public static double findAreaClassic(int h, int x) {
		double area = h * x / 2;
		return area;
	}

	private static double findHypotenuse(int a, int b) {
		double hypotenuse;
		hypotenuse = Math.sqrt(a * a + b * b);
		return hypotenuse;
	}

	public static double findAreaByThreeSide(double a, double b, double c) {
		double p;
		double area;
		p = (a + b + c) / 2;
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
	}

	public static double findAreaOfQuadrangle(int x, int y, int z, int t) {
		double area;
		double hyp = findHypotenuse(x, y);
		area = findAreaClassic(x, y) + findAreaByThreeSide(z, t, hyp);
		return area;
	}

}
