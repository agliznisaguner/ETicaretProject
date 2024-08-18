package com.turktrust.eticaret.entities.dtos;

public class KisiMusteriKayitDto {

		private String ad;
	    private String soyad;
	    private String email;
	    private String password;
	    private int tckimlikNo;
	    
	    public KisiMusteriKayitDto(String ad, String soyad, String email, String password, int tckimlikNo) {
			super();
			this.ad = ad;
			this.soyad = soyad;
			this.email = email;
			this.password = password;
			this.tckimlikNo = tckimlikNo;
		}
	    public KisiMusteriKayitDto() {}

		public String getAd() {
			return ad;
		}

		public void setAd(String ad) {
			this.ad = ad;
		}

		public String getSoyad() {
			return soyad;
		}

		public void setSoyad(String soyad) {
			this.soyad = soyad;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getTckimlikNo() {
			return tckimlikNo;
		}

		public void setTckimlikNo(int tckimlikNo) {
			this.tckimlikNo = tckimlikNo;
		}
}

