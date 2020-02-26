import java.util.ArrayList;
import java.util.List;

public class RealEstate {
	
	private String agent_name;
	public Adress agent_adress;
	public List<House> house_list;
	public RealEstate(String agent_name, Adress agent_adress) {
		this.agent_name = agent_name;
		this.agent_adress = agent_adress;
		this.house_list = new ArrayList();
	}
	
	public String getAgent_name() {
		return agent_name;
	}
	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}
	public Adress getAgent_adress() {
		return agent_adress;
	}
	public void setAgent_adress(Adress agent_adress) {
		this.agent_adress = agent_adress;
	}
	public List<House> getHouse_list() {
		return house_list;
	}
	public void setHouse_list(List<House> house_list) {
		this.house_list = house_list;
	}
	
	public void addHouse(House h) {
		house_list.add(h);
	}
	
	public String displayAllHouses(){
		String output = "";
		
		for (int i = 0; i < house_list.size(); i++) {
			output += house_list.get(i) + "/n";
		}
		
		return output;
	}
	
	public int getNumHouses() {
		return house_list.size();
	}
	
	public String searchByPrice(int p1, int p2){
		String output = "";
		
		for (int i = 0; i < house_list.size(); i++) {
			if (house_list.get(i).getPrice() >= p1 && house_list.get(i).getPrice() <= p2){
				output += house_list.get(i).toString() + "/n";	
			}
			
		}
		
		return output;
	}
	

}
