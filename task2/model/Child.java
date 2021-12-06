package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Child extends Presents  {
	private String childName;
	private String townName;
	private ArrayList<Child> children = new ArrayList<Child>();


	public Child(String presentsName, String childName, String townName) {
		super(presentsName);
		this.childName = childName;
		this.townName = townName;
	}

	public Child() {
	}
	public void addChild(Child child) {
		children.add(child);
	}

	public void printListChild(){
		if (children.size()>0) {
			System.out.println("Namelist:");
			for (Child child : children) {
				System.out.println(child);
			}
		} else System.out.println("No entries in the children list");
	}
	public String showPressent(String childName){
		if (children.size()>0) {
			for (Child child : children) {
				if (child.getChildName().equals(childName)) {
					return child.getPresentsName();
				}
			}
		}
		return "-1";
	}

	public ArrayList<Child> getChildren() {
		return children;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public String getTownName() {
		return townName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}

	@Override
	public String toString() {
		return  childName+" "+ townName+" "+ getPresentsName() ;
	}

}
