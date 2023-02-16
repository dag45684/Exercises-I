package lambdas;

import java.util.function.BiConsumer;
import java.util.function.DoubleToLongFunction;

public class test1 {

	public static void main(String[] args) {
		
		BiConsumer<Double, Boolean> v;
		
		v = (a, b) -> {
			if (b) {
				System.out.println(Math.sqrt(a));
			}
			else {
				System.out.println(Math.sin(a));
			}
		};

		v.accept(7d, false);
		v.accept(3/2d, true);
		
		DoubleToLongFunction k;
		
		k = (l) -> Math.round(l);
		
		System.out.println(k.applyAsLong(3.125d));
	}

}
