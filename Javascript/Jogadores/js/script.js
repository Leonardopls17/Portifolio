//dom



const bt01 = document.querySelector('#neymar')
const bt02 = document.querySelector('#cristiano')
const bt03 = document.querySelector('#messi')

//eventos


bt01.addEventListener('click', neymar)
bt02.addEventListener('click', cristiano)
bt03.addEventListener('click', messi)

//funções

function neymar() {
    fundobranco.src = 'images/Neymar.jpg'
}
function cristiano() {
    fundobranco.src = 'images/cristiano ronaldo.jpg'
}
function messi() {
    fundobranco.src = 'images/messi.jpg'
}
