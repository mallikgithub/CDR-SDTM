package com.cdr.sdtm.service;

import java.util.List;
import java.util.Optional;import org.springframework.beans.factory.annotation.Autowired;

import com.cdr.sdtm.model.PathToSdtmMatrix;
import com.cdr.sdtm.model.Transformation;

public interface SdtmMatrixService {

	PathToSdtmMatrix saveMatrix(PathToSdtmMatrix pathToSdtmMatrix);
	
	public List<PathToSdtmMatrix> saveMatrixForDomain(List<PathToSdtmMatrix> matrices);
	
	List<PathToSdtmMatrix> findByStudyAndDomain(String study, String domain);

	boolean updateMatrix(PathToSdtmMatrix pathToSdtmMatrix, Long id);
	
	public Optional<PathToSdtmMatrix> findById(Long id);

	boolean deleteById(Long matrixId);
	
	List<Transformation> getTransTypes();
	
	List<String> findDistinctStudies();
	
	List<String> findDomainByStudy(String study);

}
