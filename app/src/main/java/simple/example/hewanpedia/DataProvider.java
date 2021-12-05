package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Burung;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Ikan;
import simple.example.hewanpedia.model.Ular;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Ular> initDataUlar(Context ctx) {
        List<Ular> ulars = new ArrayList<>();
        ulars.add(new Ular("Anaconda", "Amerika Selatan",
                "Anakonda adalah golongan ular besar yang endemik di perairan tawar dan sungai-sungai di daerah tropis Amerika Selatan.", R.drawable.anaconda));
        ulars.add(new Ular("Beludak", "Hampir di seluruh negara",
                "Beludak adalah sekelompok ular berbisa, familia Viperidae.", R.drawable.beludak));
        ulars.add(new Ular("Cobra", "Afrika dan Asia",
                "Ular sendok atau kobra adalah sebutan khusus untuk semua jenis ular berbisa yang memiliki kemampuan memipihkan lehernya hingga membentuk seperti sendok atau tudung.", R.drawable.cobra));
        ulars.add(new Ular("Mamba", "Afrika",
                "Mamba adalah sebutan umum untuk empat spesies ular berbisa mematikan yang semuanya diklasifikasikan sebagai genus Dendroaspis.", R.drawable.mamba));
        ulars.add(new Ular("Sanca", "Afrika, Asia, Australia",
                "Sanca adalah sebutan umum untuk semua jenis ular pembelit yang diklasifikasikan sebagai familia Pythonidae.", R.drawable.sanca));
        ulars.add(new Ular("Taipan", "Australia dan Papua",
                "Taipan adalah sebutan untuk tiga spesies ular Elapidae mematikan yang semuanya diklasifikasikan sebagai genus Oxyuranus. ", R.drawable.taipan));

        return ulars;
    }

    private static List<Ikan> initDataIkan(Context ctx) {
        List<Ikan> ikans = new ArrayList<>();
        ikans.add(new Ikan("Arwana Asia", "Asia",
                "Arwana Asia, atau Siluk Merah adalah salah satu spesies ikan air tawar dari Asia Tenggara.", R.drawable.arwana));
        ikans.add(new Ikan("Cupang", "Indonesia ",
                "Betta splendens selain sebagai cupang hias, betta splendes merupakan jenis adu terutama jenis yang lama.", R.drawable.cupang));
        ikans.add(new Ikan("Ikan Mas", "Indonesia",
                "Ikan mas atau Ikan karper adalah ikan air tawar yang memiliki nilai ekonomis penting dan sudah tersebar luas di Indonesia.", R.drawable.mas));
        ikans.add(new Ikan("Gupi", "Amerika Utara",
                "Gupi, ikan seribu, ikan cere, atau suwadakar, adalah salah satu spesies ikan hias air tawar yang paling populer di dunia.", R.drawable.gupi));
        ikans.add(new Ikan("Hiu Paus", "seluruh Samudra",
                "Hiu paus, Rhincodon typus, adalah hiu pemakan plankton yang merupakan spesies ikan terbesar.", R.drawable.hiu));
        ikans.add(new Ikan("Nemo", "Amerika Serikat",
                "Ikan badut Ocellaris adalah ikan aquarium populer. Ikan badut ini dapat dikenali dengan warna jingganya. ", R.drawable.nemo));

        return ikans;
    }

    private static List<Burung>initDataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung("Burung Hantu", "Lebih banyak di Greenland",
                "Burung adalah anggota kelompok hewan bertulang belakang yang memiliki bulu dan sayap.", R.drawable.burunghantu));
        burungs.add(new Burung("Kolibri", "Amerika Utara dan Selatan",
                "Kolibri adalah burung kecil dengan panjang 6,4 cm dan berwarna cerah yang sebagian besar hidup di Amerika Utara dan Amerika Selatan.", R.drawable.kolibri));
        burungs.add(new Burung("Burung Kuntul", "Asia",
                "Kuntul adalah sebutan untuk burung dari keluarga Ardeidae.", R.drawable.kuntul));
        burungs.add(new Burung("Merpati", "Banyak diberbagai kota",
                "Merpati dan dara termasuk dalam famili Columbidae atau burung berparuh merpati dari ordo Columbiformes, yang mencakup sekitar 300 spesies burung kerabat pekicau.", R.drawable.merpati));
        burungs.add(new Burung("Penguin", "Kutub Selatan",
                "Penguin atau pinguin adalah hewan akuatik jenis burung yang tidak bisa terbang dan secara umum hidup di belahan Bumi selatan", R.drawable.penguin));
        burungs.add(new Burung("Potoo", "Amerika Tengah dan Selatan",
                "Diterjemahkan dari bahasa Inggris-Potoos adalah sekelompok burung Caprimulgiformes yang terkait dengan nightjars dan frogmouths. ", R.drawable.potoo));

        return burungs;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataUlar(ctx));
        hewans.addAll(initDataIkan(ctx));
        hewans.addAll(initDataBurung(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
