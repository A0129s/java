class calculator {
   calculator() {
   }

   public int add(int var1, int var2) {
      return var1 + var2;
   }

   public int sub(int var1, int var2) {
      return var1 - var2;
   }

   public int mul(int var1, int var2) {
      return var1 * var2;
   }

   public int div(int var1, int var2) {
      return var1 / var2;
   }
}



// advcalc ke pas calculator ke bhi features honge
public class advcalc extends calculator{

    public int mod(int a, int b) {
        return a % b;
    }

    public int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
   
}
