'use strict';

/**
 * CarController
 * @constructor
 */

var BoardController = function($scope, $http) {
	$scope.fetchCarsList = function() {
		$http.get('cars/carlist.json').success(function(carList) {
			$scope.cars = carList;
		});
	};

	$scope.addNewCar = function(newCar) {
		$http.post('cars/addCar/' + newCar).success(function() {
			$scope.fetchCarsList();
		});
		$scope.carName = '';
	};
	$scope.addNewCar = function(newCar) {
		$http.post('cars/addCar/' + newCar).success(function() {
			$scope.fetchCarsList();
		});
		$scope.carName = '';
	};
	$scope.alerttest = function() {
		alert("aaa");
	};
	$scope.fetchCarsList();
};