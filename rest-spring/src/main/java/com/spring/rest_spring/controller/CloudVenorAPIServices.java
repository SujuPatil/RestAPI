package com.spring.rest_spring.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVenorAPIServices

{
	
	CloudVendor cloudvendor;
	
	@GetMapping("{vendorID}")
	public CloudVendor getCloudVendorDetails(String vendorID) {
		return cloudvendor;
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		this.cloudvendor = cloudVendor;
		return "cloud vendor cretaed sucessfully";
	}
	
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		this.cloudvendor = cloudVendor;
		return "cloud vendor Updated sucessfully";
	}
	
	@DeleteMapping("{vendorID}")
	public String deleteCloudVendorDetails(String vendorID)
	{
		this.cloudvendor = null;
		return "cloud vendor Deleted sucessfully";
	}
}


