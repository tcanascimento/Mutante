import java.util.Scanner;

/**
 * Created by thialves
 * On 05/10/17
 * For testeIntegracao
 **/

public class Longest {

    private int dec_num, rem, quot, i=1, j;
    private int bin_num[] = new int[100];
    private String binary_str="";
    private int length = 0;
    private int ctr = 0;

    public Longest(int decimal){
        this.dec_num = decimal;
        this.quot = dec_num;
    }

    public void generateQuot(){
        while(this.quot != 0){
            bin_num[i++] = quot%2;
            quot = quot/2;
        }
    }

    public String printBinary(){
        for(j=i-1; j>0; j--) {
            binary_str = binary_str + bin_num[j];
        }
        return binary_str;
    }

    public int cleanBinary(){
        this.i = this.binary_str.length()-1;
        while(binary_str.charAt(i) == '0'){
            i--;
        }
        return i;
    }

    public int getLongestSequence(){

        for(; i>=0; i--) {
            if(binary_str.charAt(i)=='1') {
                length = Math.max(length, ctr);
                ctr = 0;
            } else {
                ctr++;
            }
        }
        return Math.max(length, ctr);
    }
}
