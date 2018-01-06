import java.util.Scanner;

class Menu{
	
	void pilihMenu() {
		Scanner input = new Scanner (System.in);

		System.out.println(" ");
		System.out.println("==================================================");
		System.out.println(" SISTEM AKADEMIK SEKOLAH TINGGI TEKNOLOGI BANDUNG ");	
		System.out.println("==================================================");
		System.out.println(" ");
		System.out.println ("MENU UTAMA "); 
		System.out.println(" ");
		System.out.println("1. Pendaftaran Mahasiswa Baru");
		System.out.println("2. Permohonan Rencana Studi Mahasiswa");
		System.out.println("3. Keluar");
		System.out.println(" ");
		System.out.print("Silahkan Masukkan Menu Yang Anda Pilih [1/2/3] : ");
		int pilih = input.nextInt();

		switch (pilih) {
			case 1: {

				Formulir form = new Formulir();
				form.dataPribadi();
				form.dataOrtu();
				form.simpan();

				Keuangan uang = new Keuangan();
				uang.notif1();
				uang.cekRegister();

				PMB pmb = new PMB ();
				pmb.tes();

				break;
			}

			case 2: {
				Perwalian wali = new Perwalian();
				wali.permohonan();
			}
		}
	}
}