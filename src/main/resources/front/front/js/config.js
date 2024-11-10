
var projectName = '基于SpingBoot的剧本杀管理系统';
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
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

]


var indexNav = [

{
	name: '剧本列表',
	url: './pages/jubenliebiao/list.html'
}, 

{
	name: '剧本讨论',
	url: './pages/forum/list.html'
}, 
{
	name: '剧本资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springbootx0gy2/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","发布剧本"],"menu":"剧本","menuJump":"列表","tableName":"juben"}],"menu":"剧本管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"剧本类型","menuJump":"列表","tableName":"jubenleixing"}],"menu":"剧本类型管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"剧本列表","menuJump":"列表","tableName":"jubenliebiao"}],"menu":"剧本列表管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"订单","menuJump":"列表","tableName":"dingdan"}],"menu":"订单管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"订单审核","menuJump":"列表","tableName":"dingdanshenhe"}],"menu":"订单审核管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"房间","menuJump":"列表","tableName":"fangjian"}],"menu":"房间管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"剧本讨论","tableName":"forum"}],"menu":"剧本讨论"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"剧本资讯","tableName":"news"},{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","下单"],"menu":"剧本列表列表","menuJump":"列表","tableName":"jubenliebiao"}],"menu":"剧本列表模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["下单","查看"],"menu":"剧本列表","menuJump":"列表","tableName":"jubenliebiao"}],"menu":"剧本列表管理"},{"child":[{"buttons":["查看","支付"],"menu":"订单","menuJump":"列表","tableName":"dingdan"}],"menu":"订单管理"},{"child":[{"buttons":["查看"],"menu":"订单审核","menuJump":"列表","tableName":"dingdanshenhe"}],"menu":"订单审核管理"}],"frontMenu":[{"child":[{"buttons":["查看","下单"],"menu":"剧本列表列表","menuJump":"列表","tableName":"jubenliebiao"}],"menu":"剧本列表模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


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
