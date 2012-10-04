import java.util.ArrayList;
import java.util.List;

public class Probleme_2 {

	public static void main(String[] args) {

		FibonacciNumber();
	}

	public static void FibonacciNumber() {

		 
			int total = 0;
			
			int nb = 1;
			int nb2 = 2;
			int nb3 = 0;
		 
			while (nb2 <= 4000000)
			{
				nb3 = nb + nb2;
				
				if (nb2 % 2 == 0)
				total += nb2;
				nb = nb2;
				nb2 = nb3;
			}			
			System.out.println(total);
	}
}
