import java.util.Scanner;

class Formulir {
	public String nikMhs;
	public String namaMhs;
	public String ttlMhs;
	public String alamatMhs;
	public String tlpMhs;
	public String jurusan;
	public String namaAyah;
	public String ttlAyah;
	public String alamatAyah;
	public String tlpAyah;
	public String namaIbu;
	public String ttlIbu;
	public String alamatIbu;
	public String tlpIbu;

	void dataPribadi() {

		Scanner input = new Scanner (System.in);
		System.out.println(" ");
		System.out.println("======================================");
		System.out.println(" FORMULIR PENDAFTARAN MAHASISWA BARU  ");	
		System.out.println("   SEKOLAH TINGGI TEKNOLOGI BANDUNG   ");
		System.out.println("======================================");
		System.out.println(" ");
		System.out.println("A. Data Pribadi");
		System.out.println(" ");
		System.out.print("NIK 			: ");
		nikMhs = input.nextLine();
		System.out.print("Nama Lengkap 		: ");
		namaMhs = input.nextLine();
		System.out.print("Tempat Tanggal Lahir 	: ");
		ttlMhs = input.nextLine();
		System.out.print("Alamat 			: ");
		alamatMhs = input.nextLine();
		System.out.print("No Tlp 			: ");
		tlpMhs = input.nextLine();
		System.out.print("Jurusan Yang Diambil 	: ");
		jurusan = input.nextLine();
		System.out.println(" ");
	}

	void dataOrtu() {

		Scanner input = new Scanner (System.in);
		System.out.println("B. Data Ayah Kandung");
		System.out.println(" ");
		System.out.print("Nama Lengkap 		: "); 
		namaAyah = input.nextLine();
		System.out.print("Tempat Tanggal Lahir 	: ");
		ttlAyah = input.nextLine();
		System.out.print("Alamat 			: ");
		alamatAyah = input.nextLine();
		System.out.print("No Tlp 			: ");
		tlpAyah = input.nextLine();
		System.out.println(" ");
		System.out.println("C. Data Ibu Kandung");
		System.out.println(" ");
		System.out.print("Nama Lengkap 		: ");
		namaIbu = input.nextLine();
		System.out.print("Tempat Tanggal Lahir 	: ");
		ttlIbu = input.nextLine();
		System.out.print("Alamat 			: ");
		alamatIbu = input.nextLine();
		System.out.print ("No Tlp 			: ");
		tlpIbu = input.nextLine();
	}

	void simpan() {
		System.out.println(" ");
		System.out.println("Data Berhasil Disimpan !!");
		System.out.println(" ");
		System.out.println("No Registrasi anda : 1010" + nikMhs );
	}
}
