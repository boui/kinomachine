angular.module("kinoapp.controllers", [])
    .controller('CommentController', ['$scope', function ($scope) {
        $scope.comments = [
            {
                text: 'Lold',
                rate: 8.9,
                liked: 'current user didn\'t like this one',
                likes: 237
            }
        ]
    }]);
