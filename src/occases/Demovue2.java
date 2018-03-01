/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occases;

/**
 *
 * @author gabri
 */
public class Demovue2 {
    public static void main(String[] args) {
        GarageVue gv=new GarageVue();
        gv.affMsg("salut");
        Voiture v =new Voiture("111","AAA","AAA",111,111,111);
        gv.affMsg(v);
        gv.affMsg("nom :");
        String nom=gv.getMsg();
        gv.affMsg("le nom encode est "+nom);
        String tel=gv.getMsg("tel :");
        gv.affMsg("le telephone encode est "+tel);
    }
}

