function validate()
{
var username = document.getElementById("tx").value;
var password = document.getElementById("pd").value;
if ( username == "benson" && password == "123"){
alert ("Login successfully");
window.location = "home.html"; // Redirecting to other page.
return false;
}
else{
var attempt --;// Decrementing by one.
alert("You have left "+attempt+" attempt;");
// Disabling fields after 3 attempts.
if( attempt == 0){
document.getElementById("tx").disabled = true;
document.getElementById("pd").disabled = true;
document.getElementById("submit").disabled = true;
return false;
}
}
}