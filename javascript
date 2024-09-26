function somaPares(array){
    return array.filter(function(numero){
        return numero % 2 === 0; //filtra apenas os números pares
    })

.reduce(function(soma, numero){
    return soma + numero; //Soma os números pares
}, 0);
}
let numeros = [1, 2, 3, 4, 5 , 6];
let resultado = somaPares(numeros);
console.log(resultado); //Saída: 120

function calcularMedia(array){
    let soma = array.reduce(function(total, numero){
        return total + numero;
    }, 0);

    return soma / array.lenght;
}

let media = calcularMedia(numeros);
console.log(media);

function contemElemento(array, elemento){
    return array.includes(elemento);
}

let frutas = ["maçã", "banana", "laranja"];
console.log(contemElemento(frutas, "banana"));
console.log(contemElemento(frutas, "uva"));

function ordenarCrescente(array){
    return array.sort(function(a, b){
        return a - b;
    });
}

let ordenado = ordenarCrescente(numeros);
console.log(ordenado);

function multiplicarPor(array,multiplicador){
    return array.map(function(numero){
        return numero * multiplicador;
    });
}

let multiplicacao = multiplicarPor(numeros, 3);
console.log(resultado);

function contarOcorrencias(array, elemento){
    return array.reduce(function(contador, valorAtual){
        return valorAtual === elemento ? contador + 1 : contador;
    }, 0);
}

let ocorrencias = contarOcorrencias(numeros, 1);
console.log(ocorrencias);

function inverterArray(array){
    return array.reverse();
}

let invertido = inverterArray(numeros);
console.log(invertido);
