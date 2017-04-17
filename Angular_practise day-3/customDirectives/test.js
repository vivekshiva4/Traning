var app = angular.module('myApp', []);
app
		.directive(
				'myScript',
				function() {

					function linkFunction($scope, ele, attrs) {
						$scope.name = 'hello world';
						$scope.changeName = function(newName) {
							// $scope.name=newName;
							$scope.name = $scope.controllerProperty;
						}

					}

					return {
						restrict : 'EA',
						scope : true,
						link : linkFunction,
						template : '<span ng-click="changeName()">current Text :{{name}}</span>'
					// templateUrl : '',

					};
				});

app
		.directive(
				'myScriptone',
				function() {
					return {
						restrict : 'EA',
						scope : {
							name : '@',
							age:'='
						},
						template : [
								'<p> The name in directive is : {{name}}</p>',
								'<p>Name in dirctive :<input type="text" ng-model="name"></p>',
								'<p> The Age in directive is : {{age}}</p>',
								'<p>Age in dirctive :<input type="text" ng-model="age"></p>']
								.join('')
					}
				});

app.controller('app', function($scope) {
	$scope.controllerProperty = 'hello controller';
	$scope.name = 'vivek';
	$scope.age=30;
});