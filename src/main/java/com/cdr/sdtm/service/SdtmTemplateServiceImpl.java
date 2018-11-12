package com.cdr.sdtm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdr.sdtm.model.PathToSdtmTemplate;
import com.cdr.sdtm.repository.SdtmTemplateRepository;

@Service
public class SdtmTemplateServiceImpl implements SdtmTemplateService {
	
	@Autowired
	SdtmTemplateRepository sdtmTemplateRepository;

	@Override
	public List<PathToSdtmTemplate> findByDomainAndStudy(String study, String domain) {
		
		return sdtmTemplateRepository.findByStudyAndDomain(study, domain);
	}

	@Override
	public List<String> findDomainByStudy(String study) {
		return sdtmTemplateRepository.findDomainByStudy(study);
	}

}
