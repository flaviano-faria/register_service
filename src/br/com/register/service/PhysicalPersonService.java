package br.com.register.service;

import br.com.register.entity.PhisicalPerson;

public class PhysicalPersonService extends PhisicalPerson{
	
	public String getIdByAddressNumber(int addrNumber) {
		return getTaxId();
	}

}
