$(document).ready(function () {
  $.ajax({
    url: "data.json",
    method: "GET",
    dataType: "json",
    success: function (res) {
      // Cria a row (linha) antes do loop
      $("#catalogo").html('<div class="row row-cols-1 row-cols-md-3 g-4"></div>');

      res.forEach((item) => {
        const cardHTML = `
          <div class="col">
            <div class="card h-80">
              <img src="${item.image}" class="card-img-top h-80" alt="${item.title}">
              <div class="card-body">
                <h5 class="card-title">${item.title}</h5>
                <p class="card-text">Preço: R$ ${item.price.toFixed(2)}</p>
              </div>
              <div class="card-footer">
                <small class="text-body-secondary">Última atualização: agora</small>
              </div>
            </div>
          </div>
        `;

        // Adiciona o card dentro da row criada
        $("#catalogo > .row").append(cardHTML);
      });
    },
    error: function (error) {
      console.log(error);
    },
  });
});
