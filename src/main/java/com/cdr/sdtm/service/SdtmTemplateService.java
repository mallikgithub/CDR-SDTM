package com.cdr.sdtm.service;

import java.util.List;

import com.cdr.sdtm.model.PathToSdtmTemplate;

public interface SdtmTemplateService {

	List<PathToSdtmTemplate> findByDomain(String domain);

}
