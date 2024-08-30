package br.com.register.adapter;

import br.com.register.service.LegalPersonService;

public class LegalPersonAdapter implements IPersonAdapter{

	
	private LegalPersonService legalPersonService;
	
	public LegalPersonAdapter(LegalPersonService legalPersonService) {
		this.legalPersonService = legalPersonService;
	}
	
	@Override
	public String getId(String payload) {
		
		return legalPersonService.getIdByAddressNumber(Integer.parseInt(payload));
	}

}
