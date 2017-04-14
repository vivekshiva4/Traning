var app=angular.module("myApp",[]);
app.controller('language',function($scope){
$scope.myFavLAngaue='none';
$scope.php=function(){
    $scope.myFavLAngaue='php'
};
$scope.java=function(){
    $scope.myFavLAngaue='java'
};

});