
import java.util.Calendar;


public class Main_date {

	public static void main(String[] args) {
		//ex_01
		Calendar data1 = Calendar.getInstance();
		data1.set(Calendar.DAY_OF_MONTH, 1);
		data1.set(Calendar.MONTH, 9);
		data1.set(Calendar.YEAR, 2019);
		
		Calendar data2 = Calendar.getInstance();
		data2.set(Calendar.DAY_OF_MONTH, 30);
		data2.set(Calendar.MONTH, 10);
		data2.set(Calendar.YEAR, 2019);

		Ex_01 a = new Ex_01();
		
		System.out.println(a.contaDomSab(data1, data2));
		
		//ex_02
		Calendar[] cal = new Calendar[2];
		cal[0] = Calendar.getInstance();
		cal[0].set(Calendar.DAY_OF_MONTH, 9);
		cal[0].set(Calendar.MONTH, 9);
		cal[0].set(Calendar.YEAR, 2019);
		cal[1] = Calendar.getInstance();
		cal[1].set(Calendar.DAY_OF_MONTH, 6);
		cal[1].set(Calendar.MONTH, 10);
		cal[1].set(Calendar.YEAR, 2019);
		
		Ex_02 b = new Ex_02();
	
		data1.set(Calendar.DAY_OF_MONTH, 1);
		data1.set(Calendar.MONTH, 9);
		data1.set(Calendar.YEAR, 2019);
		
		System.out.println(b.contaUteis(data1, data2, cal));
		
		//ex_3
		
		Ex_03 c = new Ex_03();
		int PARCELA = 3;
		for(int k = 0;k<PARCELA;k++)
		System.out.println(c.pagamento((k+1), cal, data1));
	
	}
}
