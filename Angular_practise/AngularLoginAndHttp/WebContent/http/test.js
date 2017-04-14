var app=angular.module('myApp',[]);
app.controller('people',function($scope,$http){
	$http.get('http://localhost:8080/Angular/http/db.json')
	.then(function(response){
		$scope.persons=response.data.records;
	});
});