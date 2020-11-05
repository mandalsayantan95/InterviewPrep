package com.demo;

public class Page {

	String docType;
	String modifiedDocumentType;
	String conf_band;
	String img_quality;
	
	public Page(String docType, String modifiedDocumentType, String conf_band, String img_quality) {
		super();
		this.docType = docType;
		this.modifiedDocumentType = modifiedDocumentType;
		this.conf_band = conf_band;
		this.img_quality = img_quality;
	}
	
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getModifiedDocumentType() {
		return modifiedDocumentType;
	}
	public void setModifiedDocumentType(String modifiedDocumentType) {
		this.modifiedDocumentType = modifiedDocumentType;
	}
	public String getConf_band() {
		return conf_band;
	}
	public void setConf_band(String conf_band) {
		this.conf_band = conf_band;
	}
	public String getImg_quality() {
		return img_quality;
	}
	public void setImg_quality(String img_quality) {
		this.img_quality = img_quality;
	}
	
}
