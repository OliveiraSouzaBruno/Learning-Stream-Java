import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		//map: pega cada elemento da lista e aplica alguma fun��o
		Stream<Integer> st1 = list.stream().map(x -> x * 10);		
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));

		//fun��o de itera��o: percorre a lista (potencialmente infinita)
		//a partir do 0 (definido na fun��o como 1� param)
		//e percorre adicionando +2 a cada elemento.
		Stream<Integer> st3 = Stream.iterate(0, x -> x+2);
		//Imprime at� o 10� elemento da Stream st3
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		//Stream de sequencia de fibonati - cada elemento da lista � a soma dos 2 elementos anteriores
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
	}

}
