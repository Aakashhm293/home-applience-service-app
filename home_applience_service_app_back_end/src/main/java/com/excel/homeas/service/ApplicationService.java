package com.excel.homeas.service;

import com.excel.homeas.dto.*;

import java.util.List;

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

    public Integer saveApplianceDetails(ApplianceDto dto);

    List<ApplianceDto> getAllAppliances();

    public Integer updateApplianceDetails(ApplianceDto dto);

    public String deleteApplianceDetails(ApplianceDto dto);


    // -----[ Service ]-----

    public String saveServiceRequest(ServiceRequestsDto dto);

    public List<ServiceRequestsDto> getAllServiceRequests();

    public Integer updateServiceRequestDetails(ServiceRequestsDto dto);

}
