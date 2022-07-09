package hu.webuni.airport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webuni.airport.config.AirtportConfigProperties;

@Service
public class DeaultDiscountService implements DiscountService {
@Autowired
	AirtportConfigProperties config;
	
	
	@Override
	public int getDiscountPercent(int totalPrices) {
		return config.getDiscount().getDef().getPercent();
	}
	

}
	