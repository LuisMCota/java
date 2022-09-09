//ESTA ES UNA FORMA DE CONSUMIR UNA API
const apifunction = async () =>{
    const responseFromApi = await fetch("https://pokeapi.co/api/v2/pokemon/ditto");
    const jsonResponse = await responseFromApi.json()

    console.log(jsonResponse);
}

apifunction()
