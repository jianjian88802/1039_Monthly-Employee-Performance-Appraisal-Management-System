const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot57n6g/",
            name: "springboot57n6g",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot57n6g/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "员工绩效考核管理系统"
        } 
    }
}
export default base
