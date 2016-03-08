package com.clientmaster.test;

public class MyInterface {

	// 正式服务器地址http://123.56.162.207:8090
	//测试服务器地址http://123.56.162.207:8093；
	public static final String SERVER_ADDRESS = "http://123.56.162.207:8090";
	// 1. 场馆接口
	public static final String RDIUM_URL = SERVER_ADDRESS
			+ "/hosapro/hsvenue/findPageVenue";// page=1&rows=10&xzb=116.7979789595&yzb=39.9712472655
	// 2. 场馆卡项接口
	public static final String RDIUM_CARD = SERVER_ADDRESS
			+ "/hosapro/hsvenue/findVenueCardId";
	// 3. 场馆教练查询接口
	public static final String RDIUM_TEACHER = SERVER_ADDRESS
			+ "/hosapro/hsvenueCoach/findVenueCoachId";
	// 4. 教练课程查询接口
	public static final String RDIUM_COURSE = SERVER_ADDRESS
			+ "/hosapro/hsvenueCoach/findCoachLessonId";
	// 5. 场馆课程查询接口
	public static final String RDIUM_SEARCH = SERVER_ADDRESS
			+ "/hosapro/hsvenue/findVenueLessonId";

	// 6. 查看场馆评价接口
	public static final String RDIUM_APPRAISE = SERVER_ADDRESS
			+ "/hosapro/hsvenue/findPageVenuePj";
	// 7. 添加啊场馆评价接口
	public static final String ADD_RDIUM_APPRAISE = SERVER_ADDRESS
			+ "/hosapro/hsvenue/addPjia";
	// 8.商品（装备及场馆其他）分类查询接口
	public static final String COMMODITY_TYPE_SEACH = SERVER_ADDRESS
			+ "/hosapro//HsShangpin/findVenuesptypeId";
	// 9.商品（装备及场馆其他）查询接口
	public static final String COMMODITY_SEACH = SERVER_ADDRESS
			+ "/hosapro/HsShangpin/findPageja";
	// 10.装备商品类型查询接口
	public static final String EQUIPMENT_TYPE = SERVER_ADDRESS
			+ "/hosapro//HsShangpin/findVenuesptypeId";
	// 11.商品（装备及场馆其他）查询接口
	public static final String SHANGPING_CHAXUN = SERVER_ADDRESS
			+ "/hosapro/HsShangpin/findPageja";
	// 12. 会员注册接口
	public static final String HUIYAN_ZHUCE = SERVER_ADDRESS
			+ "/hosapro/hscoustromer/add";
	// 13. 会员登录接口
	public static final String HUIYUAN_DENGLU = SERVER_ADDRESS
			+ "/hosapro/hscoustromer/huiyuandengl";
	// 14.商品明细查询接口
	public static final String SHANGPING_MINGXI = SERVER_ADDRESS
			+ "/hosapro/HsShangpin/findSpDetailId";

