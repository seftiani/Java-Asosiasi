package JavaAsosiasi;

import static java.time.Clock.system;

/**
 *
 * @author Seftiani Ayu Lestari
 */
public class MainJava {
    public static void main(String args[]){
        Mahasiswa m1 = new Mahasiswa();
        m1.setNim("20050974054");
        m1.setNama("Seftiani Ayu Lestari");
        
        Mahasiswa m2 = new Mahasiswa();
        m2.setNim("20050974074");
        m2.setNama("Seftiani Ayu Lestari");
        
        Dosen d =new Dosen();
        d.setKodeDosen("SAL");
        
        d.setNimMahasiswa(m1.getNim());
        d.setNimMahasiswa(m2.getNim());
        
        System.out.println("Kode Dosen:"+d.getKodeDosen());
        System.out.println("Mengajar Mahasiswa");
        
        int jum = d.getJumlahMhs();
        
        for(int i=0; i<jum; i++){
            System.out.println(" -"+d.getNimMhs(i));
        }
    }
    
    
    
}
