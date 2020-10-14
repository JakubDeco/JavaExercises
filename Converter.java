package sk.deco.keakademia.ciselnesustavy;

public class Converter {

    /**
     * This function converts binary value to decimal
     * @param value
     * @return int converted
     */
    public int convertBinaryToDecimal(int value){
        int converted=0;
        int storeValue=value;
        int help;
        for (help = 0; value != 0; help++) {
            value/=10;
        }
        value=storeValue;
        for (int i = 0; i<help; i++) {
            int numb=value%10;
            converted= (int) (converted+numb*Math.pow(2,i));
            value/=10;
        }
        return converted;
    }

    /**
     * This function converts octal value to decimal
     * @param value
     * @return int converted
     */
    public int convertOsctalToDecimal(int value){
        int converted=0;
        int storeValue=value;
        int help;
        for (help = 0; value != 0; help++) {
            value/=10;
        }
        value=storeValue;
        for (int i = 0; i<help; i++) {
            int numb=value%10;
            converted= (int) (converted+numb*Math.pow(8,i));
            value/=10;
        }
        return converted;
    }

    /**
     * This method converts decimal value to binary
     * @param value
     * @return String converted
     */
    public String convertDecimalToBinary(int value){
        if(value<=0)
            return "0";

        String converded="";
        while(value>0){
            converded=(value%2)+converded;
            value=value/2;
        }
        return converded;
    }

    /**
     * This method converts decimal value to octal
     * @param value
     * @return String converted
     */
    public String convertDecimalToOctal(int value){
        if(value<=0)
            return "0";

        StringBuilder converded = new StringBuilder();
        while(value>0){
            converded.insert(0, (value % 8));
            value=value/8;
        }
        return converded.toString();
    }

    /**
     * This method converts decimal value to hex
     * @param value
     * @return String converted
     */
    public String convertDecimalToHexadecimal(int value){
        int help;
        if(value<=0)
            return "0";


        String converded="";
        while(value>0){
            help=(value%16);
            switch(help){
                case 10: converded="A"+converded; break;
                case 11: converded="B"+converded; break;
                case 12: converded="C"+converded; break;
                case 13: converded="D"+converded; break;
                case 14: converded="E"+converded; break;
                case 15: converded="F"+converded; break;
                default: converded=help+converded;
            }
            value=value/16;
        }
        return converded;
    }
}
//TODO finish documentation
