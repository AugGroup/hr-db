package com.aug.hrdb.repositories.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.aug.hrdb.dto.CertificationDto;
import com.aug.hrdb.entities.Certification;
import com.aug.hrdb.repositories.CertificationRepository;

@Repository(value = "certificationRepository")
public class CertificationRepositoryImpl extends GenericRepositoryImpl<Certification, Serializable> implements CertificationRepository {

	public CertificationRepositoryImpl(Class<Certification> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<CertificationDto> findCertificateById(Integer id) {
		Query query = getCurrentSession().getNamedQuery("SEARCH_CERTIFICATE");
		query.setParameter("ID", id);
		List<CertificationDto> result = query.list();
		System.out.println("QUERYADDRESS :: " + result);
		return result;
	}

	@Override
	public CertificationDto findCertificate(Integer id) {
		Query query = getCurrentSession().getNamedQuery("SEARCH_CERTIFICATE_ID");
		query.setParameter("ID", id);
		List<CertificationDto> result = query.list();
		CertificationDto app = result.get(0);
		return app;
	}
	
}