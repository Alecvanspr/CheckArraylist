import com.company.Arraylist;
import com.company.Arraylist2;
import com.company.Main;
import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void Testeen(){
        Main main = new Main();
        ArrayList<Arraylist2> invoer= new ArrayList<>();
        ArrayList<Arraylist> eerste = new ArrayList<>();
        Arraylist Siccomode = new Arraylist();
        invoer.add(main.MaakNieuw("Bruh"));
        invoer.add(main.MaakNieuw("Huts"));
        Siccomode.setArraylist2s(invoer);
        eerste.add(Siccomode);
        main.setArlis(eerste);
        Assert.assertEquals("Bruh",main.getArlis().get(0).getArraylist2s().get(0).getInvoer2());
    }
    @Test
    public void TestTwee(){
        Main main = new Main();
        ArrayList<Arraylist2> invoer= new ArrayList<>();
        ArrayList<Arraylist2> invoer2 = new ArrayList<>();
        ArrayList<Arraylist> eerste = new ArrayList<>();
        Arraylist Siccomode = new Arraylist();
        Arraylist HutsANiffau = new Arraylist();
        invoer.add(main.MaakNieuw("Bruh"));
        invoer.add(main.MaakNieuw("Huts"));
        invoer2.add(main.MaakNieuw("Gang Gang"));
        invoer2.add(main.MaakNieuw("De laatste"));
        Siccomode.setArraylist2s(invoer);
        HutsANiffau.setArraylist2s(invoer2);
        eerste.add(Siccomode);
        eerste.add(HutsANiffau);
        main.setArlis(eerste);
        Assert.assertEquals("De laatste",main.getArlis().get(1).getArraylist2s().get(1).getInvoer2());
    }
}
