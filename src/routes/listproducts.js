const express = require('express');
const router = express.Router();
const productsControllers = require('../controllers/listproducts')

router.get('/products', productsControllers.products);

router.get('/products/:id', productsControllers.test);

router.get('/getProductByNameAndPrice', productsControllers.nameAndAge);


// create user
router.post('/createProduct', productsControllers.create);

router.post('/createMultiProduct', productsControllers.createMulti);
module.exports = router;