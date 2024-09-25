import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {


        BigInteger number = new BigInteger("36554651465432168765196874654168765132165765321654654654321324");
        BigInteger number2 = new BigInteger("654635419668765496876543541657654765416876476354168765465796546546876546576547654657657432135468798765465");
        BigInteger number3 = number.add(number2);
        BigInteger number4 = number.subtract(number2);
        BigInteger gcd = number3.gcd(number4);
        System.out.println(gcd);



        BigDecimal decimal = new BigDecimal("1123412341.123412341433456234523645345256");
        BigDecimal decimal2 = new BigDecimal("112334314343254354325412341.123412341433456234523645345256");
        System.out.println(decimal.pow(2));
    }

}