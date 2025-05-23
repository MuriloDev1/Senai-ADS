$(document).ready(() => {
    const totalPokemons = 168;

    for (let id = 1; id <= totalPokemons; id++) {
        $.getJSON(`https://pokeapi.co/api/v2/pokemon/${id}`, function(response) {

            // Adiciona os dados em cada linha da tabela
            $("#row-id").append(`<td>${response.id}</td>`);
            $("#row-name").append(`<td class="text-capitalize">${response.name}</td>`);
            $("#row-img").append(`<td><img src="${response.sprites.front_default}" alt="${response.name}"></td>`);
            $("#row-height").append(`<td>${response.height} m</td>`);
            $("#row-weight").append(`<td>${response.weight} kg</td>`);
            $("#row-species").append(`<td class="text-capitalize">${response.species.name}</td>`);
        });
    }
});

