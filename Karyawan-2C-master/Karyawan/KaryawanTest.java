public class KaryawanTest{
	public static void main(String[] args){
		System.out.println("List gaji karyawan: ");
		System.out.println(" ");
		Designer designer1 = new Designer();
		designer1.setNama("Najwah");
		designer1.setAlamat("Indramayu");
		designer1.setGaji(70);

		System.out.println(" ");
		Pm pm1 = new Pm();
		pm1.setNama("Gayor");
		pm1.setAlamat("Kendal");
		pm1.setGaji(90);

		System.out.println(" ");
		Programmer programmer1 = new Programmer();
		programmer1.setNama("Najwah Gayor");
		programmer1.setAlamat("Semarang");
		programmer1.setGaji(80);

	}
}