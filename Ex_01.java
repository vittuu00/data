import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex_01 {

	public int contaDomSab(Calendar data1, Calendar data2) {
		
	int ctd = 0;
	long diferenca = data2.getTime().getTime() - data1.getTime().getTime();
	diferenca = TimeUnit.MILLISECONDS.toDays(diferenca);
	
	for(int i = 0;i<diferenca;i++) {
		if (data1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || data1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			ctd++;
		}
		
		data1.add((Calendar.DAY_OF_MONTH), 1);
	}	
	
	return ctd;
	}	

}