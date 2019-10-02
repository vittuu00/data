import java.util.Calendar;
import java.util.Date;

public class Ex_03 {

	public Date pagamento(int parcela, Calendar[] feriado, Calendar data) {
		Date pagamento = new Date();
			int ctd= 0;
			data.add((Calendar.DAY_OF_MONTH), 30);
			if(data.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
				data.add((Calendar.DAY_OF_MONTH), 2);
			}else if(data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				data.add((Calendar.DAY_OF_MONTH), 1);
			}
			while (data.get(Calendar.DAY_OF_MONTH) == feriado[ctd].get(Calendar.DAY_OF_MONTH)) {
				data.add((Calendar.DAY_OF_MONTH), 1);
			}
			pagamento = data.getTime();
		
		
		return pagamento;
	}
}
