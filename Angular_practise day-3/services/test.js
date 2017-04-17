var app = angular.module('myApp', []);

// app.service('random',function(){
// var num=Math.floor(Math.random()*10);
// this.generate=function(){
// return num;
// };
// });

app.factory('random', function() {
	var randomobj = {};
	var num = Math.floor(Math.random() * 10);
	randomobj.generate = function() {
		return num;
	};
	return randomobj;
});

app.provider('date',function(){
	return{
		$get: function(){
			return{
			showDate : function(){
				var date=new Date();
				return date.getHours();
				}
			}
		}
	}
});

app.controller('myCntrl', function($scope, random) {
	$scope.generaterandom = function() {
		$scope.randomnumber = random.generate();
	};

	var number = Math.random();
	$scope.numm = number;

});

app.controller('my',function($scope,date){
	$scope.showing=date.showDate();
});