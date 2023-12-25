document.getElementById("btnSubmit").addEventListener("click", () => {
    additems();
})

function additems() {

    let name = document.getElementById("txtName").value;
    let price = document.getElementById("txtPrice").value;

    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");

    var raw = JSON.stringify({
        "name": name,
        "price": price
    });

    var requestOptions = {
        method: 'POST',
        headers: myHeaders,
        body: raw,
        redirect: 'follow'
    };

    
fetch("http://localhost:8080/item/add-items", requestOptions)
.then(response => response.text())
.then(result => console.log(result))
.catch(error => console.log('error', error));


}


document.getElementById("btnGetItems").addEventListener("click", () => {
    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");

    var requestOptions = {
        method: 'GET',
        headers: myHeaders,
        redirect: 'follow'
    };

    fetch("http://localhost:8080/item/get-items", requestOptions)
        .then(response => response.json())
        .then(result => {
            document.getElementById("lblName").innerHTML = result["0"]["name"];
            document.getElementById("lblPrice").innerHTML = result["0"]["price"];
        }
        )
        .catch(error => console.log('error', error));
})