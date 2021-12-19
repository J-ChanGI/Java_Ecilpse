package Day_21_04_22_pkg;

public class ProductDTO {
 
	private int pNumber; //상품번호
	private	String pName; // 상품명
	private int  pPrice; // 상품가격
	private int  pStock; //재고
	
	ProductDTO(){
		
	}
	
	public ProductDTO(int pNumber, String pName, int pPrice, int pStock) {
		super();
		this.pNumber = pNumber;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pStock = pStock;
	}

	public int getpNumber() {
		return pNumber;
	}

	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public int getpStock() {
		return pStock;
	}

	public void setpStock(int pStock) {
		this.pStock = pStock;
	}

	@Override
	public String toString() {
		return "ProductDTO [pNumber=" + pNumber + ", pName=" + pName + ", pPrice=" + pPrice + ", pStock=" + pStock
				+ "]";
	}
	
	
	
	
}
