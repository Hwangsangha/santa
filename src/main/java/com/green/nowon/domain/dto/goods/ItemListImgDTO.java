package com.green.nowon.domain.dto.goods;

import com.green.nowon.domain.entity.ItemListImg;

import lombok.Getter;

@Getter
public class ItemListImgDTO {
	private long no;
	private String orgName;
	private String newName;
	private String url;
	private boolean defImg;
	
	//νΈμνλ
	private String imgUrl;
	
	public ItemListImgDTO(ItemListImg e) {
		this.no = e.getNo();
		this.orgName = e.getNewName();
		this.newName = e.getNewName();
		this.url = e.getUrl();
		this.defImg = e.isDefImg();
		
		this.imgUrl=url+newName;
	}
	
	
}
