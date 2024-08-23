package com.turktrust.eticaret.entities.dtos;

import java.util.List;

public class SepetUrunGetDto {

	private int sepetId;
	private List<UrunDetayDto> urunler;

	public int getSepetId() {
		return sepetId;
	}

	public void setSepetId(int sepetId) {
		this.sepetId = sepetId;
	}

	public List<UrunDetayDto> getUrunler() {
		return urunler;
	}

	public void setUrunler(List<UrunDetayDto> urunler) {
		this.urunler = urunler;
	}

	public SepetUrunGetDto(int sepetId, List<UrunDetayDto> urunler) {
		super();
		this.sepetId = sepetId;
		this.urunler = urunler;
	}

	public SepetUrunGetDto() {
	}

}
