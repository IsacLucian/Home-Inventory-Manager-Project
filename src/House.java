import java.util.*;


public class House {
	
	public String name;
	public String adress;
	public int nrbedrooms;
	public int nrkitchens;
	public int nrlivingrooms;
	public int nrbathrooms;
	Vector<String> owners = new Vector<String>();
	
	public void Set_Name(String name) {
		this.name = name;
	}
	
	public void Set_Adress(String adress) {
		this.adress = adress;
	}
	
	public void Add_rooms(int nrbedrooms, int nrkitchens, int nrlivingrooms, int nrbathrooms) {
		this.nrbedrooms = nrbedrooms;
		this.nrkitchens = nrkitchens;
		this.nrlivingrooms = nrlivingrooms;
		this.nrbathrooms = nrbathrooms;
	}
	
	public void Add_owner(String name) {
		owners.add(name);
	}
	
	public void Print_owners() {
		
		for(String i:owners)
			System.out.println(i);
	}
	
}
