package cube.rubix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * the cube class uses six arrays with 9 elements in each to represent each face
 * of the rubix cube. the constructor creates a random cube. The getter methods
 * return the faces of the cube. the print method prints the cube.
 */
public class Cube {

	// 6 arrays used to represent the six faces of the cube
	private int[] up = new int[9];
	private int[] down = new int[9];
	private int[] right = new int[9];
	private int[] left = new int[9];
	private int[] back = new int[9];
	private int[] front = new int[9];

	// the constructor creates a random cube
	public Cube() {

		List<Integer> color = new ArrayList<Integer>();
		for (int i = 1; i < 7; i++) {
			color.add(i);
		}
		// initializes the cube using with random colors from the list
		for (int i = 0; i < 9; i++) {
			Collections.shuffle(color);
			up[i] = color.get(0);
			down[i] = color.get(1);
			right[i] = color.get(2);
			left[i] = color.get(3);
			back[i] = color.get(4);
			front[i] = color.get(5);
		}
	}// end of constructor method

	// getter methods return the arrays used to represent the cube
	public int[] getUp() {
		return up;
	}

	public int[] getDown() {
		return down;
	}

	public int[] getRight() {
		return right;
	}

	public int[] getLeft() {
		return left;
	}

	public int[] getBack() {
		return back;
	}

	public int[] getFront() {
		return front;
	}

	// prints the cube
	public void print() {
		// prints up face
		System.out.print("Up Face");
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0) {
				System.out.println();
			}
			System.out.print(up[i] + " ");
		} // prints down face
		System.out.println();
		System.out.print("Down Face");
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0) {
				System.out.println();
			}
			System.out.print(down[i] + " ");
		} // prints right face
		System.out.println();
		System.out.print("Right Face");
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0) {
				System.out.println();
			}
			System.out.print(right[i] + " ");
		} // prints left face
		System.out.println();
		System.out.print("Left Face");
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0) {
				System.out.println();
			}
			System.out.print(left[i] + " ");
		} // Prints back face
		System.out.println();
		System.out.print("Back Face");
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0) {
				System.out.println();
			}
			System.out.print(back[i] + " ");
		} // prints front face
		System.out.println();
		System.out.print("Front Face");
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0) {
				System.out.println();
			}
			System.out.print(front[i] + " ");
		}
	}// end of print function

}// end of cube class