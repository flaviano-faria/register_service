package br.com.register.app;

import br.com.register.adapter.LegalPersonAdapter;
import br.com.register.adapter.PhysicalPersonAdapter;
import br.com.register.service.LegalPersonService;
import br.com.register.service.PhysicalPersonService;

public class PersonExec {

	public static void main(String[] args) {
		String x = "1234";
		
		PhysicalPersonService ppS = new PhysicalPersonService();
		PhysicalPersonAdapter ppA = new PhysicalPersonAdapter(ppS);
		System.out.println(ppA.getId(x));
		
		LegalPersonService lps = new LegalPersonService();
		LegalPersonAdapter lpa = new LegalPersonAdapter(lps);
		System.out.println(lpa.getId(x));
	}
}
