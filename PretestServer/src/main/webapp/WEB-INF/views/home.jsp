<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.List" pageEncoding="UTF-8"%>
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
			<li ng-repeat="board in boards">
				<div class="article-head">
					<h4 class="media-heading">
						<tr>{{board.email}} <a class="article-time"
							title="Modified by {{article.modtime}}">작성일
							{{board.date_created}}</a>
							</tr> 
							<tr>내용 {{board.content}}</tr>
						<button class="btn btn-danger pull-left"
							ng-click="changeEmail(board)">수정하</button>
					</h4>
				</div>
			</li>
		</ul>

	</div>


	<script type="text/javascript">
		var BoardController = function($scope, $http) {
			$scope.boards;
			$scope.addEmail = function() {
				$http.get('addEmail').success(function(protocoldata) {
					$scope.boards = protocoldata.boards;
				});
			};
			$scope.changeEmail = function(board) {
				$http({
					method : 'POST',
					url : 'changeboard',
					data : article
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