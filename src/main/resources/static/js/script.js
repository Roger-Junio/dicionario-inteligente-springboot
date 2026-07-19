

function botaoBusca() {

     const inputTermo = document.getElementById("inputTermo").value;

     const url = `http://localhost:9090/api/pesquisar?palavra=${inputTermo}`;
     console.log(url);

                    //metodo get para busca palavra
                fetch(url)
                    .then(resposta => resposta.json())
                    .then(dados => {

       
                            document.getElementById("resultado").innerHTML = `
                            <h2>${dados.palavra}</h2>
                            <p>${dados.significado}</p>`;

    });
}


    function cadastrar() {

        const palavra   = document.getElementById("inputPalavra").value;
        const significado = document.getElementById("inputSignificado").value;

        if (palavra === "" || significado === "") {
            alert("Preencha todos os campos.");
    return;
        }

        const palavraObjeto = {
            palavra: palavra,
            significado: significado
        }

        fetch("http://localhost:9090/api/cadastrar", {

    method: "POST",
    headers: {
        "Content-Type": "application/json"
    },

    body: JSON.stringify(palavraObjeto)

})
    .then(response => response.json())
    .then(dados => {

         document.getElementById("resultado").innerHTML =
        "✅ Palavra cadastrada com sucesso!";
        
        //limpando os campos apos ENTER
        document.getElementById("inputPalavra").value = "";
        document.getElementById("inputSignificado").value = "";
        //Voltando o cursor apos LIMPA 
        document.getElementById("inputPalavra").focus();

    })

    .catch(error => {
        document.getElementById("resultado").innerHTML =
        "❌  Erro ao cadastras a palavra";
    });

}
