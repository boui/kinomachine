var BaseController = Class.extend({
    $scope : null,
    init: function($scope){
        this.$scope = $scope;
    }
});
BaseController.$injector = ['$scope']
