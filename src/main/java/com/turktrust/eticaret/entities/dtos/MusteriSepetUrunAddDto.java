package com.turktrust.eticaret.entities.dtos;

public class MusteriSepetUrunAddDto {

	private int musteriId;
	private int urunId;

	public int getMusteriId() {
		return musteriId;
	}

	public void setMusteriId(int musteriId) {
		this.musteriId = musteriId;
	}

	public int getUrunId() {
		return urunId;
	}

	public void setUrunId(int urunId) {
		this.urunId = urunId;
	}

	public MusteriSepetUrunAddDto(int musteriId, int urunId) {
		super();
		this.musteriId = musteriId;
		this.urunId = urunId;
	}

	public MusteriSepetUrunAddDto() {
	}

}
