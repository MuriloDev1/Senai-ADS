$(document).ready(function () {
  $.get({
    url: "https://jsonplaceholder.typicode.com/posts",
    dataType: "json",
    success: function (res) {
      $("#posts").html('<div class="row row-cols-1 row-cols-md-3 g-4" id="post-grid"></div>');

      res.forEach((item) => {
        const cardHTML = `
          <div class="col">
            <div class="card h-100">
              <div class="card-header bg-danger">
                <h5 class="card-title text-light">${item.title}</h5>
              </div> 
              <div class="card-body bg-light"> 
                <p class="card-text">${item.body}</p>
              </div>
            </div>
          </div>
        `;
        $("#post-grid").append(cardHTML);
      });

      // Atualiza contador
      $("#total-posts").text(res.length);
    },
    error: function (error) {
      console.log("Erro ao carregar os posts:", error);
    },
  });
});
