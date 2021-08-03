package task1;

public class Complex {
	private int real;
	private int imaginary;
	
	// Constructor cu parametrii
	public Complex(int r, int imag) {
		real = r;
		imaginary = imag;
	}
	
	// Constructor fara parametrii
	public Complex() {
		real = 0;
		imaginary= 0;
	}
	
	// Copy constructor
	public Complex(Complex complex) {
		this.real = complex.real;
		this.imaginary = complex.imaginary;
	}
	
	public int getReal() {
		return real;
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public int getImaginary() {
		return imaginary;
	}
	
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	
	public void addWithComplex(Complex com) {
		this.real += com.getReal();
		this.imaginary += com.getImaginary();
	}
	
	public void showNumber() {
		System.out.println(real + " " + imaginary);
	}
}
