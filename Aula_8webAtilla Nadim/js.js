function traduzir() {
    let input = document.getElementById('termo').value.toLowerCase();
    let output = document.getElementById('traducao');
   
    const palavras = [
        ["branco", "white"],
        ["preto", "black"],
        ["vermelho", "red"],
        ["marrom", "brown"],
        ["amarelo", "yellow"],
        ["violeta", "violet"],
        ["rosa", "pink"]
    ];

    for (palavra of palavras) {
        palavra = palavra.map(p => p.toLowerCase());
        if (palavra.includes(input)) {
            if (palavra.indexOf(input) == 0) {
                output.value = palavra[1];
            }else {
                output.value = palavra[0];
            }
        }
    }

    document.getElementById('termo').value = '';
}