//dom

const lampada = document.querySelector('#lampada')
const bt01 = document.querySelector('#ligar')
const bt02 = document.querySelector('#desligar')

//eventos

bt01.addEventListener('click', ligar)
bt02.addEventListener('click', desligar)

//funções

function ligar(){
    lampada.src = 'images/acesa.gif'
}
function desligar(){
    lampada.src = 'images/apagada.gif'
}