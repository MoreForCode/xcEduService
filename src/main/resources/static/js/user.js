new Vue({
    el:"#app",
    data:{
        user:{
            id:"",
            userName:"",
            password:"",
            email:"",
            age:"",
            sex:""
        },
        userList:[]
    },

    methods:{
        findAll:function () {
            //在当前方法中定义一个vue对象
            var _this= this;
            axios.get('/user/findAll').then(function(response){
                _this.userList=response.data;
                console.log(response);
            }).catch(function(error){
                console.log(error);
            })
        },
        findById:function (userId) {
            var _this =this;
            axios.get("/user/findById"+userId).then(function (value) {
                _this.user=value;
            })

        },
        update:function(user){

        }
    },
    created:function () {
        this.findAll();
    }
})