function tambahKeKeranjang(nama, harga) {
    let cart = JSON.parse(localStorage.getItem("cart")) || [];

    cart.push({
        nama: nama,
        harga: harga
    });

    localStorage.setItem("cart", JSON.stringfy(cart));

    alert(nama + "ditambahkan ke keranjang!");
}




[
    {
        "id": 1,
        "nama": "Bubur Ayam Sederhana Baru",
        "harga": 20000,
        "gambar": "images/bubur ayam sederhana baru.jpg"
    },
    
]