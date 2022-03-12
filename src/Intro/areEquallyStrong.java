/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;
import java.util.ArrayList;
import java.util.Hashtable;
public class areEquallyStrong {
    public static void main(String[] args) {
        Hashtable mine=new Hashtable();
        Hashtable frnds=new Hashtable();
        ArrayList m=new ArrayList();
        ArrayList f=new ArrayList();
        
        int yourLeft
             =20;
        int yourRight=15;
        int fl=15;
        int fr=10;
        boolean flag=true;
        m.add(yourLeft
     );
        m.add(yourRight);
        f.add(fl);
        f.add(fr);
        for(int i=0;i<m.size();i++){
            if(!f.contains(m.get(i))){
                flag=false;
                break;
            }
                
        }
        System.out.println("flag: "+flag);
//        mine.put("left", yourLe);
//        mine.put("right", yourRight);
//        frnds.put("left", fl);
//        frnds.put("right", fr);
//        if((mine.get("left")==frnds.get("left"))||(mine.get("left")==frnds.get("rignt"))){
//            
//        }
        
       
        
    }
}
