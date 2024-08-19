package com.turktrust.eticaret.entities.dtos;

public class MusteriSepetUrunAddDto {
	private int musteriId;
	private int sepetId;	//
	private int urunId;
	public int getMusteriId() {
		return musteriId;
	}
	public void setMusteriId(int musteriId) {
		this.musteriId = musteriId;
	}
	public int getSepetId() {
		return sepetId;
	}
	public void setSepetId(int sepetId) {
		this.sepetId = sepetId;
	}
	public int getUrunId() {
		return urunId;
	}
	public void setUrunId(int urunId) {
		this.urunId = urunId;
	}
	public MusteriSepetUrunAddDto(int musteriId, int sepetId, int urunId) {
		super();
		this.musteriId = musteriId;
		this.sepetId = sepetId;
		this.urunId = urunId;
	}
	public MusteriSepetUrunAddDto() {}
	
	

}
