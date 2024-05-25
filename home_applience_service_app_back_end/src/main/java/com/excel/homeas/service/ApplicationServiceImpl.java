package com.excel.homeas.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.excel.homeas.dto.ApplienceDto;
import com.excel.homeas.dto.CustomerRegistrationDto;
import com.excel.homeas.dto.ServiceRequestsDto;
import com.excel.homeas.dto.TechnicianRegistrationDto;
import com.excel.homeas.entity.Applience;
import com.excel.homeas.entity.Customer;
import com.excel.homeas.entity.ServiceRequests;
import com.excel.homeas.entity.Technician;
import com.excel.homeas.enums.forexception.ExceptionEnum;
import com.excel.homeas.exceptions.applience.ApplienceNotFound;
import com.excel.homeas.exceptions.customer.CustomerNotFound;
import com.excel.homeas.exceptions.technician.TechnicianNotFound;
import com.excel.homeas.repository.ApplienceRepository;
import com.excel.homeas.repository.CustomerRepository;
import com.excel.homeas.repository.ServiceRequestRepository;
import com.excel.homeas.repository.TechnicianRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ApplicationServiceImpl implements ApplicationService{
	
	private final CustomerRepository customerRepository;
	
	private final TechnicianRepository technicianRepository;
	
	private final ServiceRequestRepository serviceRequestRepository;
	
	private final ApplienceRepository applienceRepository;

	//----------------------------------------[ Customer ]----------------------------------------
	
	@Override
	public String saveCustomerDetials(CustomerRegistrationDto dto) {
		Customer customer = Customer.builder()
		.customerFirstName(dto.getCustomerFirstName())
		.customerLastName(dto.getCustomerLastName())
		.email(dto.getEmail())
		.password(dto.getPassword())
		.phoneNo(dto.getPhoneNo())
		.address(dto.getAddress())
		.build();
		
		if(customerRepository.save(customer).getCustomerId()!=null) {
			return "Inserted Successfully";
		} else {
			throw new CustomerNotFound(ExceptionEnum.SOMETHINGWENTWRONG.getExcepEnumString());
		}
	}
	
	@Override
	public CustomerRegistrationDto getAllCustomerDetails(CustomerRegistrationDto dto) {
		Optional<Customer> optional = customerRepository.findByEmail(dto.getEmail());
		
		if(optional.isPresent()) {
			Customer customer = optional.get();
			
			return CustomerRegistrationDto.builder()
			.customerId(customer.getCustomerId())
			.customerFirstName(customer.getCustomerFirstName())
			.customerLastName(customer.getCustomerLastName())
			.email(customer.getEmail())
			.password(customer.getPassword())
			.phoneNo(customer.getPhoneNo())
			.address(customer.getAddress())
			.build();
		} else {
			throw new CustomerNotFound(ExceptionEnum.SOMETHINGWENTWRONG.getExcepEnumString());
		}
		
	}
	
	@Override
	public String updateCustomerDetails(CustomerRegistrationDto dto) {
		Optional<Customer> optional = customerRepository.findByEmail(dto.getEmail());
		
		if(optional.isPresent()) {
			Customer customer = optional.get();
			
			Customer cust = Customer.builder()
			.customerFirstName(dto.getCustomerFirstName())
			.customerLastName(dto.getCustomerLastName())
			.email(dto.getEmail())
			.password(dto.getPassword())
			.phoneNo(dto.getPhoneNo())
			.address(dto.getAddress())
			.build();
			
			customer.setCustomerFirstName(cust.getCustomerFirstName());
			customer.setCustomerLastName(cust.getCustomerLastName());
			customer.setEmail(cust.getEmail());
			customer.setPassword(cust.getPassword());
			customer.setPhoneNo(cust.getPhoneNo());
			customer.setAddress(cust.getAddress());
			
			return customerRepository.save(customer).getEmail();
		}
		
		throw new CustomerNotFound(ExceptionEnum.SOMETHINGWENTWRONG.getExcepEnumString());
	}
	
	@Override
	public String deleteCustomerDetails(CustomerRegistrationDto dto) {
		Optional<Customer> optional = customerRepository.findByEmail(dto.getEmail());
		
		if(optional.isPresent()) {
			Customer customer = optional.get();
			customerRepository.delete(customer);
			return "Successfully Deleted";
		}
		throw new CustomerNotFound(ExceptionEnum.CUSTOMERNOTFOUND.getExcepEnumString());
	}
	
	//----------------------------------------[ Technician ]----------------------------------------

	@Override
	public Integer saveTechnicianDetials(TechnicianRegistrationDto dto) {
		Technician technician = Technician.builder()
		.technicianFirstName(dto.getTechnicianFirstName())
		.technicianLastName(dto.getTechnicianLastName())
		.email(dto.getEmail())
		.password(dto.getPassword())
		.phoneNo(dto.getPhoneNo())
		.address(dto.getAddress())
		.build();
		
		if(technicianRepository.save(technician).getTechnicianId() != null) {
			return technician.getTechnicianId();
		} else {
			throw new TechnicianNotFound(ExceptionEnum.TECHNICIANNOTFOUND.getExcepEnumString());
		}
	}
	
	@Override
	public TechnicianRegistrationDto getTechnicianDetails (TechnicianRegistrationDto dto) {
		Optional<Technician> optional = technicianRepository.findByEmail(dto.getEmail());
		
		if(optional.isPresent()) {
			Technician technician = optional.get();
			
			return TechnicianRegistrationDto.builder()
			.technicianId(technician.getTechnicianId())
			.technicianFirstName(technician.getTechnicianFirstName())
			.technicianLastName(technician.getTechnicianLastName())
			.email(technician.getEmail())
			.phoneNo(technician.getPhoneNo())
			.address(technician.getAddress())
			.status(technician.getStatus())
			.build();
			
		} else {
			throw new TechnicianNotFound(ExceptionEnum.TECHNICIANNOTFOUND.getExcepEnumString());
		}
		
	}
	
	@Override
	public String updateTechnicianDetails(TechnicianRegistrationDto dto) {
		Optional<Technician> optional = technicianRepository.findByEmail(dto.getEmail());
		
		if(optional.isPresent()) {
			Technician technician = optional.get();
			
			Technician techObj = Technician.builder()
			.technicianFirstName(dto.getTechnicianFirstName())
			.technicianLastName(dto.getTechnicianLastName())
			.email(dto.getEmail())
			.password(dto.getPassword())
			.phoneNo(dto.getPhoneNo())
			.address(dto.getAddress())
			.status(dto.getStatus())
			.build();
			
			technician.setTechnicianFirstName(techObj.getTechnicianFirstName());
			technician.setTechnicianLastName(techObj.getTechnicianLastName());
			technician.setEmail(techObj.getEmail());
			technician.setPassword(techObj.getPassword());
			technician.setPhoneNo(techObj.getPhoneNo());
			technician.setAddress(techObj.getAddress());
			technician.setStatus(techObj.getStatus());
			
			return technicianRepository.save(technician).getEmail();
		}else {
			throw new TechnicianNotFound(ExceptionEnum.TECHNICIANNOTFOUND.getExcepEnumString());
		}
	}
	
	@Override
	public String deleteTechnicianDetails(TechnicianRegistrationDto dto) {
		Optional<Technician> optional = technicianRepository.findByEmail(dto.getEmail());
		
		if(optional.isPresent()) {
			Technician technician = optional.get();
			
			technicianRepository.delete(technician);
			
			return "Successfully Deleted";
		}
		throw new CustomerNotFound(ExceptionEnum.TECHNICIANNOTFOUND.getExcepEnumString());
	}
	
	//----------------------------------------[ Appliance ]----------------------------------------

	@Override
	public Integer saveApplienceDetails(ApplienceDto dto) {
		Optional<Customer> optional = customerRepository.findByEmail(dto.getEmail());
		
		if(optional.isPresent()) {
			Customer customer = optional.get();
			
			Applience applience = Applience.builder()
					.applienceBrand(dto.getApplienceBrand())
					.yearOfManufacturing(dto.getYearOfManufacturing())
					.productType(dto.getProductType())
					.serialNo(dto.getSerialNo())
					.warrentyStatus(dto.getWarrentyStatus())
					.build();
			
			customer.setApplience(applience);
			applience.setCustomer(customer);
			
			return customerRepository.save(customer).getApplience().getApplienceId();
		}else {
			throw new ApplienceNotFound(ExceptionEnum.APPLIENCEDETAILSNOTFOUND);
		}
	}
	
	@Override
	public List<Applience> getAllAppliences() {
		
		List<Applience> list = applienceRepository.findAll();
		
        if(list != null) {
        	return list;
        } else {
        	throw new ApplienceNotFound(ExceptionEnum.APPLIENCEDETAILSNOTFOUND);
        }
    }
	
	@Override
	public Integer updateApplienceDetails(ApplienceDto dto) {
		Optional<Applience> optional = applienceRepository.findByCustomerEmail(dto.getEmail());
		
		if(optional.isPresent()) {
			Applience applience = optional.get();
			
			Applience applienceObj = Applience.builder()
			.applienceBrand(dto.getApplienceBrand())
			.yearOfManufacturing(dto.getYearOfManufacturing())
			.productType(dto.getProductType())
			.serialNo(dto.getSerialNo())
			.warrentyStatus(dto.getWarrentyStatus())
			.build();
			
			applience.setApplienceBrand(applienceObj.getApplienceBrand());
			applience.setYearOfManufacturing(applience.getYearOfManufacturing());
			applience.setProductType(dto.getProductType());
			applience.setSerialNo(applienceObj.getSerialNo());
			applience.setWarrentyStatus(applience.getWarrentyStatus());
			
			return applienceRepository.save(applience).getApplienceId();
		}
		return null;
	}
	
	@Override
	public String deleteApplienceDetails(ApplienceDto dto) {
		Optional<Applience> optional = applienceRepository.findByCustomerEmail(dto.getEmail());
		
		if(optional.isPresent()) {
			applienceRepository.delete(optional.get());
			
			return "Deleted successfully";
		} else {
			return "Failed to delete";
		}
	}
	
	//----------------------------------------[ Service ]----------------------------------------

	@Override
	public String saveServiceRequest(ServiceRequestsDto dto) {
		Optional<Customer> optional = customerRepository.findByEmail(dto.getEmail());
		
		if(optional.isPresent()) {
			
			Customer customer = optional.get();
			
			if(customer.getServiceRequests() == null) {
				ServiceRequests serviceRequests = ServiceRequests.builder()
				.createdOn(dto.getCreatedOn())
				.updatedOn(dto.getUpdatedOn())
				.appointmentDate(dto.getAppointmentDate())
				.serviceStatus(dto.getServiceStatus())
				.comment(dto.getComment())
				.build();
				
				customer.setServiceRequests(serviceRequests);
				customer.setEmail(dto.getEmail());
				serviceRequests.setCustomer(customer);
				return customerRepository.save(customer).getEmail();
			} else {
				return null;
			}
		}
		return null;
	}

	@Override
	public List<ServiceRequestsDto> getAllServiceRequests() {
		return serviceRequestRepository.findAll().stream().map(e -> ServiceRequestsDto.builder()
				.serviceId(e.getServiceId())
				.createdOn(e.getCreatedOn())
				.updatedOn(e.getUpdatedOn())
				.appointmentDate(e.getAppointmentDate())
				.serviceStatus(e.getServiceStatus())
				.comment(e.getComment())
				.build()).collect(Collectors.toList());
	}
	
	@Override
	public Integer updateServiceReuestDetails(ServiceRequestsDto dto) {
		Optional<Applience> optional = applienceRepository.findByCustomerEmail(dto.getEmail());
		
		if(optional.isPresent()) {
			Applience applience = optional.get();
			ServiceRequests serviceRequests = ServiceRequests.builder()
			.createdOn(dto.getCreatedOn())
			.updatedOn(dto.getUpdatedOn())
			.appointmentDate(dto.getAppointmentDate())
			.serviceStatus(dto.getServiceStatus())
			.comment(dto.getComment())
			.build();
			
			applience.setServiceRequests(serviceRequests);
			serviceRequests.setApplience(applience);
			return applienceRepository.save(applience).getApplienceId();
		}
		return null;
	}

}
