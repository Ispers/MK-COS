const base = {
    get() {
        return {
            url : "http://localhost:8080/xiaoyuandingcanxitong/",
            name: "xiaoyuandingcanxitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiaoyuandingcanxitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园订餐系统"
        } 
    }
}
export default base
