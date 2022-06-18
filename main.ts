/***
 * 
 * Interfaces: son aquellas que permiten crear entidades u objetos.
 * Types (Tipados): permite identar alguna variable sea x o y.
 * @param owo returns the sum of a two numbers given.
 * @param interface user returns an object for its use.
 */

function owo(x: number, y: number){
    return x + y;
}

console.log(owo);

interface user{ //OwO
    user: string[];
    pass: string;
    gender: null;
}


type userType = {
    user: string[];
    pass: string;
    gender: null | undefined;
}

class setAdmin implements user{
    user: string[];
    pass: string;
    gender: null;

}

function validateAdmin(){
   if(!setAdmin){
    try{
        console.log("you are not admin");
    }catch(error){
        return;
    }
   } else {
    console.log("Verified admin succesfully");
   }
}