import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by thialves
 * On 05/10/17
 * For testeIntegracao
 **/
public class testVetorOrdenado {

    VetorOrdenado v;
    VetorOrdenado z;

    public static VetorOrdenado populaVetor(VetorOrdenado v, int tamanhoVetor){
        VetorOrdenado temp = v;
        Random r = new Random();
        for(int i = 0; i < tamanhoVetor; i++){
            temp.ins(r.nextInt());
        }
        return temp;
    }

    public static Integer[] cloneToArray(VetorOrdenado v){
        Integer temp [] = new Integer[v.getNroElem()];
        for(int i = 0; i < v.getNroElem(); i++){
            temp[i] = v.get(i);
        }

        return temp;
    }

    @Test
    public void testIns(){

        v = new VetorOrdenado(2);
        v.ins(1);
        v.ins(2);

        Assert.assertNotNull(v);
        Assert.assertEquals(v.getNroElem(), 2);
        Assert.assertFalse(v.ins(3));
    }

    @Test
    public void testGetNroEl(){

        v = new VetorOrdenado(3);
        z = new VetorOrdenado(-1);
        populaVetor(v, 3);

        Assert.assertEquals(v.getNroElem(), 3);
        Assert.assertNotEquals(v.getNroElem(), 4);
        Assert.assertEquals(z.getNroElem(), 0);

    }

    @Test
    public void testGetEl(){

        v = new VetorOrdenado(5);
        populaVetor(v, 5);

        Assert.assertNotNull(v.get(4));
        Assert.assertEquals(v.get(6), v.get(5));
        Assert.assertNotSame(v.get(6), v.get(5));

    }

    @Test
    public void testOrdenacao(){

        v = new VetorOrdenado(5);
        populaVetor(v, 5);

        List<Integer> temp = new ArrayList();
        for(int i = 0; i < v.getNroElem(); i++){
            temp.add(v.get(i));
        }
        Collections.sort(temp);
        v.ordena();
        Integer[] clone  = cloneToArray(v);
        Object[] cloneList  = temp.toArray();

        Assert.assertArrayEquals(clone, cloneList);

    }
}
