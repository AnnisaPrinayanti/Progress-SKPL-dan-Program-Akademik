import java.util.Scanner;

class Keuangan {

	int seri;

	void notif1() {
		System.out.println(" ");
		System.out.println("Berikut Rincian Biaya Yang Harus Anda Bayar :");
		System.out.println(" ");
		System.out.println("1. Biaya Pendaftaran 	: Rp 250.000");
		System.out.println("2. Biaya Tes 		: Rp 500.000");
		System.out.println("---------------------------------------------");
		System.out.println("   Total 		: Rp 750.000");
		System.out.println(" ");
		System.out.println("Silahkan Melakukan Pembayaran Ke No.Rekening dibawah ini :");
		System.out.println("BCA : 0822405281");
		System.out.println(" ");
	}

	void cekRegister() {
		Scanner input = new Scanner (System.in);
		System.out.print("********KONFIRMASI PEMBAYARAN********");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Silahkan Masukan No.Seri Pengiriman Anda");
		System.out.print("No resi pengiriman : ");
		seri = input.nextInt();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Checking............... ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("No Resi : " +seri);
		System.out.println("Telah Melakukan Pembayaran Sebesar Rp 750.000 ");
		System.out.println(" ");
		System.out.println(" ");
	}
}