package model;

import java.util.ArrayList;

// Sledge = Schlitten
public class Sledge {
	private ArrayList<String> sledge=new ArrayList<>();

	public void addPressentToSledge(ArrayList pressent) {
		sledge.addAll(pressent);
	}

	public Sledge() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getSledge() {
		return sledge;
	}
}
