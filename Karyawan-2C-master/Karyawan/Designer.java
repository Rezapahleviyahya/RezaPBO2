public class Designer extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=70){
			System.out.println("Gaji desaigner Sebesar = "+gaji);
		}else{
			System.out.println("Gaji anda melebihi batas");
		}
	}
}