
/**
 * Author Nihit Rai
 * This class provides method to find GCD of two numbers.
 * 
 */
class FindGCD {
  
   /**
    * Method to recusrively find GCD of two numbers passed as parameters
    */
   def gcd(a: Int,b: Int): Int = {
       if(b ==0) a else gcd(b, a%b)
    }
}

object mainObj
{
    
    def main(args: Array[String]) {
        var obj = new FindGCD();
        
        //Pass input as parameter
        println(obj.gcd(25,50));
    }
}