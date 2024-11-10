/*
 * @Author: your name
 * @Date: 2021-04-18 16:43:12
 * @LastEditTime: 2022-04-07 17:39:26
 * @LastEditors: your name
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: /admin/src/utils/base.js
 */
const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootx0gy2/",
            name: "springbootx0gy2",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootx0gy2/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "有约剧本杀管理系统"
        } 
    }
}
export default base
