package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.PlatformExecutive;
import com.main.repository.PlatformExecutiveRepository;

@Service
public class PlatformExecutiveService {
	@Autowired
	private PlatformExecutiveRepository platformExecutiveRepository;

	public void postPlatformExecutive(PlatformExecutive platformExecutive) {
		platformExecutiveRepository.save(platformExecutive);
	}
}
