var app=angular.module('loginApp',['ngRoute']);

app.config(function($routeProvider){
   $routeProvider
   .when('/',{
       templateUrl:'loginform.html'

   }) 
   .when('/dashboard',{
       templateUrl:'dashboard.html'
   })
   .otherwise({
       redirectTo:'/'
   });
});

app.controller('loginCntrl',function($scope,$location){
    
    $scope.submit=function(){
    var username=$scope.username;
    var password =$scope.password;
    if($scope.username=='admin' && $scope.password=='admin'){
        $location.path('/dashboard');
    }
    else{
        alert('worng details');
    }
};
});