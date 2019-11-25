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
import org.springframework.web.bind.annotation.RestController;

import com.farm.dao.CurrentBid;
import com.farm.dao.Status;
import com.farm.entities.BidderDetails;
import com.farm.entities.BiddingDetails;
import com.farm.entities.FarmerDetails;
import com.farm.entities.FarmerSellRequest;
import com.farm.service.BidderService;

@Controller
public class BidderController {
	@Autowired
	private BidderService bidderService;

	@RequestMapping("/addBidder.lti")
	public String add(@ModelAttribute("register") BidderDetails bidder) {
		int bidderId = bidderService.addBidder(bidder);
		Status status = new Status();
		status.setMessage("Bidder added!");
		status.setGeneratedId(bidderId);
		return "login";
	}

	@PostMapping("/displayAllBidderDetails.lti")
	public List<BidderDetails> displayAllBidders() {
		return bidderService.displayAllBidders();
	}

	@GetMapping("/bidPage.lti")
	public List<FarmerSellRequest> fetchCurrentBidDetails() {
		return bidderService.currentBidDetails();

	}

	@PostMapping("/updateCurrentBid.lti")
	public Status add(@RequestBody CurrentBid currentBid) {
		BiddingDetails bd = new BiddingDetails();
		bd.setBidAmount(currentBid.getCurrentBid());
		
		FarmerSellRequest fsr = new FarmerSellRequest();
		fsr.setSellRequestId(currentBid.getCropId());
		bd.setFarmerSellRequest(fsr);
		BidderDetails bdr = new BidderDetails();
		bdr.setBidderId(currentBid.getBidderId());
		bd.setBidderDetails(bdr);
		
		int biddingId = bidderService.updateCurrentBid(bd);
		Status status = new Status();
		status.setGeneratedId(biddingId);
		status.setMessage("Bidding Successfull!");
		return status;
	}

}