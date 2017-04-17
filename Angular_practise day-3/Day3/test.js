var app=angular.module('myApp',[]);
app.controller('myCntrl',function($scope){
	var range=new Array(3);
	$scope.range=range;
	
	$scope.counter=0;
	$scope.$watch('myText',function(newValue,oldValue){
		$scope.counter++;
	});
});