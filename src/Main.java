import java.util.Scanner;

class Main{
	
	private static Scanner input_Strings, input_Int, input_Double;

	public static void main(String[] args) {
		
		input_Strings = new Scanner(System.in);
		input_Int = new Scanner(System.in);
		input_Double = new Scanner(System.in);
		
		House home = new House();
		int nrbedrooms, nrkitchens, nrlivingrooms, nrbathrooms, nrowners;
		String name;
		
		System.out.println("Welcome to the Home Inventory Manager!");
		System.out.println("Introduce house details:");
		System.out.print("Add the name of the property:");
		name = input_Strings.nextLine();
		home.Set_Name(name);
		System.out.println();
		
		System.out.print("Add the adress of the property:");
		name = input_Strings.nextLine();
		home.Set_Adress(name);
		System.out.println();

		System.out.print("Add the number of bedrooms of the property:");
		nrbedrooms = input_Int.nextInt();
		System.out.println();

		System.out.print("Add the number of kitchens of the property:");
		nrkitchens = input_Int.nextInt();
		System.out.println();
		
		System.out.print("Add the number of livingrooms of the property:");
		nrlivingrooms = input_Int.nextInt();
		System.out.println();
		
		System.out.print("Add the number of bathrooms of the property:");
		nrbathrooms = input_Int.nextInt();
		System.out.println();
		
		home.Add_rooms(nrbedrooms, nrkitchens, nrlivingrooms, nrbathrooms);
		
		System.out.println("Add the number of owners and their names:");
		nrowners = input_Int.nextInt();
		
		for(int i = 0; i < nrowners; i++) {
			name = input_Strings.nextLine();
			home.Add_owner(name);
		}
		System.out.println();
		
		System.out.println("Operations:");
		System.out.println("1. Add object");
		System.out.println("2. Remove object");
		System.out.println("3. Home details");
		System.out.println();
		
		int operation, s_num;
		double price;
		String date, itm_name;
		Object obj = new Object();
		
		while(true) {
			
			operation = input_Int.nextInt();
			
			switch(operation) {
				
				case 1:
					System.out.println("1. Add a new list of objects");
					System.out.println("2. Use a list that already exists");
					System.out.println();

					operation = input_Int.nextInt();
					
					if(operation == 1) {
						
						System.out.print("Give a name for the list:");
						name = input_Strings.nextLine();
						obj.Add_List(name);
						System.out.println();
					}
					else if(operation == 2) {
						
						if(obj.List_size() > 0) {
							System.out.println("Chose the list:");
							obj.Print_lists();
							System.out.println();
							name = input_Strings.nextLine();
							System.out.println();
						}
						else {
							System.out.print("You have no list! Add a new one:");
							name = input_Strings.nextLine();
							obj.Add_List(name);
							System.out.println();

						}

					}
					else {
						System.out.println("Invalid case!");
						break;
					}

					System.out.println("Add the object name, serial number, price, purchase date:");
					itm_name = input_Strings.nextLine();
					s_num = input_Int.nextInt();
					price = input_Double.nextDouble();
					date = input_Strings.nextLine();
					System.out.println("DONE!");
					
					Obj_Description obj_1 = new Obj_Description(itm_name, s_num, price, date);
					obj.Add_object(obj_1, name);
					
					break;
				
				case 2:
					System.out.println("Chose the list and the object you want to delete:");
					
					name = input_Strings.nextLine();
					itm_name = input_Strings.nextLine();
					s_num = input_Int.nextInt();
					price = input_Double.nextDouble();
					date = input_Strings.nextLine();
					System.out.println("DONE!");
					
					Obj_Description obj_2 = new Obj_Description(itm_name, s_num, price, date);
					obj.Delete(name, obj_2);
					break;
					
					
				case 3:
					
					System.out.println("House name: " + home.name);
					System.out.println("House adress: " + home.adress);
					System.out.println(home.nrbathrooms + " Bathrooms");
					System.out.println(home.nrbedrooms + " Bedrooms");
					System.out.println(home.nrkitchens + " Kitchens");
					System.out.println(home.nrlivingrooms + " Livingrooms");
					System.out.println("The owners of the house:");
					home.Print_owners();
					
					System.out.println();
					System.out.println("The lists and the objects in house:");
					obj.Print_All();
					
					break;
					
				default:
					System.out.println("Invalid case!");
					break;
			}
			
			System.out.println();
		}
	}
}












