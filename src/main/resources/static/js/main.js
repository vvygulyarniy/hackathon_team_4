app = angular.module("myApp", ['ngRoute']);

app.controller('bodyController', function ($scope, $location, $http ) {
  $scope.selectValue = function(value){
	  if($scope.activeValue == value){
		  $scope.activeValue = 0;
		  $location.path("/index.html");
	  } else {
		  $scope.activeValue = value;
	  }
  };
  
  $http.get('http://localhost:8080/values').then(
	function(response){
		$scope.total =  response.data;
	}
  );
  
});

app.config(['$routeProvider', '$locationProvider',function ($routeProvider, $locationProvider) {
	$routeProvider
	//home
	
	.when("/EXCELLENCE", {templateUrl: "templates/valueTemplate.html", controller: "PageCtrl"})
	.when("/CREATIVITY", {templateUrl: "templates/valueTemplate.html", controller: "PageCtrl"})
	.when("/RELATIONSHIPS", {templateUrl: "templates/valueTemplate.html", controller: "PageCtrl"})
	.when("/AGILITY", {templateUrl: "templates/valueTemplate.html", controller: "PageCtrl"})
	.when("/FUN", {templateUrl: "templates/valueTemplate.html", controller: "PageCtrl"})
	.when("/COMMITMENT", {templateUrl: "templates/valueTemplate.html", controller: "PageCtrl"})
	.otherwise({templateUrl: "globalStats.html", controller: "PageCtrl"});
	
	$locationProvider.html5Mode({
	  enabled: true,
	  requireBase: false
	});
}]);

app.controller('PageCtrl', function ( $scope, $location, $http) {

	var url = $location.url();	
	var value = url.substring(1);
	
	var urlForParticipants = 'http://localhost:8080/'+value+'/top/participants';
	var urlForOrginizers = 'http://localhost:8080/'+value+'/top/organizers';
	
	$http.get(urlForParticipants).then(
		function(response){
			$scope.topParticipants =  response.data;
		}
	);
	$http.get(urlForOrginizers).then(
			function(response){
				$scope.topOrginizers =  response.data;
			}
		);
});



app.controller('valueController', ['$scope', 'TotalService',function ($scope, TotalService ) {
  
}]);
app.factory('TotalService', ['$http', '$q', function($http, $q){

	return {
			getTotal: function() {
				return $http.get('http://localhost:8080/values')
						.then(
								function(response){
									return response.data;
								}
						);
			},
		    
			fetchSpecificItem: function(category,id) {
				return $http.get('http://localhost:8080/Spring4MVCAngularJSRoutingExample/item/'+category+'/'+id)
						.then(
								function(response){
									return response.data;
								}, 
								function(errResponse){
									console.error('Error while fetching specific Item');
									return $q.reject(errResponse);
								}
						);
			}
	};

}]);
