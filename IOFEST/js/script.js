fetch("Data/product.js")
.then(res => res.json())
.then(data => {
    let container = document.querySelector(".produk-container");

    data.forEach(item =>{
        let card = `
            <div class="card">
                <img src="${item.gambar}">
                <h3>${item.nama}</h3>
                <p>Rp ${item.harga}</p>
                <button onclick="tambahKeKeranjang(${item.id})">Pesan</button>
            </div>
        `;
        container.innerHTML += card;
    });
});

function tambahKeKeranjang(id) {
    let card = JSON.parse(localStorage.getItem("cart")) || [];
    cart.push(id);
    localStorage.setItem("cart", JSON.stringify(cart));

    alert("Produk ditambahkan ke keranjang");
}