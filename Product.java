
public class Product {

	private String code;
	private String name;
	private double price;
	private double discountPrice;
	private int quantity;
	private double priceTotal;

	public Product(String code, String name, double price,int quantity) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.discountPrice = price;
		this.priceTotal = quantity*discountPrice;
	}
	public int getQuantity(){
		return quantity;
	}
	public double getPriceTotal(){
		return priceTotal;
	}
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getDiscountPrice() {
		return discountPrice;
	}
	
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	public void setPriceTotal(double priceTotal){
		this.priceTotal = priceTotal;
	}	
	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", price=" + price + ", discountPrice=" + discountPrice
				+", quantity=" + quantity + ", priceTotal=" +priceTotal+ "]";
	}
	
	
}
