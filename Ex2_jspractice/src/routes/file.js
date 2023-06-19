const express = require('express');
const router = express.Router();
const fileControllers = require('../controllers/file')

router.get('/file', fileControllers.readFile);
router.get('/file/filter/:country', fileControllers.filter);

router.post('/file', fileControllers.writeFile);


module.exports = router;