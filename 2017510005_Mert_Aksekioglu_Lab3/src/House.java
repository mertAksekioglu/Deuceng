
public class House {
	private String kind;
	private int num_rooms;
	public Adress adress;
	private int area;
	private int price;
	
	public House(String kind, int num_rooms, Adress adress, int area, int price) {
		this.kind = kind;
		this.num_rooms = num_rooms;
		this.adress = adress;
		this.area = area;
		this.price = price;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNum_rooms() {
		return num_rooms;
	}

	public void setNum_rooms(int num_rooms) {
		this.num_rooms = num_rooms;
	}


	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "House [kind=" + kind + ", num_rooms=" + num_rooms + ", adress=" + adress + ", area=" + area + ", price="
				+ price + "]";
	}
	
	
	

}
