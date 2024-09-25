import java.math.BigDecimal;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) {
        BigInteger number = new BigInteger("93983983983938983839839439789785787489783479479024304093049048945945945089595894805849850485930948958495803");
        BigInteger number2 = new BigInteger("4095098940985095095857589479578597560195753450156407515604315485601510454675648755680753018568057578650475604");
        BigInteger number3 = number.add(number2);
        BigInteger number4 = number.subtract(number2);
        System.out.println(number4);
        System.out.println(number3);
        BigInteger gcd = number3.gcd(number4);
        System.out.println(gcd);



        BigDecimal i = new BigDecimal("1123412341.123412341433456234523645345256");
        BigDecimal i2 = new BigDecimal("14793738947895734923.4309483049830940394034930495256");
        BigDecimal square = Math.pow(i, 1123412341.123412341433456234523645345256);
        BigDecimal square2 = Math.pow(i2, 14793738947895734923.4309483049830940394034930495256);
        System.out.println(square + square2);
    }
}
