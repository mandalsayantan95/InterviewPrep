package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void getData(List<MailItems> list){
		int high = 0;
		int low =0;
		int goodQuality = 0;
		int avgQuality = 0;
		int BadQuality = 0;
		int namesAreChanged = 0;
		int nameAreNotChanged = 0;
		for(int i=0;i<list.size();i++) {
		MailItems obj = list.get(i);
		List<Page> lop = obj.getListOfPages();
			for(int j=0;j<lop.size();j++) {
				if(lop.get(j).getConf_band().equals("HIGH")) {
					high++;
					
				} else {
					low++;
					
				}
				if(lop.get(j).getImg_quality().equals("Good")) {
					goodQuality++;
				}
				else if(lop.get(j).getImg_quality().equals("Average")){
					avgQuality++;
				}
				else {
					BadQuality++;
				}
				if(lop.get(j).getModifiedDocumentType()!=null) {
					namesAreChanged++;
				}
				else {
					nameAreNotChanged++;
				}
			}
		}
		
		System.out.println("HighBandWiseTotalPage" + high);
		
		
		
	}

	public static void main(String[] args) {

		List<MailItems> list = new ArrayList<>();
		getData(list);
		
		
		
	}

}
