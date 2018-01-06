import java.util.Scanner;

class Perwalian {
	int npm;
	int semester;
	int cetak;

	void permohonan() {
		Scanner input = new Scanner (System.in);

		System.out.println(" ");
		System.out.println("======================================");
		System.out.println("             PERMOHONAN KRS           ");	
		System.out.println("======================================");
		System.out.println(" ");
		System.out.println("Silahkan Masukkan NPM ");
		System.out.println(" ");
		System.out.print("NPM 	[15111186 / 15111187]	: "); 
		npm = input.nextInt();
		System.out.println(" ");
		System.out.println("Checking.......");
		System.out.println(" ");
	
		if (npm == 15111186)  {
			System.out.println("Nama 		: Annisa Prinayanti");
			System.out.println("NPM 		: 15111186");
			System.out.println("Tunggakan 	: Rp 0");
			System.out.println(" ");
			System.out.print(" Masukkan Kode Semester [1/2] :  ");
			semester = input.nextInt();
				
			if (semester == 1) {
				System.out.println(" ");
				System.out.println("---------------------------------------------------------------");
				System.out.println(" SEKOLAH 	|  KRS SEMESTER GANJIL 2017/2018 ");	
				System.out.println(" TINGGI		|  Jurusan	: TEKNIK INFORMATIKA ");
				System.out.println(" TEKNOLOGI 	|  Kelas	: TIF 15 Karyawan ");
				System.out.println(" BANDUNG 	|  Bagian	: Mahasiswa");
				System.out.println("---------------------------------------------------------------");
				System.out.println(" 	RENCANA STUDI SEMESETERAN	   		|  1  |");
				System.out.println("---------------------------------------------------------------");
				System.out.println("No |         NAMA MATA KULIAH 			| DOSEN | SKS |");
				System.out.println("---------------------------------------------------------------");	
				System.out.println(" 1 | Pemrograman Web II 			|	|  3  |");
				System.out.println(" 2 | Intelegensi Buatan 			|	|  3  |");
				System.out.println(" 3 | Object Oriented Analysis and Design 	|	|  3  |");
				System.out.println(" 4 | Interaksi Manusia & Komputer		|	|  2  |");
				System.out.println(" 5 | Teknik Kompilasi			 	|	|  3  |");
				System.out.println(" 6 | Teori Graph				|	|  3  |");
				System.out.println(" 7 | Object Oriented Programming I 	 	|	|  3  |");
				System.out.println("---------------------------------------------------------------");
				System.out.println(" ");
				System.out.println("---------------------------------------------------------------");
				System.out.println(" 	PERSETUJUAN RENCANA STUDI			|  2  |");
				System.out.println("---------------------------------------------------------------");
				System.out.println("  Jumlah Mata Kuliah : 		|	Jumlah SKS :	      |");
				System.out.println("	         7 		|	 20 	     	      |  ");
				System.out.println("---------------------------------------------------------------");
				System.out.println(" 	Disetujui di Bandung, ..................... 2016      |");
				System.out.println("---------------------------------------------------------------");
				System.out.println(" 	WALI			|	Mahasiswa	      |");
				System.out.println(" Nama : Naseer,S.Kom.,MT.	| Nama : Annisa Prinayanti    | ");
				System.out.println(" Keterangan : 			| NPM : 15111186   	      |");
				System.out.println(" 				| Keterangan :		      |");
				System.out.println(" 				|			      |");
				System.out.println(" 				|   (Memohon Persetujuan)     |");
				System.out.println("---------------------------------------------------------------");
				System.out.println(" ");
				System.out.println("Menunggu Persetujuan...... ");
				System.out.println(" ");
				System.out.println("Permohonan KRS anda telah disetujui...... ");
				System.out.print("Apakah anda ingin mencetaknya [1. ya / 2. tidak] ? :  ");
				cetak = input.nextInt();
						
				if (cetak == 1) {
					System.out.println(" ");
					System.out.println("---------------------------------------------------------------");
					System.out.println(" SEKOLAH 	|  KRS SEMESTER GANJIL 2017/2018 ");	
					System.out.println(" TINGGI		|  Jurusan	: TEKNIK INFORMATIKA ");
					System.out.println(" TEKNOLOGI 	|  Kelas	: TIF 15 Karyawan ");
					System.out.println(" BANDUNG 	|  Bagian	: Mahasiswa");
					System.out.println("---------------------------------------------------------------");
					System.out.println(" 	RENCANA STUDI SEMESETERAN	   		|  1  |");
					System.out.println("---------------------------------------------------------------");
					System.out.println("No |         NAMA MATA KULIAH 			| DOSEN | SKS |");
					System.out.println("---------------------------------------------------------------");	
					System.out.println(" 1 | Pemrograman Web II 			|	|  3  |");
					System.out.println(" 2 | Intelegensi Buatan 			|	|  3  |");
					System.out.println(" 3 | Object Oriented Analysis and Design 	|	|  3  |");
					System.out.println(" 4 | Interaksi Manusia & Komputer		|	|  2  |");
					System.out.println(" 5 | Teknik Kompilasi			 	|	|  3  |");
					System.out.println(" 6 | Teori Graph				|	|  3  |");
					System.out.println(" 7 | Object Oriented Programming I 	 	|	|  3  |");
					System.out.println("---------------------------------------------------------------");
					System.out.println(" ");
					System.out.println("---------------------------------------------------------------");
					System.out.println(" 	PERSETUJUAN RENCANA STUDI			|  2  |");
					System.out.println("---------------------------------------------------------------");
					System.out.println("  Jumlah Mata Kuliah : 		|	Jumlah SKS :	      |");
					System.out.println("	         7 		|	 20 	     	      |  ");
					System.out.println("---------------------------------------------------------------");
					System.out.println(" 	Disetujui di Bandung, ..................... 2016      |");
					System.out.println("---------------------------------------------------------------");
					System.out.println(" 	WALI			|	Mahasiswa	      |");
					System.out.println(" Nama : Naseer,S.Kom.,MT.	| Nama : Annisa Prinayanti    | ");
					System.out.println(" Keterangan : 			| NPM : 15111186   	      |");
					System.out.println(" 				| Keterangan :		      |");
					System.out.println(" 				|			      |");
					System.out.println(" 	(Menyetujui)		|   (Memohon Persetujuan)     |");
					System.out.println("---------------------------------------------------------------");
					System.out.println(" ");
				}

				else if (cetak == 2) {
					System.out.println(" ");
					System.out.println("Anda Tidak Mencetak KRS.... KRS hanya disimpan di dalam Database");
				}

				else {
					System.out.println(" ");
					System.out.println("Yang Anda Masukkan Salah !");
					this.permohonan();
				}
			}
		}	
		else if (npm == 15111187){
			System.out.println("Nama 		: Monica Aprilia ");
			System.out.println("NPM 		: 15111187");
			System.out.println("Tunggakan 	: Rp 750,000");
			System.out.println(" ");
			System.out.println("Silahkan Melakukan Pembayaran Terlebih Dahulu...... ");
		}
		else {
			System.out.println("NPM : " +npm );
			System.out.println("Tidak Terdaftar.... Pastikan NPM Dengan Benar !!!");
			this.permohonan();
		}
	}	
}