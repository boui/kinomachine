angular.module("controllers", [])
    .controller('AuthorizationController', ['$scope', '$growl', function ($scope, $growl) {

        $scope.alertsList = [];
        $scope.doClickDanger = function(stick) {
            $growl.box('Nav Cloud is down', 'Sad panda(', {
                class: 'danger',
                sticky: stick,
                type: "loly pop"
            }).open();
        };


        $scope.doClickInfo = function(stick) {
            $growl.box('I like', 'Pandas!! FYI', {
                class: 'info',
                sticky: stick,
                type: "idea"
            }).open();
        };

        $scope.doClickInverse = function(stick) {
            $growl.box('Dark period', 'It rains !_! 4 days in a row', {
                class: 'inverse',
                sticky: stick,
                type: "idea"
            }).open();
        };

        $scope.doClickWarning = function(stick) {
            $growl.box('You are clicking', 'Be aware of click too many times', {
                class: 'warning',
                sticky: stick,
                type: "Navigation controll"
            }).open();
        };


        $scope.showNavAlertsList = function(){
            alert(JSON.stringify($growl.alertsList));
        }

        $scope.doClickSuccess = function(stick) {
            $growl.box('Sucess', 'It works great!', {
                class: 'success',
                sticky: stick,
                type: "idea2"
            }).open();
        };

        $scope.findInnerHeight = function(){
            var myWidth = 0, myHeight = 0;
            if( typeof( window.innerWidth ) == 'number' ) {
                //Non-IE
                myWidth = window.innerWidth;
                myHeight = window.innerHeight;
            } else if( document.documentElement && ( document.documentElement.clientWidth || document.documentElement.clientHeight ) ) {
                //IE 6+ in 'standards compliant mode'
                myWidth = document.documentElement.clientWidth;
                myHeight = document.documentElement.clientHeight;
            } else if( document.body && ( document.body.clientWidth || document.body.clientHeight ) ) {
                //IE 4 compatible
                myWidth = document.body.clientWidth;
                myHeight = document.body.clientHeight;
            }
            window.alert( 'Width = ' + myWidth );
            window.alert( 'Height = ' + myHeight );

            window.measuredHeight = myHeight;
        }



}]);



