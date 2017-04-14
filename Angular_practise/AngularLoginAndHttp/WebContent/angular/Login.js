var app=angular.module('loginApp',['ngRoute']);

app.config(function($routeProvider){
   $routeProvider
   .when('/',{
       templateUrl:'loginform.html'

   }) 
   .when('/dashboard',{
	   resolve:{
		 "check":function($location,$rootScope){
			 if(!$rootScope.loggedIn){
				 $location.path('/')
			 }
		 }  
	   },
       templateUrl:'dashboard.html'
   })
   .otherwise({
       redirectTo:'/'
   });
});

app.controller('loginCntrl',function($scope,$location,$rootScope){
    
    $scope.submit=function(){
    var username=$scope.username;
    var password =$scope.password;
    if($scope.username=='admin' && $scope.password=='admin'){
    	$rootScope.loggedIn=true;
        $location.path('/dashboard');
    }
    else{
        alert('worng details');
    }
};
});