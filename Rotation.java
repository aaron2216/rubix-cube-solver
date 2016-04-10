package Rotation.Rubix;

import cube.rubix.Cube;

/**
 * The Rotation class has static methods that represent the different rotations
 * of the rubix cube.
 *
 */
public class Rotation {

	// front clockwise rotation
	public static void front(Cube c) {
		int[] up = new int[9];
		up = c.getUp();
		int[] down = new int[9];
		down = c.getDown();
		int[] right = new int[9];
		right = c.getRight();
		int[] left = new int[9];
		left = c.getLeft();

		int one = 6, two = 7, three = 8;
		int temp1 = up[one], temp2 = up[two], temp3 = up[three], temp4 = right[one], temp5 = right[two],
				temp6 = right[three];
		// replacing up with left
		up[one] = left[one];
		up[two] = left[two];
		up[three] = left[three];
		// replacing right with up
		right[one] = temp1;
		right[two] = temp2;
		right[three] = temp3;
		temp1 = down[one];
		temp2 = down[two];
		temp3 = down[three]; // temporarily saving down
		// replacing down with right
		down[one] = temp4;
		down[two] = temp5;
		down[three] = temp6;
		// replacing left with down
		left[one] = temp1;
		left[two] = temp2;
		left[three] = temp3;

	}

	// front counterclockwise
	public static void iFront(Cube c) {
		int[] up = new int[9];
		up = c.getUp();
		int[] down = new int[9];
		down = c.getDown();
		int[] right = new int[9];
		right = c.getRight();
		int[] left = new int[9];
		left = c.getLeft();

		int one = 6, two = 7, three = 8;
		int temp1 = up[one], temp2 = up[two], temp3 = up[three], temp4 = left[one], temp5 = left[two],
				temp6 = left[three];
		// replacing up with right
		up[one] = right[one];
		up[two] = right[two];
		up[three] = right[three];
		// replacing left with up
		left[one] = temp1;
		left[two] = temp2;
		left[three] = temp3;
		temp1 = down[one];
		temp2 = down[two];
		temp3 = down[three]; // temporarily saving down
		// replacing down with left
		down[one] = temp4;
		down[two] = temp5;
		down[three] = temp6;
		// replacing right with down
		right[one] = temp1;
		right[two] = temp2;
		right[three] = temp3;
	}

	// rotates back face clockwise
	public static void back(Cube c) {
		int[] up = new int[9];
		up = c.getUp();
		int[] down = new int[9];
		down = c.getDown();
		int[] right = new int[9];
		right = c.getRight();
		int[] left = new int[9];
		left = c.getLeft();

		int one = 0, two = 1, three = 2;
		int temp1 = up[one], temp2 = up[two], temp3 = up[three], temp4 = left[one], temp5 = left[two],
				temp6 = left[three];
		// replacing up with right
		up[one] = right[one];
		up[two] = right[two];
		up[three] = right[three];
		// replacing left with up
		left[one] = temp1;
		left[two] = temp2;
		left[three] = temp3;
		temp1 = down[one];
		temp2 = down[two];
		temp3 = down[three]; // temporarily saving down
		// replacing down with left
		down[one] = temp4;
		down[two] = temp5;
		down[three] = temp6;
		// replacing right with down
		right[one] = temp1;
		right[two] = temp2;
		right[three] = temp3;

	}

	// rotates back face counter-clockwise
	public static void iBack(Cube c) {

		int[] up = new int[9];
		up = c.getUp();
		int[] down = new int[9];
		down = c.getDown();
		int[] right = new int[9];
		right = c.getRight();
		int[] left = new int[9];
		left = c.getLeft();

		int one = 0, two = 1, three = 2;
		int temp1 = up[one], temp2 = up[two], temp3 = up[three], temp4 = right[one], temp5 = right[two],
				temp6 = right[three];
		// replacing up with left
		up[one] = left[one];
		up[two] = left[two];
		up[three] = left[three];
		// replacing right with up
		right[one] = temp1;
		right[two] = temp2;
		right[three] = temp3;
		temp1 = down[one];
		temp2 = down[two];
		temp3 = down[three]; // temporarily saving down
		// replacing down with right
		down[one] = temp4;
		down[two] = temp5;
		down[three] = temp6;
		// replacing left with down
		left[one] = temp1;
		left[two] = temp2;
		left[three] = temp3;

	}

//
// // rotates right face clockwise
// public static void right(Cube c) {
// int[] up = new int[9];
// up = c.getUp();
// int[] down = new int[9];
// down = c.getDown();
// int[] front = new int[9];
// front = c.getRight();
// int[] back = new int[9];
// back = c.getLeft();
//
// int one = 2, two = 5, three = 8;
// int temp1 = up[one], temp2 = up[two], temp3 = up[three], temp4 = back[one],
// temp5 = back[two],
// temp6 = back[three];
// // replacing up with front
// up[one] = front[one];
// up[two] = front[two];
// up[three] = front[three];
// // replacing back with up
// back[one] = temp1;
// back[two] = temp2;
// back[three] = temp3;
// temp1 = down[one];
// temp2 = down[two];
// temp3 = down[three]; // temporarily saving down
// // replacing down with back
// down[one] = temp4;
// down[two] = temp5;
// down[three] = temp6;
// // replacing front with down
// front[one] = temp1;
// front[two] = temp2;
// front[three] = temp3;
// }
//
// // rotates right clockwise
// public static void iRight(Cube c) {
//
// }
// }
