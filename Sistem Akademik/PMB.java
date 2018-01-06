import java.util.Scanner;

class PMB {
		int a;
		int b;
		int c;
		int d;
		int e;
		int seri;

	void tes() {
		Scanner input = new Scanner (System.in);

		System.out.println("Silahkan Ikuti Tes Berikut Ini Untuk Seleksi Penerimaan Mahasiswa Baru STTB !!!");
		System.out.println("Note : ");
		System.out.println("Hanya yang bisa mengerjakan semua soal dibawah ini dengan benar yang akan diterima...");
		System.out.println("Kerjakanlah dengan sebaik-baiknya...!!!");
		System.out.println(" ");
		System.out.println("	SELAMAT MENGERJAKAN......");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("***************** TES MASUK SEKOLAH TINGGI TEKNOLOGI BANDUNG *****************");
		System.out.println(" ");
		System.out.println("Jawablah pertanyaan berikut dengan [1/2/3/4]");
		System.out.println(" ");
		System.out.println("Untuk soal nomor 1-2 ");
		System.out.println("pilihlah kata yang merupakan pasangan paling sesuai untuk mengisi titik-titik.");
		System.out.println(" ");
		System.out.println("A. MAKAN:LAPAR = LAMPU: ");
		System.out.println("   1. Padang");
		System.out.println("   2. Terang");
		System.out.println("   3. Pijar");
		System.out.println("   4. Gelap");
		System.out.println(" ");
		System.out.print(" Jawab : ");
		a = input.nextInt();
		System.out.println(" ");
		System.out.println("B. KEUNTUNGAN:PENJUALAN = KEMASYHURAN: ");
		System.out.println("   1. Pembelian");
		System.out.println("   2. Keberanian");
		System.out.println("   3. Penipuan");
		System.out.println("   4. Jenderal");
		System.out.println(" ");
		System.out.print(" Jawab : ");
		b = input.nextInt();
		System.out.println(" ");
		System.out.println("Untuk soal nomor 3-4");
		System.out.println("pilihlah pasangan kata yang hubungannya sama atau dekat");
		System.out.println(" ");
		System.out.println("C. PESAWAT TERBANG:KABIN ");
		System.out.println("   1. Laci : Meja");
		System.out.println("   2. Gedung : Eskalator ");
		System.out.println("   3. Rumah : Ruangan ");
		System.out.println("   4. Roda : Kursi");
		System.out.println(" ");
		System.out.print(" Jawab : ");
		c = input.nextInt();
		System.out.println(" ");
		System.out.println("D. MENDOBRAK:MASUK ");
		System.out.println("   1. Merampok : Uang");
		System.out.println("   2. Telepon : Telegram ");
		System.out.println("   3. Mengaduk : Semen ");
		System.out.println("   4. Menyela : Bicara ");
		System.out.println(" ");
		System.out.print(" Jawab : ");
		d = input.nextInt();
		System.out.println(" ");
		System.out.println("Untuk soal nomor 5");
		System.out.println("pilihlah alternatif jawaban yang bermakna sama atau saling mendekati");
		System.out.println(" ");
		System.out.println("E. KREASI ");
		System.out.println("   1. Kemampuan berfikir");
		System.out.println("   2. Rencana ");
		System.out.println("   3. Kepandaian menari ");
		System.out.println("   4. Ciptaan");
		System.out.println(" ");
		System.out.print(" Jawab : ");
		e = input.nextInt();

		if ((a == 4) && (b == 2) && (c == 3) && (d == 4) && (e == 4)) {

			System.out.println(" ");
			System.out.println("SELAMAT ANDA LULUS....");
			System.out.println(" ");
			System.out.println("Berikut Rincian Biaya Yang Harus Anda Bayar :");
			System.out.println(" ");
			System.out.println("1. Biaya Ospek 				: Rp 250.000");
			System.out.println("2. Biaya Pembuatan Almamater 		: Rp 500.000");
			System.out.println("3. Biaya SPP Pertama 			: Rp 750.000");
			System.out.println("4. Biaya SPB pertama 			: Rp 350.000");
			System.out.println("--------------------------------------------------------");
			System.out.println("   Total 				: Rp 1.850.000");
			System.out.println(" ");
			System.out.println("Silahkan Melakukan Pembayaran Ke No.Rekening dibawah ini :");
			System.out.println("BCA : 0822405281");
			System.out.println(" ");
			System.out.print("********KONFIRMASI PEMBAYARAN********");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Silahkan Masukan No.Seri Pengiriman Anda");
			System.out.print("No seri pengiriman : ");
			seri = input.nextInt();
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Checking............... ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("No Resi : " +seri);
			System.out.println("Telah Melakukan Pembayaran Sebesar Rp 1.850.000 ");
			System.out.println(" ");
			System.out.println("Anda telah resmi menjadi mahasiswa sekolah tinggi teknologi bandung ");
			System.out.println("NPM anda : 15111186");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" Jadwal OSPEK Mahasiswa Baru 2018/2019");
			System.out.println(" ");
			System.out.println(" Kamis 25 Januari 2018 pukul 19.00 : Menggunakan baju hitam putih ");
			System.out.println(" Jumat 26 Januari 2018 pukul 19.00 : Menggunakan baju STTB");
			System.out.println(" Sabtu 27 Januari 2018 pukul 18.00 : Menggunakan baju olahraga");
			System.out.println(" ");
			System.out.println(" Note : ");
			System.out.println(" Untuk baju STTB bisa diambil dikampus hari Rabung 24 Januari 2018 pukul 14.00");
			System.out.println(" ");
		}

		else {
			System.out.println("ANDA TIDAK LULUS....");
			System.out.println("Silahkan Bisa Daftar Kembali Tahun Depan...");
		}
	}
}