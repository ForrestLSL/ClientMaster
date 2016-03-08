package com.clientmaster.test;

import java.io.Serializable;

public class RadiumListBean implements Serializable {
	/**
	 * 距离场馆的距离
	 */
	private String distance;
	/**
	 * 每条数据的ID
	 */
	private String id;
	/**
	 * 场馆名称
	 */
	private String name;
	/**
	 * 场馆X坐标
	 */
	private String xzb;
	/**
	 * 场馆Y坐标
	 */
	private String yzb;
	/**
	 * 场馆级别
	 */
	private String level;
	/**
	 * 固定电话
	 */
	private String phone;
	/**
	 * 移动电话
	 */
	private String mobile;
	/**
	 * 乘车方式
	 */
	private String waycar;
	/**
	 * 运动项目
	 */
	private String sportsitem;
	/**
	 * 每天工作时间
	 */
	private String worktime;
	/**
	 * 每周营业时间
	 */
	private String yytime;
	/**
	 * 客户评价星级
	 */
	private String khpjlevel;
	/**
	 * 客户评价总分
	 */
	private String pingjiatotal;
	/**
	 * 客户评价数量
	 */
	private String pingjianumber;
	/**
	 * 收藏次数
	 */
	private String scnumber;
	/**
	 * 是否议价
	 */
	private String isyijia;
	/**
	 * 议价联系人
	 */
	private String yjuser;
	/**
	 * 议价联系人联系方式
	 */
	private String yjuserphone;
	/**
	 * 是否是热门
	 */
	private String hotsell;
	/**
	 * 是否是推荐场馆
	 */
	private String istjvenue;
	/**
	 * 配套设施
	 */
	private String ptss;
	/**
	 * 图片一
	 */
	private String img1;
	/**
	 * 图片二
	 */
	private String img2;
	/**
	 * 图片三
	 */
	private String img3;
	/**
	 * 图片四
	 */
	private String img4;
	/**
	 * 图片五
	 */
	private String img5;
	/**
	 * 区
	 */
	private String qu;
	/**
	 * 省
	 */
	private String province;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 详细地址
	 */
	private String detailsadd0;
	/**
	 * 删除标识
	 */
	private String isdelete;
	/**
	 * 备注说明
	 */
	private String remark;
	/**
	 * 场馆主图
	 */
	private String venueimg;
	/**
	 * 促销信息字段
	 */
	private String cxmess;

	private String adduser;
	private String adddate;
	private String updateuser;
	private String updatedate;
	private String img6;
	private String img7;
	private String img8;

	// /**
	// * 在线客服
	// */
	// private String coustromerservice;

	public String getImg6() {
		return img6;
	}

	public void setImg6(String img6) {
		this.img6 = img6;
	}

	public String getImg7() {
		return img7;
	}

	public void setImg7(String img7) {
		this.img7 = img7;
	}

	public String getImg8() {
		return img8;
	}

	public void setImg8(String img8) {
		this.img8 = img8;
	}

	public String getVenueimg() {
		return venueimg;
	}

	public void setVenueimg(String venueimg) {
		this.venueimg = venueimg;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getXzb() {
		return xzb;
	}

	public void setXzb(String xzb) {
		this.xzb = xzb;
	}

	public String getYzb() {
		return yzb;
	}

	public void setYzb(String yzb) {
		this.yzb = yzb;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getWaycar() {
		return waycar;
	}

	public void setWaycar(String waycar) {
		this.waycar = waycar;
	}

	public String getSportsitem() {
		return sportsitem;
	}

	public void setSportsitem(String sportsitem) {
		this.sportsitem = sportsitem;
	}

	public String getWorktime() {
		return worktime;
	}

	public void setWorktime(String worktime) {
		this.worktime = worktime;
	}

	public String getYytime() {
		return yytime;
	}

	public void setYytime(String yytime) {
		this.yytime = yytime;
	}

	public String getKhpjlevel() {
		return khpjlevel;
	}

	public void setKhpjlevel(String khpjlevel) {
		this.khpjlevel = khpjlevel;
	}

	public String getPingjiatotal() {
		return pingjiatotal;
	}

	public void setPingjiatotal(String pingjiatotal) {
		this.pingjiatotal = pingjiatotal;
	}

	public String getPingjianumber() {
		return pingjianumber;
	}

	public void setPingjianumber(String pingjianumber) {
		this.pingjianumber = pingjianumber;
	}

	public String getScnumber() {
		return scnumber;
	}

	public void setScnumber(String scnumber) {
		this.scnumber = scnumber;
	}

	public String getIsyijia() {
		return isyijia;
	}

	public void setIsyijia(String isyijia) {
		this.isyijia = isyijia;
	}

	public String getYjuser() {
		return yjuser;
	}

	public void setYjuser(String yjuser) {
		this.yjuser = yjuser;
	}

	public String getYjuserphone() {
		return yjuserphone;
	}

	public void setYjuserphone(String yjuserphone) {
		this.yjuserphone = yjuserphone;
	}

	public String getHotsell() {
		return hotsell;
	}

	public void setHotsell(String hotsell) {
		this.hotsell = hotsell;
	}

	public String getIstjvenue() {
		return istjvenue;
	}

	public void setIstjvenue(String istjvenue) {
		this.istjvenue = istjvenue;
	}

	public String getPtss() {
		return ptss;
	}

	public void setPtss(String ptss) {
		this.ptss = ptss;
	}

	public String getImg1() {
		return img1;
	}

	public void setImg1(String img1) {
		this.img1 = img1;
	}

	public String getImg2() {
		return img2;
	}

	public void setImg2(String img2) {
		this.img2 = img2;
	}

	public String getImg3() {
		return img3;
	}

	public void setImg3(String img3) {
		this.img3 = img3;
	}

	public String getImg4() {
		return img4;
	}

	public void setImg4(String img4) {
		this.img4 = img4;
	}

	public String getImg5() {
		return img5;
	}

	public void setImg5(String img5) {
		this.img5 = img5;
	}

	public String getQu() {
		return qu;
	}

	public void setQu(String qu) {
		this.qu = qu;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDetailsadd0() {
		return detailsadd0;
	}

	public void setDetailsadd0(String detailsadd0) {
		this.detailsadd0 = detailsadd0;
	}

	public String getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(String isdelete) {
		this.isdelete = isdelete;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAdduser() {
		return adduser;
	}

	public void setAdduser(String adduser) {
		this.adduser = adduser;
	}

	public String getAdddate() {
		return adddate;
	}

	public void setAdddate(String adddate) {
		this.adddate = adddate;
	}

	public String getUpdateuser() {
		return updateuser;
	}

	public void setUpdateuser(String updateuser) {
		this.updateuser = updateuser;
	}

	public String getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	public String getCxmess() {
		return cxmess;
	}

	public void setCxmess(String cxmess) {
		this.cxmess = cxmess;
	}
}
