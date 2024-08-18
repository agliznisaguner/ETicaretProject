package com.turktrust.eticaret.entities.dtos;

import java.util.List;

public class SepetUrunGetDto {
	    private int sepetId;
	    private String musteriAdi;
	    private List<UrunDetayDto> urunler;
		
	    public int getSepetId() {
			return sepetId;
		}
		public void setSepetId(int sepetId) {
			this.sepetId = sepetId;
		}
		public String getMusteriAdi() {
			return musteriAdi;
		}
		public void setMusteriAdi(String musteriAdi) {
			this.musteriAdi = musteriAdi;
		}
		public List<UrunDetayDto> getUrunler() {
			return urunler;
		}
		public void setUrunler(List<UrunDetayDto> urunler) {
			this.urunler = urunler;
		}
		public SepetUrunGetDto(int sepetId, String musteriAdi, List<UrunDetayDto> urunler) {
			super();
			this.sepetId = sepetId;
			this.musteriAdi = musteriAdi;
			this.urunler = urunler;
		}
		public SepetUrunGetDto() {}
	    
	    

}