	// 15.添加购物车接口
	public static final String TIANJIA_GOUWUCHE = SERVER_ADDRESS
			+ "/hosapro/hspcar/addcar";
	// 16.购物车查询接口
	public static final String GOUWUCHE_CHAXUN = SERVER_ADDRESS
			+ "/hosapro/hspcar/getSpcarList";
	// 17.添加订单接口（通过购物车购买）
	public static final String TIANIA_DINGDAN_BY_GOUWUCHE = SERVER_ADDRESS
			+ "/hosapro/hsorder/addOrder";
	// 18.添加订单接口（直接购买）
	public static final String TIANJIA_DINGDAN_ZHIJIEGOUMAI = SERVER_ADDRESS
			+ "/hosapro/hsorder/addOrderRight";
	// 19.添加订单接口（通过购物车购买）
	public static final String SHOPPINGCARJIESUAN = SERVER_ADDRESS
			+ "/hosapro/hspcar/getSpcarList";
	// 20.场馆搜索项目查询接口
	public static final String RADIUM_XIANGMU_SEARCH = SERVER_ADDRESS
			+ "/hosapro/hsvenue/findVenueXiangmuId";
	// 21.场馆评价添加接口
	public static final String RADIUM_APPRAISE_ADD = SERVER_ADDRESS
			+ "/hosapro/hsvenue/addPjia";
	// 22.手机验证码接口
	public static final String PHONE_YANZHENG_CODE = SERVER_ADDRESS
			+ "/hosapro/hscoustromer/sendyzm";
	// 23.短信验证接口
	public static final String DUANXIN_YANZHENG_JIEKOU = SERVER_ADDRESS
			+ "/hosapro/hscoustromer/checkyzm";
	// 24.我的订单接口
	public static final String MY_ORDER_LIST = SERVER_ADDRESS
			+ "/hosapro/hsorder/queryMyOrder";
	// 25发送验证码至邮箱
	public static final String SEND_CODE_EMAIL = SERVER_ADDRESS
			+ "/hosapro/hscoustromer/sendmail";
	// 26个人信息编辑接口
	public static final String PERSON_INFORMATION_EDIT = SERVER_ADDRESS
			+ "/hosapro/hscoustromer/edit";
	// 27头像上传接口
	public static final String TOU_XIANG_UOLOAD = SERVER_ADDRESS
			+ "/hosapro/hscoustromer/save_img";
	// // 27头像上传接口
	// public static final String PERSON_INFORMATION_GET = SERVER_ADDRESS
	// + "/hosapro/hscoustromer/findById";
	// 28获得个人信息
	public static final String PERSON_INFORMATION_GET = SERVER_ADDRESS
			+ "/hosapro/hscoustromer/findById";
	// 29.我的收藏接口
	public static final String COLLECTOR = SERVER_ADDRESS
			+ "/hosapro/sqfollow/operateFollow";
	// 30.检查登录会员是否已经收藏此类型的商品或者场馆
	public static final String CHECK_IsOrNot_COLLECTOR = SERVER_ADDRESS
			+ "/hosapro/sqfollow/checkSc";
	// 30.场馆其他商品查询接口
	// 31.我的页面里收藏接口
	public static final String MINE_COLLECTOR = SERVER_ADDRESS
			+ "/hosapro/sqfollow/customerCollect";
	// 32.场馆其他商品查询接口
	public static final String RADUIM_OTHER_SERACH = SERVER_ADDRESS
			+ "/hosapro/HsShangpin/findVenuespId";

	// 33.会员找回密码发送验证码接口
	public static final String ZHAOHUI_MIMA = SERVER_ADDRESS
			+ "/hosapro/hscoustromer/findByPwd";

	// 34.购物车删除商品详情
	public static final String DELETE_CAR_GOODS = SERVER_ADDRESS
			+ "/hosapro/hspcar/deletecar";

