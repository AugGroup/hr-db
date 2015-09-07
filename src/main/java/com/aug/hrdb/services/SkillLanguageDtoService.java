package com.aug.hrdb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aug.hrdb.dto.SkillLanguageDto;
import com.aug.hrdb.repositories.SkillLanguageRepository;


@Service(value="skillLanguageDtoService")
@Transactional
public class SkillLanguageDtoService {

	@Autowired
	private SkillLanguageRepository skillLanguageRepository;
	
	
	public List<SkillLanguageDto> listSkillLanguage(Integer id){
		return  skillLanguageRepository.listSkillLanguageByEmployee(id);
	}
	
}