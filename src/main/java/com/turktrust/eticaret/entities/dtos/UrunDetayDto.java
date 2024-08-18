package com.turktrust.eticaret.entities.dtos;

public class UrunDetayDto {
	    private int urunId;
	    private String urunAdi;
	    private int stokSayisi;
	    private int urunFiyati; 
	    private String kategoriAdi; 
	    private String markaAdi;
		public int getUrunId() {
			return urunId;
		}
		public void setUrunId(int urunId) {
			this.urunId = urunId;
		}
		public String getUrunAdi() {
			return urunAdi;
		}
		public void setUrunAdi(String urunAdi) {
			this.urunAdi = urunAdi;
		}
		public int getStokSayisi() {
			return stokSayisi;
		}
		public void setStokSayisi(int stokSayisi) {
			this.stokSayisi = stokSayisi;
		}
		public int getUrunFiyati() {
			return urunFiyati;
		}
		public void setUrunFiyati(int urunFiyati) {
			this.urunFiyati = urunFiyati;
		}
		public String getKategoriAdi() {
			return kategoriAdi;
		}
		public void setKategoriAdi(String kategoriAdi) {
			this.kategoriAdi = kategoriAdi;
		}
		public String getMarkaAdi() {
			return markaAdi;
		}
		public void setMarkaAdi(String markaAdi) {
			this.markaAdi = markaAdi;
		}
		public UrunDetayDto(int urunId, String urunAdi, int stokSayisi, int urunFiyati, String kategoriAdi,
				String markaAdi) {
			super();
			this.urunId = urunId;
			this.urunAdi = urunAdi;
			this.stokSayisi = stokSayisi;
			this.urunFiyati = urunFiyati;
			this.kategoriAdi = kategoriAdi;
			this.markaAdi = markaAdi;
		} 
		public UrunDetayDto() {}

}
