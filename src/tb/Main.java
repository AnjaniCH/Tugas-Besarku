/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb;

/**
 *
 * @author COMPAQ
 */
public class Main {

    public static void main(String[] args) {
        Kenyamanan_Ruang_Kelas[] pil1 = new Kenyamanan_Ruang_Kelas[1];
        Keamanan_Ruang_Kelas[] pil2 = new Keamanan_Ruang_Kelas[1];
        list_inputan []pil3 = new list_inputan[1];

        for (int i = 0; i < pil1.length; i++) {
            pil1[i] = new Kenyamanan_Ruang_Kelas();
            pil1[i].input_data();
            pil1[i].analisisbising();
            pil1[i].analisisbau();
            pil1[i].analisisbocor();
            pil1[i].analisisrusak();
            pil1[i].analisisaus();
            pil1[i].tampil_data();
        }
        for (int i = 0; i < pil2.length; i++) {
            pil2[i] = new Keamanan_Ruang_Kelas();
            pil2[i].input_data();
            pil2[i].analisiskokoh();
            pil2[i].analisiskuncipintujendela();
            pil2[i].analisisaman();
            
        }
        for (int i = 0; i < pil3.length; i++) {
            pil3[i] = new list_inputan();
        pil3[i].listinputan();
        }
    }

}
