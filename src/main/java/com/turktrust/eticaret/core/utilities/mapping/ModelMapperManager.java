package com.turktrust.eticaret.core.utilities.mapping;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelMapperManager implements ModelMapperService {

	private final ModelMapper modelMapper;

	@Autowired
	public ModelMapperManager(ModelMapper modelMapper) {
		super();
		this.modelMapper = modelMapper;
	}

	public ModelMapper forDto() {
		this.modelMapper.getConfiguration().setAmbiguityIgnored(true).setMatchingStrategy(MatchingStrategies.LOOSE);
		return modelMapper;
	}

}
