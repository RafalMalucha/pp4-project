const getProducts = () => {
    return fetch("/api/products").then(response => response.json());
}

const CreateHTMLElementFromString = (template) => {
    let tmpElement = document.createElement('div');
    tmpElement.innerHTML = template.trim();

    return tmpElement.firstChild;
}

const createProductComponent = (product) => {
    const template = `
    <li class="product">
        <span>${product.name}</span>
        <div>
            <span>${product.price}</span>
        </div>
        <button class="product__add-to-cart" data-product-id="${product.id}">Add to cart</button>
    </li>
    `;

    return CreateHTMLElementFromString(template);
}

(() => {
    getProducts().then(products => products.map(p => createProductComponent(p)))
})();

const initializeAddToCartHandler = (el) => {
    const btn = el.querySelector('button.product__add-to-cart');
    btn.addEventListener("click", () => {
        addToCart(btn.getAttribute('data-product-id'))
            .then(refreshCurrentOffer())
    })
}
