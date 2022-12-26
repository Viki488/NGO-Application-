package com.neo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.constants.AppConstants;
import com.neo.controller.AdminController;
import com.neo.dto.DonarDto;
import com.neo.dto.LoginDto;
import com.neo.exception.ResourceNotFoundException;
import com.neo.model.Donar;
import com.neo.repository.DonarRepository;
import com.neo.service.DonarService;

@Service
public class DonarServiceImpl  implements DonarService{
	
	Logger logger= LoggerFactory.getLogger(DonarServiceImpl.class);
	@Autowired
	private DonarRepository donarRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public DonarDto saveDonar(DonarDto donarDto) {
		logger.info("Initiating dao call for the Save Donar details ");
		Donar donar = this.modelMapper.map(donarDto, Donar.class);
		Donar saveDonar = this.donarRepository.save(donar);
		logger.info("Completed dao call for the Save Donar details ");
		return this.modelMapper.map(saveDonar, DonarDto.class);
	}

	@Override
	public DonarDto updateDonar(DonarDto donarDto, Long donarId) {
		logger.info("Initiating dao call for the find donarId details with ",donarId);
	 Donar donar = this.donarRepository.findById(donarId)
			 .orElseThrow(()->new ResourceNotFoundException(AppConstants.NOT_FOUND +donarId));
		donar.setDonarName(donarDto.getDonarName());
		donar.setDoanrContact(donarDto.getDoanrContact());
		donar.setDonarPan(donarDto.getDonarPan());
		donar.setDonarDOB(donarDto.getDonarDOB());
		donar.setDonarGender(donarDto.getDonarGender());
		donar.setDonarAmount(donarDto.getDonarAmount());
		Donar updateDonar = this.donarRepository.save(donar);
		logger.info("Completed dao call for the Update the donar details with  ",donarId);
	 return this.modelMapper.map(updateDonar, DonarDto.class);
	}

	@Override
	public List<DonarDto> getAllDonar() {
		logger.info("Initiating dao call for the get all the Details");
		List<Donar> list = this.donarRepository.findAll();
		List<DonarDto> Donarlist = list.stream().map((donar)-> this.modelMapper.map(donar, DonarDto.class)).collect(Collectors.toList());
		logger.info("Initiating dao call for the get all the Details");
		return Donarlist;
	}

	@Override
	public void deleteDonar(Long donarId) {
		logger.info("Completed dao call for the delete donar details with ",donarId);
	Donar donar = this.donarRepository.findById(donarId).orElseThrow(()-> new ResourceNotFoundException(AppConstants.NOT_FOUND +donarId));
	logger.info("Completed dao call for the delete donar details with ",donarId);
		this.donarRepository.delete(donar);
	}

	@Override
	public DonarDto getByDonarLogin(LoginDto loginDto) {
		logger.info("Initiating dao call for the login donar");
		Donar donar = this.donarRepository.findByLogin(loginDto);
		logger.info("Initiating dao call for the login donar");
		return this.modelMapper.map(donar, DonarDto.class);
	}

}
