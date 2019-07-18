/* class Turma {
    constructor(ano) {
        this.ano = ano;
    }

    apresentarAno() {
        console.log(`Essa turma é do ano de: ${this.ano}`);
    }

    static info() {
        console.log("Tesntando informações...");

    }
    get anoTurma() {
        console.log(this.ano);
    }

    set localTurma(localizacao) {
        this.localTurma = localizacao;
    }
}

/* const obj = new Turma("2019/02");
obj.apresentarAno();
obj.anoTurma;
obj.local = "DBC";
console.log(obj.localTurma);

*/
/* 
class Vemser extends Turma {
    constructor(ano, local, qtdAlunos) {
        super(ano);
        this.local = local;
        this.qtdAlunos = qtdAlunos;
    }

    descricao() {
        console.log(`Turma do vem ser ano ${this.ano} realizado na ${this.local}, quantidade de alunos: ${this.qtdAlunos}`);
    }

}
 */
/* const vemser = new Vemser("2019/02","DBC", 17);
vemser.descricao(); */ 

/* let defer = new Promise((resolve, reject) => {
    setTimeout(() =>{
        if(1 === 1){
            resolve("Foi resolvido");
        } else {
            reject("Erro");
        }
    },3000);
})

defer
    .then((data) => {
        console.log("Opa "+data);
        return "Novo resultado"
    })
    .then((data) => {
        console.log(data);
    })
    .catch(erro => console.log(erro)); */

/* let pokemon = fetch('https://pokeapi.co/api/v2/pokemon/');

//pending 
//resolver
//reject

pokemon
    .then((data) => data.json())
    .then(data => {console.log(data.results)})
    .catch(erro => console.log(erro)); */

const valor1 = new Promise((resolve, reject) => {
    setTimeout(() =>{
        resolve({valorAtual: '1'})
    },4000);
})

const valor2 = new Promise((resolve, reject) => {
    resolve({valorAtual: '2'})
})

/* Promise
    .all([valor1, valor2])
    .then(resposta => {
        console.log(resposta);
    }) */

    Promise
    .race([valor1, valor2])
    .then(resposta => {
        console.log(resposta);
    })