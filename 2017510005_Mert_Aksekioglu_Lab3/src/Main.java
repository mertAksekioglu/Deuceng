import java.util.Scanner;

public class Main {

public static void main(String[] args) {

System.out.println("The Euclidean Distance between the two example points (2,1) and (6,4) is " + euclideanDistance());
clockConvert();
Menu();


}

	public static void clockConvert() {
		Clock c1 = new Clock(14,50);
		Clock c2 = new Clock(1,40);
		
		System.out.println();
		System.out.println("24 Hour Clock : " + c1.getHour() + ":" + c1.getMinute());
		System.out.println("12 Hour Clock : " + c1.convertTo12());
		System.out.println();
		System.out.println("24 Hour Clock : " + c2.getHour() + ":" + c2.getMinute());
		System.out.println("12 Hour Clock : " + c2.convertTo12());
		System.out.println();
	}

	public static Double euclideanDistance() {
		Point p1 = new Point(2,1);
		Point p2 = new Point(6,4);
		
		double euclideanDistance = Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
		
		return euclideanDistance;
	}


	public static void Menu(){
	int select = 0;
	RealEstate realEstate = new RealEstate("Kepez Şubesi", new Adress("str","Kepez","Antalya"));
	Scanner scanner = new Scanner(System.in);
		do {
		System.out.println();
		System.out.println("*******MENU*******");
		System.out.println("1- Add a house");
		System.out.println("2- Display all houses");
		System.out.println("3- Search by price");
		System.out.println("4- Exit");
		System.out.println();
		select = scanner.nextInt();
		if (select == 1){
		
		System.out.println("Please write the kind of the house");
		String kind = scanner.next();
		System.out.println("Please write the number of rooms the house has");
		int numOfRooms = Integer.parseInt(scanner.next());
		System.out.println("Please write street name of the house");
		String adress_street = scanner.next();
		System.out.println("Please write town of the house");
		String adress_town = scanner.next();
		System.out.println("Please write city of the house");
		String adress_city = scanner.next();
		System.out.println("Please write the area of the house in m2");
		int area = Integer.parseInt(scanner.next());
		System.out.println("Please write the price of the house in USD");
		int price = Integer.parseInt(scanner.next());
		House house = new House(kind,numOfRooms,new Adress(adress_street,adress_town,adress_city),area,price);
		realEstate.addHouse(house);
		
		}
		else if (select == 2){
		System.out.println("Displaying all houses");
		System.out.println(realEstate.displayAllHouses());
		}
		else if (select == 3){
		System.out.println("Please write the low-end price in USD");
		int temp = Integer.parseInt(scanner.next());
		System.out.println("Please write the high-end price in USD");
		System.out.println(realEstate.searchByPrice(temp, Integer.parseInt(scanner.next())));
		}
		else {
		System.out.println("Wrong input");
		} 
	
		} while(select != 4);
	}

}
