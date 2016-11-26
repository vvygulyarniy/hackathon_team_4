var app = angular.module("myApp", ['ngRoute']);

app.config(['$routeProvider', '$locationProvider',function ($routeProvider, $locationProvider) {
	$routeProvider
	//home
	
	.when("/excelence", {templateUrl: "templates/valueTemplate.html", controller: "PageCtrl"})
	.when("/creativity", {templateUrl: "templates/valueTemplate.html", controller: "PageCtrl"})
	.when("/relationships", {templateUrl: "templates/valueTemplate.html", controller: "PageCtrl"})
	.when("/agility", {templateUrl: "templates/valueTemplate.html", controller: "PageCtrl"})
	.when("/fun", {templateUrl: "templates/valueTemplate.html", controller: "PageCtrl"})
	.when("/commitment", {templateUrl: "templates/valueTemplate.html", controller: "PageCtrl"})
	
	.otherwise({templateUrl: "globalStats.html", controller: "PageCtrl"});
	
	$locationProvider.html5Mode({
	  enabled: true,
	  requireBase: false
	});
}]);

app.controller('PageCtrl', function ( $scope, $location, $http) {
	$scope.text = $location.url();
});