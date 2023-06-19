
const products = [
    // {
    //     name: "IphoneX",
    //     price: "$500",
    //     category: "Phone",
    //     id:"1"
    // },
    // {
    //     name: "IphoneXS",
    //     price: "$740",
    //     category: "Phone",
    //     id:"2"
    // },
    // {
    //     name: "G102 Mouse Logitech",
    //     price: "$10",
    //     category: "Gear",
    //     id:"3"
    // },
    // {
    //     name: "G102 Mouse Logitech",
    //     price: "$10",
    //     category: "Gear",
    //     id:"4"
    // }
]


function getAllProducts(req, res) {
    res.send(products);
};

function getProducts(req, res) {
    const { id } = req.params;

    const foundProduct = products.find((product) => product.id === id);

    res.send(foundProduct );
}

//
function getProductByNameAndPrice(req,res) {
    const {name , price} = req.query;
    const foundProduct = products.find((product) => (product.name === name) && product.price === price );
    res.send(foundProduct)


}

function createProduct(req,res) {
    const product = req.body;
    
    products.push({...product});
    res.send(products)
}

function createMultiProduct(req,res) {
    const product = req.body;
    for(let i=0; i<product.length;i++){
        products.push({...product[i]});
    }
    
    res.send(products)
}
module.exports = {
    products:getAllProducts,
    test: getProducts,
    nameAndAge: getProductByNameAndPrice,
    create:createProduct,
    createMulti:createMultiProduct
}
