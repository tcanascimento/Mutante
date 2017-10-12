import java.util.Scanner;

/**
 * Created by thialves
 * On 05/10/17
 * For testeIntegracao
 **/

/**
 * deve receber um decimal como input e retornar o número em binário, bem como o tamanho da maior sequência, de repetições.
 * ex.: 121212 tem como tamanho 2, 1000, tem como tamanho 1, 12345 tem como tamanho 6, 123456, tem como tamanho 3
 * @author thialves
 *
 */

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
            this.bin_num[i++] = quot%2;
            this.quot = quot/2;
        }
    }

    public int getQuot(){
        return this.quot;
    }

    public String printBinary(){
        for(j=i-1; j>0; j--) {
            this.binary_str = binary_str + this.bin_num[j];
        }
        return binary_str;
    }
    
    //retira os 'zeros' à direita do numero, retornando a posição do índice com o último 1
    public int cleanBinary(){
        this.i = this.binary_str.length()-1;
        while(binary_str.charAt(i) == '0'){
            i--;
        }
        return i;
    }
    
    /**
     * Retorna o índice da posição do último 1
     * @return
     */
    public int getI() {
    		return this.i;
    }
    
    public int getLongestSequence(){
        for(; this.i>=0; this.i--) {
            if(this.binary_str.charAt(this.i)=='1') {
                length = Math.max(length, ctr);
                ctr = 0;
            } else {
                ctr++;
            }
        }
        return Math.max(length, ctr);
    }

}
