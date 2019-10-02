import java.util.Calendar;
import java.util.concurrent.TimeUnit;



public class Ex_02 {

	public int contaUteis(Calendar data1, Calendar data2, Calendar[] dates) {
		int ctd = 0;
		long diferenca = data2.getTime().getTime() - data1.getTime().getTime();
		diferenca = TimeUnit.MILLISECONDS.toDays(diferenca);
		
		for(int i = 0;i<diferenca;i++) {
		
		if (data1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || data1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			ctd++;	
		}else {
			for(int k = 0; k<dates.length;k++) {
				if((dates[k].get(Calendar.DAY_OF_MONTH) == data1.get(Calendar.DAY_OF_MONTH)) && (dates[k].get(Calendar.MONTH) == data1.get(Calendar.MONTH))){
					ctd++;
				}
			}
		}
			
		data1.add((Calendar.DAY_OF_MONTH), 1);
		}
	return ctd;	
	}
}
