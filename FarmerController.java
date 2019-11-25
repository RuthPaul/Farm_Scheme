package com.farm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.farm.dao.Status;
import com.farm.entities.FarmerDetails;
import com.farm.entities.FarmerSellRequest;
import com.farm.service.FarmerService;


@Controller
public class FarmerController {
	
	
	@Autowired
	private FarmerService farmerService;

	 
	
	@RequestMapping("/addFarmer.lti")
	public String addFarmer(@ModelAttribute("register") FarmerDetails farmer) {
		int farmerId = farmerService.addFarmer(farmer);
		Status status = new Status();
		
		status.setGeneratedId(farmerId);
		return "login";
	}
	
	  
    @RequestMapping("/farmer_sellrequest")
	public ModelAndView farmerSellRequest(){
        ModelAndView mv=new ModelAndView("farmer_sellrequest");
        return mv;
	}
    
    @RequestMapping("/farmer_soldhistory")
	public ModelAndView farmerSoldHistory(){
        ModelAndView mv=new ModelAndView("farmer_soldhistory");
        return mv;
	}
    
    @RequestMapping("/farmer_viewmarketplace")
	public ModelAndView farmerViewMarketplace(){
        ModelAndView mv=new ModelAndView("farmer_viewmarketplace");
        return mv;
	}

	@GetMapping("/dispRequest.lti")
	public List<FarmerSellRequest> dispRequest() {
		return farmerService.displayRequest();
	}

	
	@RequestMapping(path="/addFarmerSellRequest.lti")
	public String addFarmerSellRequest(@ModelAttribute("request") FarmerSellRequest fsr) {
		int sellRequestId = farmerService.addFarmerSellRequest(fsr);
		Status status = new Status();
		status.setGeneratedId(sellRequestId);
		return "farmerpage";
	}

	

	/*@PostMapping("/setFarmerIDToFSR.lti")
	public int setFarmerIDToFSR(@RequestBody int farmerId) {

		int req = getRequestId();

		farmerService.assignFarmerIdToFSR(req, farmerId);
		return req;
	}*/

	@GetMapping("/listAll.lti")
	public List<FarmerSellRequest> listAll(@RequestParam("id") int requestId) {

		return farmerService.listAll(requestId);
	}

	@GetMapping("/listHistory.lti")
	public List<FarmerSellRequest> listHistory(@RequestParam("fid") int fid) {
		System.out.println(fid);
		return farmerService.listHistory(fid);
	}

	@PostMapping("/displayAllFarmerDetails.lti")
	public List<FarmerDetails> displayAllFarmers() {
		return farmerService.displayAllFarmers();
	}


	@PostMapping("/fetchAllFarmerSellRequest.lti")
	public List<FarmerSellRequest> fetchAll() {
		List<FarmerSellRequest> list = farmerService.listAll1();
		for (FarmerSellRequest x : list)
			System.out.println(x.getCropType());
		return list;
	}
	
	/* For view Marketplace */
	@GetMapping("/approvedCropDetails.lti")
	public List<FarmerSellRequest> approvedCropDetails(@RequestParam("id") int farmerId) {
		return farmerService.approvedCropDetails(farmerId);

	}
	/* After farmer clicks stop bidding */
	@PostMapping("/stopBidding.lti")
	public Status stopBidding(@RequestBody int requestId) {
		farmerService.stopBidding(requestId);
		Status status = new Status();
		status.setMessage("Request added!");
		status.setGeneratedId(requestId);
		return status;
	}

	@GetMapping("viewRequestStatus.lti")
	public List<FarmerSellRequest> viewRequestStatus(@RequestParam("fid") int fid) {
		System.out.println(fid);
		return farmerService.viewRequestStatus(fid);
	}
	
}
