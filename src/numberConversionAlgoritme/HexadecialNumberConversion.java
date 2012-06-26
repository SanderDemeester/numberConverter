package numberConversionAlgoritme;

public class HexadecialNumberConversion implements NumberConversionAlgoritmeInterface{

	@Override
	public Object getSpecificNumber(double number) {
		return Integer.toHexString((int)number);
	}

	@Override
	public double getDoubleNumber(Object number) {
		// TODO Auto-generated method stub DRIVER CODE
		return 0;
	}

}
