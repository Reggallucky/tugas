public class Main
{
    String nama;
    int umur;
    int nim;
    public void cetakinfo()
    {
        System.out.println("Nama\t\t=\t"+this.nama);
        System.out.println("umur\t\t=\t"+this.umur);
        System.out.println("nim\t\t=\t"+this.nim);
    }
}
public class mahasiswa extends Main 
{
    String alamat;
    string jurusan;
}
public class Home
{
    public static void main(String[] args)
    {
        Home akhdan = new mahasiswa();

        akhdan.nim="3121120";
        akhdan.jurusan="informatika";
        akhdan.nama="akhdan fahru rizqi";
        akhdan.umur="21";
    }
}
