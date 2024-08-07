package br.com.register.service;

import br.com.register.entity.LegalPerson;

public class LegalPersonService extends LegalPerson{
	
	public String getIdByAddressNumber(int addrNumber) {
		return getEin();
	}

}
