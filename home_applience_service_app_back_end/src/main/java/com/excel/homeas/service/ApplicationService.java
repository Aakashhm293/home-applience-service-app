package com.excel.homeas.service;

import java.util.List;

import com.excel.homeas.dto.ApplienceDto;
import com.excel.homeas.dto.CustomerLoginDto;
import com.excel.homeas.dto.CustomerRegistrationDto;
import com.excel.homeas.dto.ServiceRequestsDto;
import com.excel.homeas.dto.TechnicianLoginDto;
import com.excel.homeas.dto.TechnicianRegistrationDto;
import com.excel.homeas.entity.Applience;

public interface ApplicationService {

	// -----[ Customer ]-----

	public Integer saveCustomerDetials(CustomerRegistrationDto dto);

	public CustomerRegistrationDto getAllCustomerDetails(CustomerRegistrationDto dto);

	public String updateCustomerDetails(CustomerRegistrationDto dto);

	public String deleteCustomerDetails(CustomerRegistrationDto dto);

	public Integer checkCustomerLogin(CustomerLoginDto dto);











	// ------[ Technician ]-----

	public String saveTechnicianDetails(TechnicianRegistrationDto dto);

	public TechnicianRegistrationDto getTechnicianDetails(TechnicianRegistrationDto dto);

	public String updateTechnicianDetails(TechnicianRegistrationDto dto);

	public String deleteTechnicianDetails(TechnicianRegistrationDto dto);

	public Integer checkTechnicianLogin(TechnicianLoginDto dto);












	// -----[ Appliance ]-----

	public Integer saveApplienceDetails(ApplienceDto dto);

	List<ApplienceDto> getAllAppliences();

	public Integer updateApplienceDetails(ApplienceDto dto);

	public String deleteApplienceDetails(ApplienceDto dto);












	// -----[ Service ]-----

	public String saveServiceRequest(ServiceRequestsDto dto);

	public List<ServiceRequestsDto> getAllServiceRequests();

	public Integer updateServiceReuestDetails(ServiceRequestsDto dto);

}
