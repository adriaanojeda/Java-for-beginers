public class HundredthPrime
{
   public static void main(String[] args)
   {
      int count = 0;
      int numero = 2;

      while (count<100) {
         boolean esPrimo = true;

         for (int i =2;i<numero;i++) {
            if (numero % i == 0) {
               esPrimo = false;
               break;
            }
         }
         if (esPrimo) {
            count++;
            if (count == 100) {
               System.out.println(numero);
               break;
            }
         }
         numero++;
      }

   }
}