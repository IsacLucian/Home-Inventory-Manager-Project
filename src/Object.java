import java.util.*;

public class Object {
	
	Vector<String> List_name = new Vector<String>();
	Vector<Vector<Obj_Description>> objects = new  Vector<Vector<Obj_Description>>();
	
	public void Add_List(String name) {
		if(!List_name.contains(name)) {
			List_name.add(name);
			Vector<Obj_Description> aux = new Vector<Obj_Description>();
			objects.addElement(aux);
		}
	}
	
	public void Add_object(Obj_Description obj, String list) {
		int indx = List_name.indexOf(list);
		objects.get(indx).add(obj);
	}
	
	public void Print_lists() {
		for(String i:List_name) {
			System.out.print(i+" ");
		}
		
	}
	
	public int List_size() {
		return List_name.size();
	}
	
	public void Print_list_object(String name) {
		
		int index = List_name.indexOf(name);
		Vector<Obj_Description> clone = objects.get(index);
		
		for(Obj_Description i:clone) {
			System.out.println(i.Itm_name + " " + i.Serial_num + " " + i.Price + " " + i.Purchase_date);
		}
	}
	
	public void Delete(String name, Obj_Description obj) {
		
		int index = List_name.indexOf(name);
		int	_index, cnt;
		
		Vector<Obj_Description> clone = objects.get(index);
		
		_index = -1;cnt = 0;
		for(Obj_Description i:clone) {

			if(Objects.equals(i.Itm_name,obj.Itm_name) == true && Double.compare(i.Price, obj.Price) == 0 && Objects.equals(i.Purchase_date,obj.Purchase_date) == true && i.Serial_num == obj.Serial_num) {
				_index = cnt;
				break;
			}
			cnt++;
		}
		
		if(_index == -1)System.out.println("This item doesn't exist!");
		else objects.get(index).remove(_index);
	}
	
	public void Print_All() {
		
		int cnt = 0;
		for(String i:List_name) {
			System.out.println(i + ": ");
			
			Vector<Obj_Description> clone = objects.get(cnt);
			cnt++;
			
			for(Obj_Description j:clone) {
				System.out.println(j.Itm_name + " " + j.Serial_num + " " + j.Price + " " + j.Purchase_date);
			}
			
			System.out.println();
		}
	}
}
