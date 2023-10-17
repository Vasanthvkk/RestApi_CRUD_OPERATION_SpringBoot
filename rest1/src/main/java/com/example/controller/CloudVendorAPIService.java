package com.example.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
	
	CloudVendor cloudVendor;
	
	@GetMapping("{vendorId}")
	public CloudVendor getCludVendorDetails(String vendorId) 
	{
	return cloudVendor;
			//new CloudVendor( "C1","Vendor 1","Address One", "xxxxx");
	}
	@PostMapping
	public String createCloudVendorDetailes(@RequestBody CloudVendor cloudVendor)
	{
		this.cloudVendor=cloudVendor;
		return "cloud vendor created successfully";
	}
	
	@PutMapping
	public String updateCloudVendorDetailes(@RequestBody CloudVendor cloudVendor)
	{
		this.cloudVendor=cloudVendor;
		return "cloud vendor updated successfully";
	}
	 
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetailes(String vendorId)
	{
		this.cloudVendor=null;
		return "cloud vendor deletd successfully";
	}
}
