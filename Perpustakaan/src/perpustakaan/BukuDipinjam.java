/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author Hanif
 */
public class BukuDipinjam extends Buku {
    private int lama;
    
    BukuDipinjam(String judul, int lama){
        super(judul);
        this.lama = lama;
    }
}
