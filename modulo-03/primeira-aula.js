//console.log("Cheguei")

//console.log(teste1);
var teste = "123";
let teste1 = "1233";
const teste2 = 1222;

var teste = "1111";
//teste1 = "222";
//teste2 = "aqui";
//console.log(teste2);

//console.log(teste1);

// {
//     let teste1 = "Aqui mudou";
//     console.log(teste1);
// }


const pessoa = {
    nome: "Gustavo",
    idade: 21,
    endereco: {
        logradouro: "Rua da esquerda",
        numero: 123
    }
};

Object.freeze(pessoa);

pessoa.nome = "Gustavo M"

//console.log(pessoa.nome);

function somar(valor1, valor2) {
    console.log(`${valor1}` + valor2);
}

//somar(1, 3);

function ondeMoro(cidade) {
    //console.log("Eu moro em " + cidade + " e sou muito feliz");
    console.log(`Eu moro em ${cidade} e sou muito feliz`);
}

//ondeMoro("Porto Alegre");

function fruteira() {
    let texto = "Banana" + "\n"
        + "Goiaba" + "\n"
        + "Laranja" + "\n";

    let newTexto = 
`Banana
Goiaba
Laranja`;

    console.log(newTexto);
}

//fruteira();

function quemSou(pessoa) {
    //console.log("Eu moro em " + pessoa + " e sou muito feliz");
    console.log(`Meu nome é ${pessoa.nome} e tenho ${pessoa.idade}`);
}

//quemSou(pessoa);

let funcaoSomarVr = function(a, b, c = 0){
    return a + b + c;
}

let add= funcaoSomarVr;
let resultado = add(3,2);
//console.log(resultado);

const { nome: n, idade:i } = pessoa;
const { endereco: { logradouro, numero } } = pessoa;
//console.log(n, i);
//console.log(logradouro,numero);

const array = [1, 3, 4, 8];
const [ n1, , n2, , n3 = 9] = array;
//console.log(n1, n2, n3);

function testarPessoa( {nome, idade} ){
    console.log(nome, idade, endereco);
}

//testarPessoa(pessoa);

let a1 = 42;
let b1 = 15;

console.log(a1, b1);

[a1,b1] = [b1,a1];

console.log(a1, b1);
