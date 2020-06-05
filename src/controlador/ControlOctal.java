package controlador;

public class ControlOctal {

    ControlDecimal cd = new ControlDecimal();

    public ControlOctal() {
    }

    public long aDec(String numeroOct) {
        long digito;
        long dec = 0;
        int exp = 0;
        for (int i = numeroOct.length() - 1; i >= 0; i--) {//1(8^5=32) 0(8^4=16) 1(8^3=8) 0(8^2=4) 1(8^1=2) 0(8^0=1)
            digito = Integer.parseInt(String.valueOf(numeroOct.charAt(i)));
            dec += digito * (long) Math.pow(8, exp);
            exp++;
        }
        return dec;
    }

    public String aBin(String numeroOct) { //Reutilizo código de la clase ControlDecimal
        long oct_a_dec = aDec(numeroOct); //Convierto el número OCTAL a decimal
        String bin = cd.aBin(oct_a_dec); //Convierto el número decimal a BINARIO
        return bin;
    }

    public String aHex(String numeroOct) { //Reutilizo código de la clase ControlDecimal
        long oct_a_dec = aDec(numeroOct); //Convierto el número OCTAL a decimal
        String hex = cd.aHex(oct_a_dec); //Convierto el número decimal a HEXADECIMAL
        return hex;
    }

}
