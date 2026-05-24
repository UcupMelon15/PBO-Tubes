let cart = JSON.parse(localStorage.gerItem("cart")) || [];

let container = document.getItemById("cart-container");
let total = 0;

cart.forEach(item => {
    container.innerHTML += `
        <p>${item.nama} - Rp ${item.harga}</p>
    `;
    total += item.harga;
});

document.getItemById("total").innerHTML = "Total: Rp " + total;