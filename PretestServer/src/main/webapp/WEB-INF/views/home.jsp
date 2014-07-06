<!DOCTYPE html>
<html ng-app>
<head>
<title>Hello World, AngularJS - ViralPatel.net</title>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script>
</head>
<body>
	<div ng-controller="BoardController">
		Email:<input type="text" ng-model="newcontact" />
		<button ng-click="addEmail()">Add</button>
		<h2>EmailList</h2>

		<ul>
			<li ng-repeat="email in emails">{{ email }}</li>
		</ul>
	
	</div>


	<script type="text/javascript">
		var BoardController = function($scope, $http) {
			$scope.emails = [ "kunyoungsin@naver.com"];
			$scope.addEmail = function() {
				$http.get('addEmail').success(function(emailList) {
					
					$scope.emails = emailList;
				});
			};
		};
	</script>
<!-- 		<script type="text/javascript">
		function FetchCtrl($scope, $http, $templateCache) {
			$scope.method = 'GET';
			$scope.url = 'addEmail';

			$scope.fetch = function() {
				$scope.code = null;
				$scope.response = null;
				
				$http({
					method : $scope.method,
					url : $scope.url,
					cache : $templateCache
				}).success(function(data, status) {
					alert('aaa');
					$scope.status = status;
					$scope.data = data;
				}).error(function(data, status) {
					alert(data);
					$scope.data = data || "Request failed";
					$scope.status = status;
				});
			};

			$scope.updateModel = function(method, url) {
				$scope.method = method;
				$scope.url = url;
			};
		}
	</script> -->
</body>
</html>