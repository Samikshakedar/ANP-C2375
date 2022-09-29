package questions4.model;
import java.util.Objects;

public class Product {
private int productID;
private String productName;
private int productprice;

public Product(int productID, String productName, int productprice) {
	super();
	this.productID = productID;
	this.productName = productName;
	this.productprice = productprice;
}
public int getProductID() {
	return productID;
}
public void setProductID(int productID) {
	this.productID = productID;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getProductprice() {
	return productprice;
}
public void setProductprice(int productprice) {
	this.productprice = productprice;
}
@Override
public String toString() {
	return "Product [productID=" + productID + ", productName=" + productName + ", productprice=" + productprice + "]";
}
@Override
public int hashCode() {
	return Objects.hash(productID, productName, productprice);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	return productID == other.productID && Objects.equals(productName, other.productName)
			&& productprice == other.productprice;
}
}
