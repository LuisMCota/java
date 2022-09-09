let count = 0;

document.getelementById("decreaseBtn").onclick = function(){
    count-=1;
    document.getElementById("countLabel").innerHTML = count;
}
document.getelementById("resetBtn").onclick = function(){
    count=0;
    document.getElementById("countLabel").innerHTML = count;  
}
document.getelementById("increaseBtn").onclick = function(){
    count+=1;
    document.getElementById("countLabel").innerHTML = count;
}