function checkEmail() {
    var email = document.getElementById("email").value;
    var textWrongEmail = document.getElementById("textWrongEmail");

    if (email.match(/.+@.+\..+/i)) {
        textWrongEmail.hidden = true;
    } else {
        textWrongEmail.hidden = false;
    }
}