package br.com.register.adapter;

import br.com.register.service.PhysicalPersonService;

public class PhysicalPersonAdapter implements IPersonAdapter {

	private PhysicalPersonService p;
	
	public PhysicalPersonAdapter(PhysicalPersonService service) {
		this.p = service;
	}
	
	@Override
	public String getId(String payload) {
		
		int number = Integer.parseInt(payload);
		return p.getIdByAddressNumber(number);
	}

}
