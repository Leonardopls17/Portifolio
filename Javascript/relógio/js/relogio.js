//dom

const horas = document.querySelector('#horas')
const minutos = document.querySelector('#minutos')
const segundos = document.querySelector('#segundos')
const dia = document.querySelector('#dia')
const mes = document.querySelector('#mes')
const ano = document.querySelector('#ano')
const saudacao = document.querySelector('#texto') 
const fundo = document.querySelector('body')

//eventos

setInterval(relogio, 1000)

//função

function relogio() {

    let day = new Date()

    let h = day.getHours()
    let m = day.getMinutes()
    let s = day.getSeconds()
    let dd = day.getDate()
    let mm = day.getMonth() + 1
    let aa = day.getFullYear()

    if (h < 10) {
        h = "0" + h
    }

    if (m < 10) {
        m = "0" + m
    }

    if (s < 10) {
        s = "0" + s
    }
    
    if (dd < 10) {
        dd = "0" + dd
    }
    if (mm < 10) {
        mm = "0" + mm
    }
    
    if(h >= 5 && h < 12){
        saudacao.textContent = "Bom dia! 🌅"
        fundo.className = "dia"
        
    }else if(h >= 12 && h < 18){
        saudacao.textContent = "Boa Tarde! ☀️"
        fundo.className = "dia"
    }else{
        saudacao.textContent = "Boa Noite! 🌛"
        fundo.className = "noite"
    }
    
    horas.textContent = h
    minutos.textContent = m
    segundos.textContent = s
    dia.textContent = dd
    mes.textContent = mm
    ano.textContent = aa

}