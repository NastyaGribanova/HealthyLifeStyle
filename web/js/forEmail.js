function checkEmail() {
    var email = document.getElementById("email").value;
    var textWrongEmail = document.getElementById("textWrongEmail");

    if (email.match(/.+@.+\..+/i)) {
        textWrongEmail.hidden = true;
    } else {
        textWrongEmail.hidden = false;
    }
}

function checkEmail2() {
    var email = document.getElementById("email2").value;
    var textWrongEmail = document.getElementById("textWrongEmail2");

    if (email.match(/.+@.+\..+/i)) {
        textWrongEmail.hidden = true;
    } else {
        textWrongEmail.hidden = false;
    }
}