function checkPassword() {
    var password = document.getElementById("password").value;
    var textLessThan6 = document.getElementById("textLessThan6");
    var textNumbers = document.getElementById("textNumbers");
    var textLetters = document.getElementById("textLetters");
    if (password.length < 6){
        textLessThan6.hidden = false;
    } else {
        textLessThan6.hidden = true;
    }
    
    if (password.match(/[0-9]/)){
        textNumbers.hidden = true;
    } else {
        textNumbers.hidden = false;
    }

    if (password.match(/[a-z]/) || (password.match(/[а-я]/))){
        textLetters.hidden = true;
    } else {
        textLetters.hidden = false;
    }
}

function checkEquals() {
    var password = document.getElementById("password").value;
    var password2 = document.getElementById("password2").value;
    var textEquals = document.getElementById("textEquals");
    var textEqualsCorrect = document.getElementById("textEqualsCorrect");

    if (password2 !== password){
        textEquals.hidden = false;
        textEqualsCorrect.hidden = true;
    } else {
        textEquals.hidden = true;
        textEqualsCorrect.hidden = false;
    }

}