package controller;

import model.Child;
import model.Santa;
import model.Sledge;

import java.util.ArrayList;
import java.util.Collections;


public class ElfUtil {
	Santa loadsledge= new Santa();
	public ElfUtil() {
		// TODO Auto-generated constructor stub
	}
	public ArrayList sortedPressent(ArrayList<Child> childList) {
		Collections.sort(childList,(a,b)->a.getTownName().compareTo(b.getTownName()));
		ArrayList<String> load=new ArrayList<>();
		for(Child child : childList)
			load.add(child.getPresentsName());
		return load;
	}

	public void loadSledge(ArrayList<String> pressents) {

		loadsledge.addPressentToSledge(pressents);
	}
	public boolean isLoadSledge() {
		return loadsledge.getSledge().size() >0;
	}
}
