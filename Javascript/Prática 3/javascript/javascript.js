//dom

const bt01 = document.querySelector('#neymar')
const bt02 = document.querySelector('#cristiano')
const bt03 = document.querySelector('#messi')
const bt04 = document.querySelector('#haland')
const bt05 = document.querySelector('#mbappe')
const bt06 = document.querySelector('#jude')

//eventos

bt01.addEventListener('click', neymar)
bt02.addEventListener('click', cristiano)
bt03.addEventListener('click', messi)
bt04.addEventListener('click', haland)
bt05.addEventListener('click', mbappe)
bt06.addEventListener('click', jude)

//funções

function neymar(){
    fundobranco.src = 'images/Neymar.jpg'
}
function cristiano(){
    fundobranco.src = 'images/cristiano ronaldo.jpg'
}
function messi(){
    fundobranco.src = 'images/messi.jpg'
}
function haland(){
    fundobranco.src = 'images/Haland.jpg'
}
function mbappe(){
    fundobranco.src = 'images/Mbappe.jpg'
}
function jude(){
    fundobranco.src = 'images/Jude Bellingham.jpg'
}