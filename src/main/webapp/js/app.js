'use strict';

var kinoapp = angular.module("kinoapp", ["controllers", "ui.growl"]);

kinoapp.directive('filmList', function factory() {
    var ddo = {
        priority: 0,
        templateUrl: "js/tmpl/filmsonmain.html",
        replace: false,
        transclude: false,
        restrict: 'E',
        scope: {},
        link: function($scope, elem, attr){//get data here
            $scope.films = [
                {
                    names: ["Gravity"],
                    description: 'Phsychodelic cosmo opera',
                    productionYear: 1980,
                    code: 1,
                    hasDirectorsCut: true,
                    allTimesRate: 5,
                    tag: ["blockbasters"],
                    actors: ["Johny Depp", "Layza Caddrow"],
                    availableQuality: ["sd"],
                    urls: ['http://s10.dotua.org/fsua_items/cover/00/16/37/6/00163792.jpg'],
                    type: 'film'
                },
                {
                    names: ["Transformers"],
                    description: 'Good family movie',
                    productionYear: 1990,
                    code: 1,
                    hasDirectorsCut: false,
                    allTimesRate: 5,
                    tag: ["cool", "wow","Special Effects"],
                    actors: ["Johny Depp", "Layza Caddrow"],
                    availableQuality: ["hd", "sd"],
                    urls: ['http://s12.dotua.org/fsua_items/cover/00/22/01/6/00220117.jpg'],
                    type: 'film'
                },
                {
                    names: ["Transformers"],
                    description: 'Good family movie',
                    productionYear: 1990,
                    code: 1,
                    hasDirectorsCut: false,
                    allTimesRate: 5,
                    tag: ["cool", "wow","Special Effects"],
                    actors: ["Johny Depp", "Layza Caddrow"],
                    availableQuality: ["hd", "sd"],
                    urls: ['http://s12.dotua.org/fsua_items/cover/00/18/44/6/00184444.jpg'],
                    type: 'film'
                }
            ]
        }
    };
    return ddo;
});

kinoapp.directive('news', function factory() {
    var ddo = {
        priority: 0,
        templateUrl: "js/tmpl/news.html",
        replace: false,
        transclude: false,
        restrict: 'E',
        scope: {},
        link: function($scope, elem, attr){//get data here
            $scope.messages = [
                {
                    title:"Your tag being accepted. Vivat!",
                    details:{
                        type:"A",
                        likesCount:200
                    },
                    priority:10
                },
                {
                    title:"New film added",
                    details:{
                        type:"SYS"
                    },
                    priority:5
                }
            ]
        }
    };
    return ddo;
});


kinoapp.directive('authorization', function factory() {
    var ddo = {
        priority: 0,
        templateUrl: "js/tmpl/auth.html",
        replace: false,
        transclude: false,
        restrict: 'E',
        scope: {},
        link: function($scope, elem, attr){//get data here
            $scope.session = "N"
        }
    };
    return ddo;
});



kinoapp
    .config(['$routeProvider', function ($routeProvider) {
         $routeProvider. when('/index')
             .otherwise( {redirectTo: '/index'})
    }]);
