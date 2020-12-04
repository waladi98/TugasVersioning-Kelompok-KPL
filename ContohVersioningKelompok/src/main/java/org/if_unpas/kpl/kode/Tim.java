package org.if_unpas.kpl.kode;

import java.util.ArrayList;
import java.util.List;

public class Tim {

	private String nama;
	private List<Pemain> pemainInti = new ArrayList<Pemain>();
	
public Tim() {
	nama = "";
	
}

public Tim(String nama) {
	this.nama = nama;
}

public String getNama() {
	return nama;
}

public void setNama(String nama) {
	this.nama = nama;
}

public List<Pemain> getPemainInti() {
	return pemainInti;
}

public void setPemainInti(List<Pemain> pemainInti) {
	this.pemainInti = pemainInti;
}

//prosedur tampil pemain inti

public void tampilPemainInti() {
	for(int i =0; i < pemainInti.size(); i++) {
		Pemain p = pemainInti.get(i);
		System.out.println(p.getNoPunggung()+" # "+p.getNama());
	}
}
}
