var isClicked = false;

function showSlider() {
    var slider = document.getElementById("slider");
    if(!isClicked){
        isClicked = true;
        slider.hidden = false;
    } else {
        isClicked = false;
        slider.hidden = true;
    }
}

var isClickedButton = false;
function showDescription(n) {
    var description = document.getElementById("description" + n);
    if(!isClickedButton){
        isClickedButton = true;
        description.hidden = false;
    } else {
        isClickedButton = false;
        description.hidden = true;
    }
}

function getDate() {
    n = new Date();
    y = n.getFullYear();
    m = n.getMonth() + 1;
    d = n.getDate();
    document.getElementById("date").innerHTML = "Daily information for " + d + "." + m + "." + y;
}