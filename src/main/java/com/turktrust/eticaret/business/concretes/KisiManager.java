package com.turktrust.eticaret.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.KisiService;
import com.turktrust.eticaret.core.utilities.mapping.ModelMapperService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.KisiDao;
import com.turktrust.eticaret.entities.concretes.Kisiler;
import com.turktrust.eticaret.entities.dtos.KisiGetDto;
import com.turktrust.eticaret.entities.dtos.KisiMusteriKayitDto;
import com.turktrust.eticaret.entities.dtos.KisiMusteriUpdateDto;

@Service
public class KisiManager implements KisiService{

	private KisiDao kisiDao;
    private ModelMapperService modelMapperService;

    @Autowired
    public KisiManager(KisiDao kisiDao, ModelMapperService modelMapperService) {
        this.kisiDao = kisiDao;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public DataResult<List<Kisiler>> getAll() {
        return new SuccessDataResult<List<Kisiler>>(this.kisiDao.findAll(), "Data listelendi.");
    }

    @Override
    public Result add(Kisiler kisi) {
        this.kisiDao.save(kisi);
        return new SuccessResult("Kişi eklendi.");
    }
    @Override
    public Result addFromDto(KisiMusteriKayitDto dto) {
        Kisiler kisi = modelMapperService.forDto().map(dto, Kisiler.class);
        return add(kisi);
    }
    @Override
    public Result updateFromDto(int id, KisiMusteriUpdateDto dto) {
        Kisiler existingKisi = kisiDao.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Kişi bulunamadı."));
        
        modelMapperService.forDto().map(dto, existingKisi);
        kisiDao.save(existingKisi);
        return new SuccessResult("Kişi güncellendi.");
    }
    @Override
    public DataResult<List<KisiGetDto>> getAllKisiler() {
        List<Kisiler> kisilerList = kisiDao.findAll();
        List<KisiGetDto> dtoList = kisilerList.stream()
                .map(kisi -> modelMapperService.forDto().map(kisi, KisiGetDto.class))
                .collect(Collectors.toList());
        return new SuccessDataResult<>(dtoList, "Tüm kişiler getirildi.");
    }

}
