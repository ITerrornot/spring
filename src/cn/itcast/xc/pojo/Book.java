package cn.itcast.xc.pojo;

import org.springframework.stereotype.Component;

@Component("book")
public class Book {
	private int id;
	private String name="FLOWER";
	private float price=56.9f;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
