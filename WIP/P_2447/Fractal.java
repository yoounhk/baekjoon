// package unsolved.P_2447;

// import java.util.ArrayList;

// public class Fractal {
//   private int lengthOfLine = 3;
//   private ArrayList<Integer> listOfCenterIndex = new ArrayList<Integer>();
//   private static ArrayList<Character> str = new ArrayList<Character>();
//   private int degree;

//   public Fractal(int degree) {
//     this.lengthOfLine = degree;
//     for (int i = 0; i < lengthOfLine; i++) {
//       if (listOfCenterIndex.contains(i)) {
//         str.add(' ');
//       } else if (isNewLine) {
//         str.add('\n');
//       } else {
//         str.add('*');
//       }
//     }
//     new Fractal(degree / 3);
//   }

//   public void print() {
//     for (int i = 0; i < this.str.size(); i++) {
//       System.out.print(str.get(i));
//     }
//   }
// }