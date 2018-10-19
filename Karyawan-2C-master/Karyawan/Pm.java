public class Pm extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=100){
			System.out.println("Gaji Project Manager Sebesar = "+gaji);
		}else{
			System.out.println("Gaji anda melebihi batas");
		}
	}
}