var myApp = angular.module('myApp', [
	'ngRoute', 'memberControllers', 'pageControllers', 'bioFilters'
]);

myApp.config(['$routeProvider',function($routeProvider) {
	$routeProvider.
	when('/list', {
		templateUrl: 'partials/list.html',
		controller: 'ListController'
	}).
	when('/details/:itemId', {
		templateUrl: 'partials/details.html',
		controller: 'DetailsController'
	}).
	when('/about', {
		templateUrl: 'partials/about.html',
		controller: 'AboutController'
	}).
	when('/contact', {
		templateUrl: 'partials/contact.html',
		controller: 'ContactController'
	}).
	otherwise({
		redirectTo: '/list'
	});
}])