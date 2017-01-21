package gwt.awt.utils;

public class HashCode {
	long hashcode = 0; 
		
	@Override
	public int hashCode() {
		return (((int) hashcode) ^ ((int) (hashcode >> 32)));
	}

	public void append(double value) {
		hashcode = hashcode * 31 + Double.doubleToLongBits(value);
	}

	public void append(int value) {
		hashcode = hashcode * 31 + value;
	}
}
