package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Ben çalıştım");
	}
	
	public Product(int _id,String _name,double _unitPrice,String _detail) {
		this();
		id=_id;
		name=_name;
		unitPrice=_unitPrice;
		detail=_detail;
	}
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
