/**
 * Created by thialves
 * On 05/10/17
 * For testeIntegracao
 **/
public class VetorOrdenado {

    private int vet[];
    private int pos;
    private int tamanho;

    public VetorOrdenado(int  tam){
        if (tam <= 0) tam = 1;
        vet = new int[tam];
        tamanho = tam;
        pos = 0;
    }

    public boolean ins(int v){
        if (pos == tamanho) return(false);
        vet[pos] = v;
        pos++;
//	        ordena();
        return(true);
    }

    public int getNroElem(){
        return(pos);
    }

    public int get(int i){
        if (i < 0) i = 0;
        else if (i >= tamanho) i = tamanho-1;
        return(vet[i]);
    }

    public void ordena(){
        int lim , k = 0, tmp;
        boolean troca = true;

        lim = tamanho-1;
        while (troca) {
            troca = false;
            for (int i=0; i<=lim-1; i++) {
                if (vet[i] > vet[i+1]) {
                    tmp = vet[i];
                    vet[i] = vet[i+1];
                    vet[i+1]= tmp;
                    troca = true;
                    k = i;
                }
            }
            lim = k;
        }
    }
}
