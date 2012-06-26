package numberConversionAlgoritme;

public class HexadecialNumberConversion implements NumberConversionAlgoritmeInterface{

	@Override
	public Object getSpecificNumber(double number) {
		if(number>=0)
			return Integer.toHexString((int)number);
		else
			return new String("NaN");
	}

	@Override
	public double getDoubleNumber(Object number) {
		// TODO Auto-generated method stub DRIVER CODE
		return 0;
	}

}
