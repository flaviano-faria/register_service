package br.com.register.adapter;

import br.com.register.service.PhysicalPersonService;

public class PhysicalPersonAdapter implements IPersonAdapter {

	private PhysicalPersonService p;
	
	public PhysicalPersonAdapter(PhysicalPersonService service) {
		this.p = service;
	}
	
	@Override
	public String getId(String payload) {
		
		return p.getIdByAddressNumber(Integer.parseInt(payload));
	}

}
