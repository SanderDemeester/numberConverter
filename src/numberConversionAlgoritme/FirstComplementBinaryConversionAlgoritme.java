package numberConversionAlgoritme;

public class FirstComplementBinaryConversionAlgoritme implements NumberConversionAlgoritmeInterface{

	@Override
	public Object getSpecificNumber(double number) {
		System.out.println(number);
		String s = Integer.toBinaryString(Math.abs((int)number));
		if(number < 0){
			StringBuilder b = new StringBuilder();
			b.append(1); //negatief
			for(char c : s.toCharArray())
				if(c == 1)
					b.append(0);
				else
					b.append(1);
			s = b.toString();

		}else{ s = "0"+s; }
		return s; 
	}

	@Override
	public double getDoubleNumber(Object number) {
		int i = number.toString().length()-1;
		int v = 0;
		for(char s : number.toString().toCharArray()){
			if(i < number.toString().length()-1){
				if(i > 0) v+=Character.getNumericValue(s)*(2 << i-1);
				else v+=Character.getNumericValue(s)*1;
			}
			i--;
		}
		if(number.toString().charAt(0) == '1'){
			System.out.println(~v);
			return ~v;
		}
		System.out.println(v);
		return v;
	}

}
