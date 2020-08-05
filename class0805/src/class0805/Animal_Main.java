package class0805;

import java.util.ArrayList;
import java.util.List;

public class Animal_Main {

	public static void main(String[] args) {
		
		Animal[] animal = new Animal[3];
		int index;
		
		animal[0] = new Bird();
		animal[1] = new Fish();
		animal[2] = new Dog();
		
		for(int i=0; i<3; i++) {
			animal[i].move();
		}
		
		List<Animal> ani = new ArrayList<Animal>();
		ani.add(new Bird());
		ani.add(new Fish());
		ani.add(new Dog());
		
		for(int i=0; i<3; i++) {
			ani.get(i).move();
		}
	}
}
