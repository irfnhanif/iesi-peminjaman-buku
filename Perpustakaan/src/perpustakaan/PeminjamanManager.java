/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author Hanif
 */
public class PeminjamanManager {
    public boolean save(BukuDipinjam[] bukuDipinjamCollection){
        Peminjaman peminjaman = new Peminjaman();
        
        for(BukuDipinjam bukuDipinjam: bukuDipinjamCollection ){
            peminjaman.daftarBuku.add(bukuDipinjam);
        }

        return true;
    }
}