	// 35.会员找回密码后提交服务器接口
	public static final String ZHAOHUI_MIMA_SEND_SERVER_STRING = SERVER_ADDRESS
			+ "/hosapro/hscoustromer/update_pwd";
	// 36.我的收藏跳转到场馆详情，教练详情，商品详情接口
	public static final String SHOUCANG_TIAOZHUAN = SERVER_ADDRESS
			+ "/hosapro/hscoustromer/findByscId";
	// 37.登陆
	public static final String LOGIN_URL = SERVER_ADDRESS
			+ "/hosapro/hscoustromer/huiyuandengl";
	// 38.教练评价添加接口
	public static final String ADD_APPRAISE_COACH = SERVER_ADDRESS
			+ "/hosapro/hsvenueCoach/addPjia";
	// 39.教练评价查询接口
	public static final String GET_APPRAISE_COACH = SERVER_ADDRESS
			+ "/hosapro/hsvenueCoach/findVenueCoachPj";
	// 40.收货地址查询接口
	public static final String SEARCH_SHOUHUO_ADDRESS = SERVER_ADDRESS
			+ "/hosapro/hscoustromer/findAddress";
	// 41.会员地址编辑接口
	public static final String SHOUHUO_ADDRESS_EDIT = SERVER_ADDRESS
			+ "/hosapro/hscoustromer/addressedit";
	// 41.会员地址编辑接口
	public static final String HOT_GO_VENUE_LIST = SERVER_ADDRESS
			+ "/hosapro/hsvenue/selectVenueList";
	// 42.会员地址删除接口
	public static final String ADDRESS_DELETE = SERVER_ADDRESS
			+ "/hosapro/hscoustromer/deleteAddress";
	// 43.场馆城市热搜
	public static final String HotSearch_radium = SERVER_ADDRESS
			+ "/hosapro/hsvenue/selectHotsearch";
	// 44.公司加盟
	public static final String COMPANY_JOIN = SERVER_ADDRESS
			+ "/hosapro/hscompanyjoin/addcompany";
	// 45.投诉建议
	public static final String COMPLAIN_SUGGESTION = SERVER_ADDRESS
			+ "/hosapro/hscompanyjoin/addsuggest";
	// 46.官方发布
	// public static final String OFFICIAL_RELEASE = SERVER_ADDRESS
	// + "/hosapro/sqactivity/findactivity";
	public static final String OFFICIAL_RELEASE = SERVER_ADDRESS
			+ "/hosapro/sqactivity/findActivityReleaseList";
	// 47.我的空间
	public static final String MY_SPACE = SERVER_ADDRESS
			+ "/hosapro/sqdynamic/findDynamicByUserInfoList";
	// 48.订单状态修改
	public static final String ORDER_CHANGE = SERVER_ADDRESS
			+ "/hosapro/hsorder/orderTransferToLineGbd";
	// 49.删除我的空间
	public static final String DELETE_ORDER_CHANGE = SERVER_ADDRESS
			+ "/hosapro/hscoustromer/coustomerDeDynamic";
	// 50.城市选择 已经覆盖城市
	public static final String AllCoverCity = SERVER_ADDRESS
			+ "/hosapro/hsvenue/findfugaicityId";
	// 51.活动列表接口
	public static final String ACTIVITYS_LIST = SERVER_ADDRESS
			+ "/hosapro/sqactivity/findActivityList";
	// 52.视频列表接口
	public static final String VIDEOS_LIST = SERVER_ADDRESS
			+ "/hosapro/hsplay/hsplayList";
	// 53.请求活动评比
	// public static final String PING_BI =
	// "http://123.56.162.207:8093/hosapro/sqactivity/findActivityDetail";//
	// http://123.56.162.207:8093
	public static final String PING_BI = SERVER_ADDRESS
			+ "/hosapro/sqactivity/findActivityDetail";// http://123.56.162.207:8090
	// 53.添加活动评比
	// public static final String ADD_PING_BI =
	// "http://123.56.162.207:8093/hosapro/sqactivity/saveActivityWaterFall";//
	// http://123.56.162.207:8093
	public static final String ADD_PING_BI = SERVER_ADDRESS
			+ "/hosapro/sqactivity/saveActivityWaterFall";// http://123.56.162.207:8090
	// 54.官方发布数据
	public static final String OFFICIAL_RELEASE_DATAS = SERVER_ADDRESS
			+ "/hosapro/sqactivity/findActivityReleaseDetail";
	// 55.评比活动点赞
	// public static final String PRISE_PING_BI =
	// "http://123.56.162.207:8093/hosapro/sqactivity/addActivityWaterFallPraise";//
	// http://123.56.162.207:8093
	public static final String PRISE_PING_BI = SERVER_ADDRESS
			+ "/hosapro/sqactivity/addActivityWaterFallPraise";// http://123.56.162.207:8090
	// 56.评比活动里的广告
	// public static final String PINGB_BI_AD =
	// "http://123.56.162.207:8093/hosapro/hsadvert/findActivityAdvert";

	public static final String PINGB_BI_AD = SERVER_ADDRESS
			+ "/hosapro/hsadvert/findActivityAdvert";
	// 57.微信支付
	// public static final String WXPAY =
	// "http://123.56.162.207:8093/hosapro/weixin/weixinsign";

	public static final String WXPAY = SERVER_ADDRESS
			+ "/hosapro/weixin/weixinsign";
	//个人企业申请开直播的
	public static final String ZHIBOASK = SERVER_ADDRESS
			+ "/hosapro/hsvenue/addZhiboshenqing";
	public static final String DELETE_YUELIAN = SERVER_ADDRESS
			+ "/hosapro/sqaboutpractice/hiddenAboutpracticeInfo";
}
