/*
console.log("I like pizza");

-----------Datatypes-----------
let firstname = "Luis";
let age = 21;
let student = false;
age + age + 1;
 
console.log("Yoy are", age, "years old.");
console.log("Hello", firstname);
console.log("Enrolled", student);
document.getElementById("p1").innerHTML = "Hello" + firstname;
document.getElementById("p2").innerHTML = "You are" + age + "years old";
document.getElementById("p3").innerHTML = "Enrolled" + student;

-----------USER INPUT------------
let username = window.prompt("What's your name");
console.log(username);

let username;

document.getElementById("myButton").onclick = function(){
    username = document.getElementById("myText").value;
    console.log(username);
    document.getElementById("myLabel").innerHTML = "Hello" + username;

----------SACAR LA HIPOTENUSA-----------

CON JAVASCRIPT

let a;
let b;
let c;

a = window.prompt("Enter side A");
a = number(a);

b = window.prompt("Enter side B");
b = number(b);

c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

console.log("Side C", c);

CON HTML
let a;
let b;
let c;
document.getElementById("submitButton").onclick = function(){
    a = document.getElementById("aTextBox").value;
    a = Number(a);

    b = document.getElementById("bTextBox").value;
    b = Number(b);

    c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

    document.getElementById("clabel").innerHTML = "Side C: " + c;
}
*/
