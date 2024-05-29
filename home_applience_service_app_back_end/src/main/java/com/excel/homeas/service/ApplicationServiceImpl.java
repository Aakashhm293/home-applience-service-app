package com.excel.homeas.service;

import com.excel.homeas.constant.ApplicationConstants;
import com.excel.homeas.dto.*;
import com.excel.homeas.entity.Applience;
import com.excel.homeas.entity.Customer;
import com.excel.homeas.entity.ServiceRequests;
import com.excel.homeas.entity.Technician;
import com.excel.homeas.exceptions.applience.ApplienceException;
import com.excel.homeas.exceptions.customer.CustomerException;
import com.excel.homeas.exceptions.servicerequest.ServiceRequestException;
import com.excel.homeas.exceptions.technician.TechnicianException;
import com.excel.homeas.repository.ApplienceRepository;
import com.excel.homeas.repository.CustomerRepository;
import com.excel.homeas.repository.ServiceRequestRepository;
import com.excel.homeas.repository.TechnicianRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ApplicationServiceImpl implements ApplicationService {

	private final CustomerRepository customerRepository;

	private final TechnicianRepository technicianRepository;

	private final ServiceRequestRepository serviceRequestRepository;

	private final ApplienceRepository applienceRepository;

	// ------------------------[ Customer ]----------------------------

	@Override
	public Integer saveCustomerDetials(CustomerRegistrationDto dto) {
		Optional<Customer> optional = customerRepository.findByEmail(dto.getEmail());

		if(optional.isPresent()){
			throw new CustomerException(ApplicationConstants.CUSTOMER_DETAILS_ALREADY_EXISTS);
        } else {
			Customer customer = Customer.builder()
					.customerFirstName(dto.getCustomerFirstName())
					.customerLastName(dto.getCustomerLastName())
					.email(dto.getEmail())
					.password(dto.getPassword())
					.phoneNo(dto.getPhoneNo())
					.address(dto.getAddress())
					.build();

			customerRepository.save(customer);
			return 1;
		}
    }

	@Override
	public CustomerRegistrationDto getAllCustomerDetails(CustomerRegistrationDto dto) {
		Optional<Customer> optional = customerRepository.findByEmail(dto.getEmail());

		if (optional.isPresent()) {
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
			throw new CustomerException(ApplicationConstants.NO_CUSTOMER_FOUND);
		}

	}

	@Override
	public String updateCustomerDetails(CustomerRegistrationDto dto) {
		Optional<Customer> optional = customerRepository.findByEmail(dto.getEmail());

		if (optional.isPresent()) {
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

		throw new CustomerException(ApplicationConstants.CUSTOMER_NOT_REGISTERED);
	}

	@Override
	public String deleteCustomerDetails(CustomerRegistrationDto dto) {
		Optional<Customer> optional = customerRepository.findByEmail(dto.getEmail());

		if (optional.isPresent()) {
			Customer customer = optional.get();
			customerRepository.delete(customer);
			return "Successfully Deleted";
		}
		throw new CustomerException(ApplicationConstants.CUSTOMER_NOT_FOUND);
	}

	@Override
	public Integer checkCustomerLogin(CustomerLoginDto dto) {
		Optional<Customer> optional = customerRepository.findByEmail(dto.getEmail());
		if (optional.isPresent()) {
			Customer customer = optional.get();
			if (customer.getPassword().equals(dto.getPassword())) {
				return 1;
			} else {
				return 0;
			}
		} else {
			throw new CustomerException(ApplicationConstants.CUSTOMER_NOT_FOUND);
		}
	}

	// ---------------------------------[ Technician ]------------------------------

	@Override
	public String saveTechnicianDetails(TechnicianRegistrationDto dto) {
		Optional<Technician> optional = technicianRepository.findByEmail(dto.getEmail());

		if(optional.isPresent()){
			throw new TechnicianException(ApplicationConstants.TECHNICIAN_DETAILS_ALREADY_EXISTS);
		}
		Technician technician = Technician.builder()
				.technicianFirstName(dto.getTechnicianFirstName())
				.technicianLastName(dto.getTechnicianLastName())
				.email(dto.getEmail())
				.password(dto.getPassword())
				.phoneNo(dto.getPhoneNo())
				.address(dto.getAddress())
				.status(dto.getStatus())
				.build();

        return technicianRepository.save(technician).getEmail();
	}

	@Override
	public TechnicianRegistrationDto getTechnicianDetails(TechnicianRegistrationDto dto) {
		Optional<Technician> optional = technicianRepository.findByEmail(dto.getEmail());

		if (optional.isPresent()) {
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
			throw new TechnicianException(ApplicationConstants.NO_TECHNICIAN_FOUND);
		}

	}

	@Override
	public String updateTechnicianDetails(TechnicianRegistrationDto dto) {
		Optional<Technician> optional = technicianRepository.findByEmail(dto.getEmail());

		if (optional.isPresent()) {
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
		} else {
			throw new TechnicianException(ApplicationConstants.TECHNICIAN_NOT_REGISTERED);
		}
	}

	@Override
	public String deleteTechnicianDetails(TechnicianRegistrationDto dto) {
		Optional<Technician> optional = technicianRepository.findByEmail(dto.getEmail());

		if (optional.isPresent()) {
			Technician technician = optional.get();

			technicianRepository.delete(technician);

			return ApplicationConstants.DELETED_SUCCESSFULLY;
		} else {
			throw new TechnicianException(ApplicationConstants.TECHNICIAN_DETAILS_NOT_FOUND);
		}
	}

	@Override
	public Integer checkTechnicianLogin(TechnicianLoginDto dto) {
		Optional<Technician> optional = technicianRepository.findByEmail(dto.getEmail());

		if (optional.isPresent()) {
			Technician technician = optional.get();

			if (technician.getPassword().equals(dto.getPassword())) {
				return 1;
			} else {
				return 0;
			}
		}
		throw new TechnicianException(ApplicationConstants.TECHNICIAN_NOT_REGISTERED);
	}

	// -------------------[ Appliance ]------------------------

	@Override
	public Integer saveApplienceDetails(ApplienceDto dto) {
		Optional<Customer> optional = customerRepository.findByEmail(dto.getEmail());


		if (optional.isPresent()) {
			Customer customer = optional.get();

			if (customer.getApplience() == null) {
				Applience applience = Applience.builder()
						.applienceBrand(dto.getApplienceBrand())
						.yearOfManufacturing(dto.getYearOfManufacturing())
						.productType(dto.getProductType())
						.serialNo(dto.getSerialNo())
						.warrentyStatus(dto.getWarrentyStatus())
						.build();

				customer.setApplience(applience);
				applience.setCustomer(customer);
			} else {
				throw new ApplienceException(ApplicationConstants.APPLIANCE_ALREADY_EXISTS);
			}
		}
        throw new ApplienceException(ApplicationConstants.APPLIANCE_ALREADY_EXISTS);
    }

	@Override
	public List<ApplienceDto> getAllAppliences() {
		return applienceRepository.findAll().stream()
				.map(e -> ApplienceDto.builder()
						.email(e.getCustomer().getEmail())
						.applienceBrand(e.getApplienceBrand())
						.yearOfManufacturing(e.getYearOfManufacturing())
						.productType(e.getProductType())
						.serialNo(e.getSerialNo())
						.warrentyStatus(e.getWarrentyStatus())
						.build())
				.toList();
	}

	@Override
	public Integer updateApplienceDetails(ApplienceDto dto) {
		Optional<Applience> optional = applienceRepository.findByCustomerEmail(dto.getEmail());

		if (optional.isPresent()) {
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
		throw new ApplienceException(ApplicationConstants.APPLIANCE_NOT_FOUND);
	}

	@Override
	public String deleteApplienceDetails(ApplienceDto dto) {
		Optional<Applience> optional = applienceRepository.findByCustomerEmail(dto.getEmail());

		if (optional.isPresent()) {
			applienceRepository.delete(optional.get());

			return ApplicationConstants.DELETED_SUCCESSFULLY;
		} else {
			return ApplicationConstants.FAILED_TO_DELETE;
		}
	}

	// ------------------------[ Service ]-----------------------------

	@Override
	public String saveServiceRequest(ServiceRequestsDto dto) {
		Optional<Customer> optional = customerRepository.findByEmail(dto.getEmail());

		if (optional.isPresent()) {
			Customer customer = optional.get();
			if (customer.getServiceRequests() == null) {
				ServiceRequests serviceRequests = ServiceRequests.builder()
						.createdOn(dto.getCreatedOn())
						.updatedOn(dto.getUpdatedOn())
						.appointmentDate(dto.getAppointmentDate())
						.serviceStatus(dto.getServiceStatus())
						.comment(dto.getComment())
						.build();
				customer.setServiceRequests(serviceRequests);
				serviceRequests.setCustomer(customer);
				return customerRepository.save(customer).getEmail();
			} else {
				return ApplicationConstants.SERVICE_REQUEST_NOT_FOUND;
			}
		}
		return null;
	}

	@Override
	public List<ServiceRequestsDto> getAllServiceRequests() {
		return serviceRequestRepository.findAll().stream().map(e -> ServiceRequestsDto.builder()
				.email(e.getCustomer().getEmail())
				.createdOn(e.getCreatedOn())
				.updatedOn(e.getUpdatedOn())
				.appointmentDate(e.getAppointmentDate())
				.serviceStatus(e.getServiceStatus())
				.comment(e.getComment())
				.build()).collect(Collectors.toList());
	}

	@Override
	public Integer updateServiceRequestDetails(ServiceRequestsDto dto) {
		Optional<Applience> optional = applienceRepository.findByCustomerEmail(dto.getEmail());

		if (optional.isPresent()) {
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
		throw new ServiceRequestException(ApplicationConstants.SERVICE_REQUEST_NOT_FOUND);
	}
}
