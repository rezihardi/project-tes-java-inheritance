public class Main {
    public static void main(String[] args) {
        Kendaraan[] b = new Kendaraan[3];
        Mobil[] a = new Mobil[3];
        a[0] = new Mobil("xpander", "SUV", 3, 4);
        a[1] = new Mobil("Innova", "MPV", 5, 4);
        a[2] = new Mobil("lancer", "Sport", 4, 6);

        for (int i = 0; i < a.length; i++) {
            System.out.println("spesifikasi dari mobil: " + a[i].nama +", berjenis mobil "+ a[i].jenis +" dengan jumlah roda "+ a[i].jumlahRoda  +", dengan jumlah silinder "+ a[i].jmlSilinder);
        }
    }
}