package controlador;

public class ControlDecimal {

    public ControlDecimal() {
    }

    public String aBin(long numeroDec) {
        String binario = "";
        if (numeroDec != 0) {//Si el numeroDec no es 0
            while (numeroDec > 0) {
                if (numeroDec % 2 == 0) { //Si el MOD es 0
                    binario = "0" + binario;
                } else { //Caso contrario el MOD es 1
                    binario = "1" + binario;
                }
                numeroDec /= 2; //Divido para 2 el numeroDec 
            }
        } else {//En caso que el numeroDec sea 0
            binario = "0";
        }
        return binario;
    }

    public String aOctal(long numeroDec) {
        long digito;
        String octal = "";
        if (numeroDec != 0) {//Si el numeroDec no es 0
            while (numeroDec != 0) {
                digito = numeroDec % 8;
                octal = String.valueOf(digito) + octal;
                numeroDec /= 8;
            }
        } else {
            octal = "0";
        }
        return octal;
    }

    public String aHex(long numeroDec) {
        char nrosHexa[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexa = "";
        long digito;
        while (numeroDec > 0) {
            digito = numeroDec % 16;
            hexa = nrosHexa[(int) digito] + hexa;
            numeroDec /= 16;
        }
        return hexa;
    }
}
