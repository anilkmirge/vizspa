var memberControllers = angular.module('memberControllers', ['ngAnimate']);
var pageControllers = angular.module('pageControllers', []);

memberControllers.controller('ListController', ['$scope', '$http', function MyController($scope, $http) {
	$http.get('rest/members/listAllMembers').success(function(data) {
		$scope.members = data;
		$scope.memberOrder = "name";

	});
}]);
memberControllers.controller('DetailsController', ['$scope', '$http', '$routeParams', function MyController($scope, $http, $routeParams) {
	$http.get('rest/members/listAllMembers').success(function(data) {
		$scope.members = data;
		$scope.whichItem = $routeParams.itemId;
		if ($routeParams.itemId > 0) {
			$scope.prevItem = Number($routeParams.itemId) - 1;
		} else {
			$scope.prevItem = $scope.members.length - 1; 
		}

		if ($routeParams.itemId < $scope.members.length - 1) {
			$scope.nextItem = Number($routeParams.itemId) + 1;
		} else {
			$scope.nextItem = 0; 
		}

	});
}]);

pageControllers.controller('AboutController', function($scope){
	$scope.title = 'About Us - Vizuri Overview';
	$scope.para1 = 'Vizuri is an IT consulting firm that combines expertise in modern software architecture, tools, and processes, with a solid foundation in engineering principles, and a focus on open standards. Our services range from expert consulting and mentoring to mixed team and turn-key solutions. We specialize in cloud enablement, enterprise integration, business rules and process management, and application performance management. Our clients benefit from our disciplined approach to providing solutions that are unique and highly valued.'
	$scope.para2 = 'Additionally, Vizuri serves as a strategic partner and authorized reseller for a select group of leading enterprise software vendors and cloud service providers including Red Hat, OpenShift, MongoDB, AppDynamics, Autonomic Resources, and Amazon Web Services';
	$scope.para3 = 'Vizuri is a business unit of AEM Corporation. AEM Corporation was founded in 1986 as a 100% woman-owned business. Since its inception, AEM has had more than 28 years of profitable growth and has one of the most stable, satisfied work forces in the industry. AEM is headquartered in the Washington, DC metropolitan area with offices conveniently located around the Capital Beltway. Other AEM corporate offices are located in major metropolitan areas including: Los Angeles and San Antonio.';
});

pageControllers.controller('ContactController', function($scope){
	$scope.company = 'Vizuri';
	$scope.phone = '(703) 318-7800';
	$scope.fax = '(703) 935-8529';
});