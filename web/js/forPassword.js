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