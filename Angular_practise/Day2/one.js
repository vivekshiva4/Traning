var app=angular.module('myApp',['ngRoute']);
app.config(function($routeProvider){

    $routeProvider
    .when('/',{
        templateUrl:'http://localhost:8080/BusBookingWebApplication/login'
    })
    .when('/hi',{
        template: 'hey hii'
    })
    .otherwise({
        redirectTo:'/'
    });
});