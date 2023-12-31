public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];

      /* Create and print a chessboard. */
      for (int y=0; y<chessboard.length; y++) {
         for (int x = 0; x<chessboard.length; x++) {
            if ((x+y)%2 == 0)
               chessboard[y][x] = '□';
            else
               chessboard[y][x] = '■';
         }
      }

      for (char[] row: chessboard) {
         for (char square: row) {
            System.out.print(square);
         }
         System.out.println();
      }
   }
}