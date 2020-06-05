package controlador;

public class ControlHexadecimal {

    ControlDecimal cd = new ControlDecimal();

    public ControlHexadecimal() {
    }

    public long aDec(String numeroHex) {
        String nrosHexadecimales = "0123456789ABCDEF";
        numeroHex = numeroHex.toUpperCase();//En cado de ingrsar minúsculas
        long dec = 0;
        char car;
        for (int i = 0; i < numeroHex.length(); i++) {
            car = numeroHex.charAt(i);
            int d = nrosHexadecimales.indexOf(car);
            dec = 16 * dec + d;
        }
        return dec;
    }

    public String aBin(String numeroHex) { //Reutilizo código de la clase ControlDecimal
        long hex_a_dec = aDec(numeroHex); //Convierto el número HEXADECIMAL a decimal
        String bin = cd.aBin(hex_a_dec); //Convierto el número decimal a BINARIO
        return bin;
    }

    public String aOct(String numeroHex) { //Reutilizo código de la clase ControlDecimal
        long hex_a_dec = aDec(numeroHex); //Convierto el número HEXADECIMAL a decimal
        String oct = cd.aOctal(hex_a_dec); //Convierto el número decimal a OCTAL
        return oct;
    }

}
