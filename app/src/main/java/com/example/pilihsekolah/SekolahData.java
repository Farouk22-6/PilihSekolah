package com.example.pilihsekolah;

import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.P;

class SekolahData {

    private static String[] SekolahNames = {
            "SMA Taruna Nusantara, Magelang",
            "SMA Negeri 8 Jakarta",
            "SMA Negeri 3 Bandung",
            "MAN Insan Cendekia, Tangerang",
            "SMA Negeri 3 Semarang",
            "SMA 1 Teladan, Yogyakarta",
            "SMA Negeri 5 Surabaya",
            "SMA Negeri 4 Denpasar",
            "SMA Negeri Plus Riau",
            "SMAK 1 BPK Penabur, Jakarta"

    };

    private static String[] SekolahDetails = {
            "SMA Taruna Nusantara merupakan salah satu sekolah menengah atas unggulan di Indonesia yang diakui memiliki kedisiplinan yang sangat tinggi, sehingga tidak sedikit masyarakat yang mencap kampus ini sebagai sekolah semi-militer. SMA yang berlokasi di Kota Magelang ini menerapkan sistem asrama, dimana SMA ini merupakan salah satu pelopor sekolah berasrama yang saat ini sedang menjamur",
            "Tak diragukan lagi SMA 8 Jakarta merupakan Sekolah Menengah Atas No 1 di ibukota, alumninya mendominasi kampus-kampus terkemuka negeri ini seperti Universitas Indonesia dan Institut Teknologi Bandung. Sekolah ini memiliki prestasi segudang baik nasional maupun internasional, tidak jarang peserta olimpiade internasional adalah siswa-siswi yang berasal dari SMA ini.",
            "SMA 3 Bandung merupakan Sekolah Menengah Atas yang sangat terpandang di Kota Bandung, sekolah ini dicap sebagai sekolah terbaik di kota kembang. Ada anank yang menyatakan bahwa SMA 3 Bandung merupakan sekolahnya ITB, artinya sebagian besar alumni SMA 3 Bandung mendominasi bangku perkuliahan di ITB. Prestasi yang diraih siswa-siswi SMA 3 Bandung tidak hanya mencakup nasional saja melainkan juga internasional.",
            "MAN Insan Cendekia adalah lembaga pendidikan setingkat SMA yang sangat diperhitungkan dinegeri ini meskipun cukup terbilang baru. Sekolah yang akrab disapa IC ini sangat mengedepankan IPTEK yang dilandasi dengan IMTAK kepada setiap siswa-siswinya. Sekolah ini merupakan ide brillian dari Presiden Republik Indonesia ke-3, Bapak BJ Habibie.",
            "SMA Negeri 3 Semarang merupakan salah satu Sekolah Menengah Atas terbaik di Indonesia, bahkan Depdiknas menobatkan sekolah ini sebagai SMA terbaik di Indonesia. Sekolah yang beralamat di Jalan Pemuda No. 149 Kota Semarang ini memiliki prestasi yang sangat luar biasa, baik akademik maupun non akademik. Sekolah ini juga merupakan salah satu sekolah pelopor untuk sekolah bertaraf internasional.",
            "Sebenarnya nama akademiknya adalah SMA Negeri 1 Yogyakarta, akan tetapi masyarakat Jogja akrab menyebutnya dengan SMA 1 Teladan. SMA ini merupakan Sekolah Menengah Atas unggulan di Provinsi Yogyakarta dengan prestasi yang segudang sejak dulu kala. SMA ini sangat legendaris, karena sudah ada sejak jaman penjajahan kolonial Belanda dan sampai sekarang masih berdiri kokoh.",
            "Smalabaya merupakan sapaan akrab untuk SMA Negeri 5 Surabaya, salah satu sekolah unggulan yang berada di Kota Surabaya, Jawa Timur. Alumninya mendominasi perkuliahan dikampus-kampus terkemuka negeri ini khusunya diwilayah Jawa Timur seperti Institut Teknologi 10 November, Universitas Airlangga, dan Universitas Brawijaya. Tidaklah mengherankan jika sekolah ini mendapatkan prosentasi tertinggi dalam penerimaan SMNPTN.",
            "Salah satu Sekolah Mengenah Atas unggulan dan favorit dipulau dewata adalah SMA Negeri 4 Denpasar. Sekolah ini sangat unik dengan arsitektur yang bernuasa Bali, diakui sebagai sekolah yang sangat menjunjung tinggi budaya lokal. SMA yang beralamat di Jalan Rinjani, Kota Denpasar ini memiliki fasilitas yang memadai untuk membantu proses belajar para siswa-siswinya disekolah.",
            "Meskipun terbilang sekolah baru, SMA Negeri Plus Riau jangan dilihat sebelah mata. SMA ini merupakan Sekolah Menengah Atas unggulan di Provinsi Riau, sekaligus menjadi sekolah acuan untuk SMA-SMA yang berada di Riau. SMA ini sangat didukung oleh fasilitas pendidikan, mulai dari sarana prasarana yang sangat mendukung hingga tenaga pengajar yang minimal strata 2.",
            "SMAK 1 BPK Penabur merupakan sekolah swasta jempolan diibukota dengan prestasi yang luar biasa. Sekolah ini sering sekali mengirimkan siswa-siswi pilihannya untuk berkompetisi dilevel nasional dan juga internasional, dan bahkan menjadi juaranya. Masyarakat ibukota mencap sekolah ini sebagai Sekolah Menengah Atas Swasta paling bergensi di Jakarta.",
    };

    private static int[] SekolahImages = {
            R.drawable.sma_taruna_nusantara,
            R.drawable.sman_negeri_8,
            R.drawable.sman_negeri_3_bandung,
            R.drawable.insan_cendekia,
            R.drawable.sman_3,
            R.drawable.sman_4,
            R.drawable.sman_5,
            R.drawable.sman_plus_riau,
            R.drawable.sman_1_teladan_yogyakarta,
            R.drawable.sman_1_jakarta,
    };

    static ArrayList<sekolah> GetSekolahData() {
        ArrayList<sekolah> list = new ArrayList<>();
        int position;
        for (position = 0; position < SekolahNames.length; position++){
            sekolah sekolah = new sekolah();
            sekolah.setName(SekolahNames[position]);
            sekolah.setDetails(SekolahDetails[position]);
            sekolah.setPhoto(SekolahImages[position]);
            list.add(sekolah);
        }
        return list;
    }
}



