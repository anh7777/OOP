public class Grade {
   public static char getLetterGrade(int mark) {
      // assume that mark is between 0 and 100 (inclusive)
      assert (mark >= 0 && mark <= 100) : "mark is out-of-range: " + mark;
      if (mark >= 75) {
         return 'A';
      } else if (mark >= 60) {
         return 'B';
      } else if (mark >= 50) {   // corrected logical error
         return 'C';
      } else {
         return 'F';
      }
   }
}
