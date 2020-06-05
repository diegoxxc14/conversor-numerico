package controlador;

public class ControlBinario {

    ControlDecimal cd = new ControlDecimal();

    public ControlBinario() {
    }

    public long aDec(String numeroBin) {
        long digito;
        long dec = 0;
        int exp = 0;
        for (int i = numeroBin.length() - 1; i >= 0; i--) {//1(2^5=32) 0(2^4=16) 1(2^3=8) 0(2^2=4) 1(2^1=2) 0(2^0=1)
            digito = Integer.parseInt(String.valueOf(numeroBin.charAt(i)));
            dec += digito * (long) Math.pow(2, exp);
            exp++;
        }
        return dec;
    }

    public String aOctal(String numeroBin) { //Reutilizo código de la clase ControlDecimal
        long bin_a_dec = aDec(numeroBin); //Convierto el número BINARIO a decimal
        String oct = cd.aOctal(bin_a_dec); //Convierto el número decimal a OCTAL
        return oct;
    }

    public String aHex(String numeroBin) { //Reutilizo código de la clase ControlDecimal
        long bin_a_dec = aDec(numeroBin); //Convierto el número BINARIO a decimal
        String hex = cd.aHex(bin_a_dec); //Convierto el número decimal a HEXADECIMAL
        return hex;
    }
}
