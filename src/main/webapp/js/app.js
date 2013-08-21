angular.module("kinoapp",["kinoapp.controllers","kinoapp.routesConfig"]);
//angular.module("app.vk",[])
//    .factory("vk", function(){
//        VK.init(function () {
//
//        });
//        return VK;
//    });

//function getParentBrowserHash(){
//    var params = location.search.substr(1).split("&");
//    return decodeURIComponent(_.filter(params, function(param){
//        var paramPair = param.split("=");
//        return paramPair[0]=="hash";
//    })[0].split("=")[1]);
//}

angular.module('kinoapp.routesConfig', ["kinoapp.controllers"])
//    .run(function($rootScope, $location) {
////        $location.path(getParentBrowserHash());
////        vk.addCallback("onLocationChanged", function(l){
////            if (location.hash !== "#"+l){
////                location.hash = "#"+l;
////                console.log("Changing from vk "+l);
////            }
////        });
////        $rootScope.$on('$routeChangeSuccess', function (event, current) {
////            var hash = $location.path();
////            console.log('Changing from '+angular.toJson(current)+' to '+$location.path()+" Event:"+angular.toJson(event));
////        });
//    })
    .config(['$routeProvider', function($routeProvider) {
        $routeProvider.
//            when('/contest', {templateUrl: 'contest.html',   controller: "ContestController"}).
//            when('/edit/film', {templateUrl: 'film.html',   controller: "EditFilmController"}).
//            when('/comment', {templateUrl: 'comment.html',   controller: "CommentController"}).
//            when('/search', {templateUrl: 'search.html', controller:"SearchFilmController"}).
            otherwise({redirectTo:'/'});
    }]);
