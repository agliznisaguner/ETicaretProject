package com.turktrust.eticaret.entities.dtos;

import java.util.List;

public class GetUrunFromSepetDto {

	private int sepetId;
	private List<UrunDetailsDto> urunler;

	public int getSepetId() {
		return sepetId;
	}

	public void setSepetId(int sepetId) {
		this.sepetId = sepetId;
	}

	public List<UrunDetailsDto> getUrunler() {
		return urunler;
	}

	public void setUrunler(List<UrunDetailsDto> urunler) {
		this.urunler = urunler;
	}

	public GetUrunFromSepetDto(int sepetId, List<UrunDetailsDto> urunler) {
		super();
		this.sepetId = sepetId;
		this.urunler = urunler;
	}

	public GetUrunFromSepetDto() {
	}

}
