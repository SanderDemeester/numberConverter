package numberConversionAlgoritme;

public class DecimalConversionAlgoritme implements NumberConversionAlgoritmeInterface{

	@Override
	public Object getSpecificNumber(double number) {
		return (int)number;
	}

	@Override
	public double getDoubleNumber(Object number) {
		return Double.parseDouble(number.toString());
	}

}
