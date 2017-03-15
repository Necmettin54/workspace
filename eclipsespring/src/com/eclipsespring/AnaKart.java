package com.eclipsespring;

public class AnaKart {
	public String marka, tip;
	EkranKarti kart;
	public AnaKart(String marka, String tip, EkranKarti kart) {
		this.marka = marka;
		this.tip = tip;
		this.kart = kart;
	}
	public void Yaz(){
		System.out.println("Anakart Tipi: " + tip + " Markası: " + marka);
		kart.yaz();
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public EkranKarti getKart() {
		return kart;
	}
	public void setKart(EkranKarti kart) {
		this.kart = kart;
	}

}
