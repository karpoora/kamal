package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Organization;
import com.example.demo.repository.OrganizationRepository;

@Service
public class OrganizationService {

	@Autowired 
	private OrganizationRepository organizationRepository;
	
	public Organization createOrganization(Organization organization) {
		return organizationRepository.save(organization);
	}
	
}
