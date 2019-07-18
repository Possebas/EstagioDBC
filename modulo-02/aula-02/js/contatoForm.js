/* Criar um formulário de contato no site de vocês (Nome, email, telefone, assunto), 
ao sair do input de nome tem que garantir que tenha no minimo 10 caracteres, garantir
que em email tenha @ e ao clicar no botão de enviar tem que garantir que não tenha 
campos em branco. */

let inputName = document.getElementById('name')
let inputEmail = document.getElementById('email')
let inputSubject = document.getElementById('subject')
let inputMessage = document.getElementById('message')

inputName.addEventListener('blur', () => {
    if(inputName.value.length < 10) inputName.focus();
});

inputEmail.addEventListener('blur', () => {
    if(!inputEmail.value.includes('@')) inputEmail.focus();
})


function validarCamposEmBranco() {
    if( !(
            inputName.value.length > 0 && 
            inputEmail.value.length > 0 &&
            inputSubject.value.length > 0 &&
            inputMessage.value.length > 0
        )
    ){
        alert("Contém campos vazios");
    }
    
}
