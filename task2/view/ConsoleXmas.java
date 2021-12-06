package view;

import model.Child;
import model.Elf;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleXmas {
	/*
	 * the console dialog comes here
	 */
	public void dialog() {
		Child newchild=new Child();
		Elf newElf = new Elf();
		ArrayList load=new ArrayList();
		do {
			System.out.print("Pleas login: ");
			Scanner scanner = new Scanner(System.in);
			Scanner scanner0 = new Scanner(System.in);
			String type = scanner0.nextLine();
			char exit = 0;
			switch (type) {
				case "child": {


					do {
						System.out.print("Please enter the name:");
						String name = scanner.nextLine();
						System.out.print("Pease enter the pressent: ");
						String pressent = scanner.nextLine();
						System.out.print("Please enter the town: ");
						String town = scanner.nextLine();
						Child test2 = new Child(pressent, name, town);
						newchild.addChild(test2);
						System.out.print("x for exit");
						Scanner scanner1 = new Scanner(System.in);
						exit = scanner1.next().charAt(0);
					} while (exit != 'x');

					break;
				}
				case "santa": {

					do {
						System.out.println("1...print list of childs");
						System.out.println("2...print pressent from child");
						System.out.println("3...check the sledge ");
						System.out.println("x...exit");
						Scanner scanner2 = new Scanner(System.in);
						exit = scanner2.next().charAt(0);
						if (exit == '1') {
							newchild.printListChild();
						}
						if (exit == '2') {
							System.out.print("Enter the child name to show the pressent: ");
							Scanner scanner3 = new Scanner(System.in);
							String name = scanner3.nextLine();
							String output= newchild.showPressent(name);
							if (output.equals("-1")) System.out.println("No entries found");
							else System.out.println(name + " wants " + output + " for christmas");
						}
						if (exit == '3') {
							if (newElf.isLoadSledge()) System.out.println("Slidge is full load");
							else System.out.println("Slidge is not load");
						}
						System.out.println("");
					} while (exit != 'x');
					break;
				}
				case "elf": {
					do {
						System.out.println("1...sort the pressents");
						System.out.println("2...load the sledge");
						System.out.println("x...exit");
						Scanner scanner4 = new Scanner(System.in);
						if (exit == '1') {
							System.out.println("namelist:");

							load=newElf.sortedPressent(newchild.getChildren());

						}
						if (exit == '2') {
							newElf.loadSledge(load);
						}
						exit = scanner4.next().charAt(0);
					}while  (exit != 'x');
				}
			}
		}while(true);
	}
}
