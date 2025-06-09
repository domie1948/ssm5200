
var projectName = '医院预约挂号系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.jsp'
}
]


var indexNav = [

{
	name: '科室信息',
	url: './pages/keshixinxi/list.jsp'
}, 
{
	name: '出诊信息',
	url: './pages/chuzhenxinxi/list.jsp'
}, 

{
	name: '公告信息',
	url: './pages/news/list.jsp'
},
]

var adminurl =  "http://localhost:8080/jspmdz5t9/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"科室信息","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"医生","menuJump":"列表","tableName":"yisheng"}],"menu":"医生管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"出诊信息","menuJump":"列表","tableName":"chuzhenxinxi"}],"menu":"出诊信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"预约时间段","menuJump":"列表","tableName":"yuyueshijianduan"}],"menu":"预约时间段管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"挂号预约","menuJump":"列表","tableName":"guahaoyuyue"}],"menu":"挂号预约管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"问题反馈","menuJump":"列表","tableName":"wentifankui"}],"menu":"问题反馈管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"问题解答","menuJump":"列表","tableName":"wentijieda"}],"menu":"问题解答管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"科室信息列表","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息模块"},{"child":[{"buttons":["查看","预约"],"menu":"出诊信息列表","menuJump":"列表","tableName":"chuzhenxinxi"}],"menu":"出诊信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除","支付","提问"],"menu":"挂号预约","menuJump":"列表","tableName":"guahaoyuyue"}],"menu":"挂号预约管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"问题反馈","menuJump":"列表","tableName":"wentifankui"}],"menu":"问题反馈管理"},{"child":[{"buttons":["查看"],"menu":"问题解答","menuJump":"列表","tableName":"wentijieda"}],"menu":"问题解答管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"科室信息列表","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息模块"},{"child":[{"buttons":["查看","预约"],"menu":"出诊信息列表","menuJump":"列表","tableName":"chuzhenxinxi"}],"menu":"出诊信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"出诊信息","menuJump":"列表","tableName":"chuzhenxinxi"}],"menu":"出诊信息管理"},{"child":[{"buttons":["查看","审核"],"menu":"挂号预约","menuJump":"列表","tableName":"guahaoyuyue"}],"menu":"挂号预约管理"},{"child":[{"buttons":["查看","审核","解答"],"menu":"问题反馈","menuJump":"列表","tableName":"wentifankui"}],"menu":"问题反馈管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"问题解答","menuJump":"列表","tableName":"wentijieda"}],"menu":"问题解答管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"科室信息列表","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息模块"},{"child":[{"buttons":["查看","预约"],"menu":"出诊信息列表","menuJump":"列表","tableName":"chuzhenxinxi"}],"menu":"出诊信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"医生","tableName":"yisheng"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
