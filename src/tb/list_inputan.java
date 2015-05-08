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
public class list_inputan extends Identitas_Ruang_Kelas{
    public void listinputan(){
        
        Kenyamanan_Ruang_Kelas pilihan = new Kenyamanan_Ruang_Kelas();
        System.out.println(""+pilihan.analisisbising());
        System.out.println(""+super.getBau());
        System.out.println(""+pilihan.analisisbau());
        System.out.println(""+super.getKebocoran());
        System.out.println(""+pilihan.analisisbocor());
        System.out.println(""+super.getKerusakan());
        System.out.println(""+pilihan.analisisrusak());
        System.out.println(""+super.getKeausan());
        System.out.println(""+pilihan.getKeausan());
        System.out.println(""+super.getKekokohan());
        Keamanan_Ruang_Kelas pilihan2 = new Keamanan_Ruang_Kelas();
        System.out.println(""+pilihan2.analisiskokoh());
        System.out.println(""+super.getKun_pintu());
        System.out.println(""+pilihan2.analisiskuncipintujendela());
        System.out.println(""+super.getKun_jendela());
        System.out.println(""+pilihan2.analisiskuncipintujendela());
        System.out.println(""+super.getBahaya());
        System.out.println(""+pilihan2.analisisaman());
    }
}
