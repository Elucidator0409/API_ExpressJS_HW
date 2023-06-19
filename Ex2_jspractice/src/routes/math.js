const express = require('express');
const router = express.Router();
const mathControllers = require('../controllers/math')

router.get('/sumTwoNum', mathControllers.sumTwoNum);

router.get('/checkPrimary', mathControllers.checkPrimary);

router.get('/checkMaxInArray', mathControllers.checkMaxInArray);

router.get('/reverseArray', mathControllers.reverseArray);

router.get('/palindromeCheck', mathControllers.palindromeCheck);

router.get('/getOccurrence', mathControllers.getOccurrence);

router.get('/makeRandomString', mathControllers.makeRandomString);

router.get('/factorialOfNumber', mathControllers.factorialOfNumber);

router.get('/ascendingArray', mathControllers.ascendingArray);

router.get('/checkAnagram', mathControllers.checkAnagram);

router.get('/bookObj', mathControllers.bookObj);

router.get('/rectangleObj', mathControllers.rectangleObj);

router.get('/evenArray', mathControllers.evenArray);

router.get('/getRndInteger', mathControllers.getRndInteger);

router.get('/perfectNumber', mathControllers.perfectNumber);

router.post('/reverseString', mathControllers.reverseString);

router.post('/fizzbuzz', mathControllers.fizzbuzz);

router.post('/findIndex', mathControllers.findIndex);
router.post('', );


module.exports = router;