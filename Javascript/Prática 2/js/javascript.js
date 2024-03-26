//dom

const lampada = document.querySelector('#lampada')
const bt01 = document.querySelector('#ligar')
const bt02 = document.querySelector('#desligar')


//eventos

bt01.addEventListener('click', ligar)
bt02.addEventListener('click', desligar)
bt01.addEventListener('dblclick', quebrar)
bt02.addEventListener('dblclick', quebrar)

//funções

function ligar(){
    lampada.src = 'images/Acesa.jpg'
}
function desligar(){
    lampada.src = 'images/Apagada.jpg'
}
function quebrar(){
    lampada.src = 'images/quebrada.jpg'
}