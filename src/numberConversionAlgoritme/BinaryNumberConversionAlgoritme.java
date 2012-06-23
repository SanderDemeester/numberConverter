package numberConversionAlgoritme;

public class BinaryNumberConversionAlgoritme implements NumberConversionAlgoritmeInterface{

	@Override
	public Object getSpecificNumber(double number) {
		if(number < 0) return new String("NaN");
		return Integer.toBinaryString((int)number);
	}

	@Override
	public double getDoubleNumber(Object number) {
		System.out.println(number.toString());
		int i = number.toString().length()-1;
		int v = 0;
		for(char s : number.toString().toCharArray()){
			if(i > 0)
				v+=Character.getNumericValue(s)*(2 << i-1);
			else
				v+=Character.getNumericValue(s)*1;
			i--;
		}
		return v;
	}

}
