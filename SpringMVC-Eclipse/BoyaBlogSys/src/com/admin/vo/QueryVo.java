package com.admin.vo;

import java.util.Date;

public class QueryVo {
	private Integer cid;	//评论编号
    private String content;	//评论内容
    private Date time;		//评论时间
    private Integer aid;	//文章编号
    private Integer uid;	//用户编号
    private String aname;	//文章主题

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}
    
    
}
