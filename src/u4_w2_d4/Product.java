package u4_w2_d4;

public class Product {

	private Long id;
	private String name;
	private String category;
	private Double price;

	public Product(Long id, String name, String category, Double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setId(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategoty(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
