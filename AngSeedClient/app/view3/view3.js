'use strict';

angular.module('myApp.view3', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view3', {
    templateUrl: 'view3/view3.html',
    controller: 'View3Ctrl'
  });
}])

.controller('View3Ctrl', function($http,$scope) {
  $http.get('api/allusers')
            .success(function (data, status, headers, config) {
              $scope.users = data;
            })
            .error(function (data, status, headers, config) {
              
             });
 
});