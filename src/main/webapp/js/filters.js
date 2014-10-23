angular.module('bioFilters', []).filter('newline', function() {
  return function(data) {
   	if (!data) return data;
   	return data.replace(/\n/g, '<br/>');
 };
});
