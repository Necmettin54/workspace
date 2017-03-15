package com.eclipsespring;

public class EkranKarti implements Bilesen{
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getBellek() {
		return bellek;
	}
	public void setBellek(String bellek) {
		this.bellek = bellek;
	}
	public int getBit() {
		return bit;
	}
	public void setBit(int bit) {
		this.bit = bit;
	}
	public String marka, bellek;
	public int bit;
	@Override
	public void yaz() {
		// TODO Auto-generated method stub
		System.out.println("Ekran kartı markası: " + marka + " Veri Yolu: " + bit + "bit Bellek Tipi:" + bellek);
		
	}

}
