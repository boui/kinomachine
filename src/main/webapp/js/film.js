angular.module("app.controllers", [])
    .controller('EditFilmController', ['$scope', function ($scope) {
        $scope.films = [
            {

                names: ["Transformers", "Трансформеры"],
                description: 'Мдааа',
                productionYear: 1990,
                code: 0001,
                hasDirectorsCut: false,
                allTimesRate: 5,
                tag: ["cool", "wow"],
                actors: ["Johny Depp", "Layza Caddrow"],
                availableQuality: ["hd", "sd"],
                urls: ['http://cs306507.vk.me/v306507247/7327/tKdeS3wezWM.jpg'],
                type: 'film'
            }
        ]
    }]);

