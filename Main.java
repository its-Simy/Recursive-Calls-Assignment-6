// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean changer = false;
       // System.out.println(countZeros("0001000"));

          //      "abcdef586485975324654 6543654465465465654zxjuf;gmlvnsrutmg;oisauit'pmvsaiaism'gtfoisa'iretpkyi9[-w0595768681687 +ias;fmpoiujasldjfmasd;f574697612000006800000"));
        //String java = "I 0love 0java0";
        //System.out.println(countDecimalPlaces(java));

        String work = "123.456";
        System.out.println(countDecimalPlaces(work, changer));
        int num = 3;
        System.out.println(factorial(num));
        System.out.println(fibonacci(4));




    }
    /*
    public static int countZeros(String str){
        String currentChar = "";

        System.out.println(str);
        if(str.length() > 0)
            currentChar = str.substring(0,1);
        else
            return 0;
        if(str.length() == 0)
            return 0;
        //if the length of the string and the current character is equal to 0
        //it calls upon the countzeros method again, but starts from the following indicie
        //Then, the plus one is actually the counter, so there isn't an int to follow along it is just that.
        else if(str.length() > 0 && currentChar.equals("0"))
            return countZeros(str.substring(1,str.length())) + 1 ;
        else if(str.length() > 0 && !currentChar.equals("0"))
            return countZeros(str.substring(1,str.length())) ;
        else
            return 0;

    }
    */


    public static int countDecimalPlaces(String str, boolean changer){
        String currentChar = "";
        //makes sure that the count doesn't start checking unless it passes decimal point

        char character;
        int characterNum = 0;
        //converts the first  of str into a char only if it has passed the decimal point
        //then converts the character into a hexadecimal value
        if(str.length() > 0 && changer == true) {
            character = str.charAt(0);
            characterNum = Character.getNumericValue(character);
            //System.out.println(characterNum);
        }

        //System.out.println(characterNum);
        //the if statements look to see that the string is long enough, and also
        //sets the value for the current character
        if(str.length() > 0)
            currentChar = str.substring(0,1);
        else
            return 0;
        if(str.length() == 0)
            return 0;
            //This is going to check for a .
        else if(str.length() > 0 && currentChar.equals(".")){
            changer = true;
            return countDecimalPlaces(str.substring(1,str.length()), changer) ;
        }
        //checks to see if the character is not a decimal point and the hexadecimal is for a number
        else if(str.length() > 0 && !currentChar.equals(".") && changer == true && (characterNum >=0 && characterNum <=9 ))
            return countDecimalPlaces(str.substring(1,str.length()), changer) + 1 ;

        else if(str.length() > 0 && !currentChar.equals(".") && changer !=true) {
            return countDecimalPlaces(str.substring(1, str.length()), changer);
        }
        else
            return 0;

    }

    public static int factorial(int n)
    {
        int fact;
        if (n > 1) {
            // recursive case (decomposition)
            fact = factorial(n-1) * n;
        }// composition
        else // base case
            fact = 1;
        return fact;
    }

    public static int fibonacci(int n)
    {
        int fib;
        if (n > 2)
            fib = fibonacci(n-1) + fibonacci(n-2);
        else if (n == 2)
            fib = 1;
        else
            fib = 0;
        return fib;
    }







}


