package JavaAsosiasi;
/**
 *
 * @author Seftiani Ayu Lestari
 */
public class Dosen {
    private  String kodeDosen;
    private final String[] nimMhs = new String[5];
    private int jumlahMhs;
    
    public void setKodeDosen (String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }
    public void setNimMahasiswa (String nimMhs){
        if (jumlahMhs<this.nimMhs.length){
            this.nimMhs[jumlahMhs] = nimMhs;
            jumlahMhs++;
        }
    }
    public String getKodeDosen(){
        return this.kodeDosen;
    }
    public int getJumlahMhs(){
        return this.jumlahMhs;
    }
    public String getNimMhs(int indeks){
        return (nimMhs[indeks]);
    } 
}
