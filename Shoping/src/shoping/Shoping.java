/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shoping;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author shussain
 */
public class Shoping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        ArrayList<String>LocG=new ArrayList<>();
        LocG.add("Golghar");
        LocG.add("Eng Collage");
        LocG.add("Kunraghat");
        ArrayList<String>LocD=new ArrayList<>();
        LocG.add("Laxminagar");
        LocG.add("Dwarica");
        LocG.add("Palica Bazar");
        
        HashMap<String ,ArrayList<String>>SubLoc=new HashMap<>();
        SubLoc.put("Gorakhpur", LocG);
        SubLoc.put("Delhi", LocD);
        
        
        ArrayList<String>Categ=new ArrayList<>();
        Categ.add("jeans");
        Categ.add("jeans1");
        Categ.add("jeans2");
        Categ.add("jeans3");
        Categ.add("jeans4");
        
        
        
    }
}
