/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Mar 2018
 * Created for: learning
 * 
 * This class is a 'blueprint' for a stack
 *
 ****************************************************************************/

import java.util.ArrayList;

//****************************************************************************

// MyStack of type(integer, string, boolean,...): "Type"
public class MyStack<Type> {
	//This class defines a stack
	
	//create an ArrayList(growable)
	//Yes it is private
	private ArrayList<Type> list = new ArrayList<Type>();
	
	
	/*********************************************************
	 * Use Type to replace places of info type
	 * 
	 * 
	 * public Type  X()		&		public String/Integer/Whatever X()
	 * ->  return a value of type "Type"
	 * 
	 * 
	 * public void  X()
	 * ->  no return
	 *
	 *************************************************************/

	//-----------------------
	public String str() {
		//returns list as a string
		return list.toString();
	}

	
	//-----------------------
	public Type at(int place) {
		//returns the item at input index
		return list.get(place);
	}


	//-----------------------
	public Type pop() {
		//pops the last value from the stack and return it
								//last index
		Type value = list.get(list.size() - 1);
		list.remove(value);
		return value;
	}
	
	//-----------------------
	public void push(Type value) {
		//append an object to the end of the stack
		list.add(value);
	}

}//closing for class

