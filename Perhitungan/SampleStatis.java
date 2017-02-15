/**
 *
 * @author harrikr
 */
public class SampleStatis{
	public static void main(String[] args) {
		//tipe data integral
		byte a = 1;
		short b = 12;
		int c = 300;
		int d, e;
		d=  a +b;
		e= a * c;
		//tipe data float
		double pi = 3.1416;
		double r = 2.12;
		double luas;
		luas= pi*r*r;
		//tipe data char
		char f = 'a';
		System.out.println("---------------------Penggunaan Tipe Data Integral");
		System.out.println("Hasil penjumlahan = " + d);
		System.out.println("Hasil perkalian = " + e);
		System.out.println("---------------------Penggunaan Tipe Data float");
		System.out.println("Hasil perhitungan luas = " + luas);
		System.out.println("---------------------Penggunaan Tipe Data char");
		System.out.println("menampilkan tipe data char misalnya " + f);
		f++; //meneruskan ke b
		System.out.println("menampilkan tipe data char misalnya " + f);
		f--; //mengembalikan ke a
		System.out.println("menampilkan tipe data char misalnya " + f);


	}
}