

function botaoBusca() {

    const inputTermo = document.getElementById("inputTermo").value;

     const url = `http://localhost:9090/api/pesquisar?palavra=${inputTermo}`;
     console.log(url);

   fetch(url)
    .then(resposta => resposta.json())
    .then(dados => {

       
        document.getElementById("resultado").innerHTML = `
        <h2>${dados.palavra}</h2>
        <p>${dados.significado}</p>
`;

    });

    
}

