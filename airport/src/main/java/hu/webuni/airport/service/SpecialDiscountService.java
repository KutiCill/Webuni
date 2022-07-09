package hu.webuni.airport.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webuni.airport.config.AirtportConfigProperties;

@Service
public class SpecialDiscountService implements DiscountService{

//	@Value("${airport.discount.default.percent}")
//	private int defaultPercent;
//	@Value("${airport.discount.special.precent}")
//	private int specialPercent;
//	@Value("${airport.discount.special.limit}")
//	private int limit;
//	
	@Autowired
	AirtportConfigProperties config;
	
	@Override
	public int getDiscountPercent(int totalPrices) {
		// TODO Auto-generated method stub
//		return totalPrices > limit ? specialPercent : defaultPercent;
		return totalPrices > config.getDiscount().getSpecial().getLimit() ? 
				config.getDiscount().getSpecial().getPrecent() : 
					config.getDiscount().getDef().getPercent();
		
	}
	
	

}
