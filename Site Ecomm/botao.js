const btnMobile = document.getElementById('btn-mobile');

function toggleMenu(){
    const nav= btnMobile = document.getElementById('nav');
    nav.classList.toggle('active');
}

btnMobile.addEventListener('click',toggleMenu);