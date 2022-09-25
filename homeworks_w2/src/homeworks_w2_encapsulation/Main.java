package homeworks_w2_encapsulation;

public class Main {

	public static void main(String[] args) {
		// Product product = new Product(1,"Laptop","Asus Laptop", 5000, 3,"Siyah");
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		System.out.println(product.getName());
		System.out.println(product.getKod());

		ProductManager productManager = new ProductManager();
		productManager.add(product);
		productManager.add2(2, "", "", 2, 200);

	}

}
