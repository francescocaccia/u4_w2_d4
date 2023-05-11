package u4_w2_d4;

import java.util.List;
import java.util.stream.Collectors;

public class Esercizio1 {

	public static void main(String[] args) {

		Product newProduct = new Product(123L, "libro", "book", 230.0);
		Product newProduct1 = new Product(124L, "telefono", "ultimaGenerazione", 220.0);
		Product newProduct2 = new Product(125L, "PC", "baby", 12.0);
		Product newProduct3 = new Product(126L, "bottiglia", "baby", 22.0);

		List<Product> myList = List.of(newProduct, newProduct1, newProduct2, newProduct3);
		List<Product> listaDue = myList.stream()
				.filter(prodotto -> prodotto.getCategory().equals("book") && prodotto.getPrice() > 100)
				.collect(Collectors.toList());
		System.out.println(listaDue.size());

		List<Product> secondList = List.of(newProduct, newProduct1, newProduct2, newProduct3);
		List<Product> mySecondList = secondList.stream().filter(prodotto -> prodotto.getCategory().equals("baby"))
				.collect(Collectors.toList());
		System.out.println(mySecondList.size());
	}

}
