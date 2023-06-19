//SUM TWO NUMBERS
function sumTwoNum(req, res){
    const {a,b} = req.query;
    var num1 = parseInt(a, 10);
    var num2 = parseInt(b, 10);
    const sum = num1+num2;
    res.send(sum.toString());
    
}

//CHECK PRIMARY
function checkPrimary(req,res){
    const {a} = req.query;
    var number = parseInt(a,10)
    let isPrime = true;

    // check if number is equal to 1
    if (number === 1) {
        res.send("1 is neither prime nor composite number.");
    }

    // check if number is greater than 1
    else if (number > 1) {

        // looping through 2 to number-1
        for (let i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            res.send(`${number} is a prime number`);
        } else {
            res.send(`${number} is a not prime number`);
        }
    }

    // check if number is less than 1
    else {
        res.send("The number is not a prime number.");
    }
}

//Find MAX in array
function checkMaxInArray(req,res){
    var arr = req.query.array.split(','); // http://server/url?array=foo,bar
    var maxValue = 0;

    for (item of arr) {
        // find minimum value
        var check = parseInt(item,10)
        
        // find maximum value
        if (check > maxValue)
            maxValue = check;
    }

    res.send(`Max of array ${arr}     is ${maxValue.toString()}`)
 
}   

//Reverse array
function reverseArray(req,res){
    var arr = req.query.array.split(','); // http://server/url?array=foo,bar
    var temp = ''
    var reversedArray = []
    for (let i = 1;i<=arr.length/2;i++) {
        temp = arr[i-1];
        arr[i-1] = arr[arr.length-(i)];
        arr[arr.length-i] = temp;
    }
    const result = JSON.stringify(arr)
    res.send(result)
}   

//Palindrome Check
function palindromeCheck(req,res){
    const {str} = req.query;
    const string = JSON.stringify(str)
    
    var reverseStr = "";
    
    var strLength = string.length;

    for (let i = (strLength - 1); i >=0; --i) {
        reverseStr = reverseStr + string.charAt(i);
      }

      if(string.toLowerCase() === reverseStr.toLowerCase()){
        res.send(`${string} is a Palindrome String.`)
      } else {
        res.send(`${string} is  not a Palindrome String.`)
      }
}

function getOccurrence(req,res){
    var arr = req.query.array.split(','); // http://localhost:8000/v1/getOccurrence?array=1,2,3,1,4&value=1
    const {value} = req.query;
    var count = 0;
    console.log(typeof value)
    arr.forEach((v) => (v == value && count++));
    res.send(count.toString());
}

function makeRandomString(req,res)
{
    const {length} = req.query;
    const lengthStr = parseInt(length,10)
    var text = "";
    var char_list = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    for(let i=0; i < lengthStr; i++ )
    {  
        console.log(i)
        text += char_list.charAt(Math.floor(Math.random() * char_list.length));
        
    }
    console.log("run")
    res.send(text.toString())
    }

function factorialOfNumber(req,res){
    const {number} = req.query;
    const num = parseInt(number,10)
    var sum = 1;
    for(let i=1; i<=num;i++){
        sum *= i;
    }
    res.send(`Factorial of ${number} is ${sum.toString()}`)
}

function ascendingArray(req,res){
    var arr = req.query.array.split(',');
    var result = [];
    for (var i = 0; i < arr.length; i += 1) {
        result.push(parseInt(arr[i],10));
    }

    for (var i = 0; i < result.length; i ++ ){
        for(let j = 0; j < result.length - i - 1; j++){
            if(result[j + 1] < result[j]){

                //Swapping
                [result[j + 1],result[j]] = [result[j],result[j + 1]]
            }
        }
    }
    res.send(` Array sorted ascending: ${result}`)
}


/// ANAGRAM CHECK ///
// hàm helper để build một object làm nơi lưu trữ
const buildCharObject = str => {
    const charObj = {}
    for(let char of str.replace(/[^\w]/g).toLowerCase()) {
      charObj[char] = charObj[char] + 1 || 1
    }
    return charObj
    }

function checkAnagram(req,res){
    // hàm chính
    const {strA, strB} = req.query;
    // lưu giá trị của strA vào object
    const aCharObject = buildCharObject(JSON.stringify(strA))
    console.log(aCharObject)
    // lưu giá trị strB vào object
    const bCharObject = buildCharObject(JSON.stringify(strB))
  
    // so sánh độ dài giữa 2 object
    if(Object.keys(aCharObject).length !== Object.keys(bCharObject).length) {
        res.send("false") 
    }
    // đã chắc chắn về length giống nhau
    // kiểm tra tiếp số lượng các ký tự có giống nhau
    for(let char in aCharObject) {
      if(aCharObject[char] !== bCharObject[char]) {
        res.send("false") 
      }
    }
    res.send("true") 
}

function bookObj(req,res){
    const {title,author,year} = req.query;
    
    let books = []
    let book = {title:title, author:author, year:year};
    books.push(book)
    res.send(books)
    
}

function rectangleObj(req,res){
    const {width,height} = req.query;
    w= parseInt(width,10)
    h= parseInt(height,10)
    let area = w*h;
    let rectangles = []
    
    let rectangle = {width:w, height:h, area:area};
    rectangles.push(rectangle)
    res.send(rectangle)
    
}

function evenArray(req,res){
    var arr = req.query.array.split(',');
    var result = [];
    var evenArray = []
    for (var i = 0; i < arr.length; i += 1) {
        result.push(parseInt(arr[i],10));
    }

    console.log(result)
    for (var i = 0; i < result.length; i ++ ){
       if(result[i]%2 == 0){
        
        evenArray.push(result[i])
       }
    }
    res.send(` Array sorted even: ${evenArray}`)
}

function getRndInteger(req, res) {
    const {min,max} = req.query;
    
    var num = Math.floor(Math.random() * (parseInt(max,10) - parseInt(min,10) + 1) ) 
    + parseInt(min,10);

    res.send(num.toString())
  }

  function perfectNumber(req,res){
    const {number} = req.query;
    const num = parseInt(number,10)
    var sum = 0;
    for(let i=1; i<=num/2;i++){
        if(num%i==0){
            sum+=i
        }
    }
    if (sum == number){
        res.send("Perfect number")
    } else{
        res.send("Not a Perfect number")
    }
}


function reverseString(req,res){
    
    const { string } = req.query;
    str = JSON.stringify(string);

    //METHOD1
    // let splitString = str.split("");
    // let reverseArray = splitString.reverse();

    // let joinArray = reverseArray.join("");    



    //METHOD2:
    var newString = "";
    for (var i = str.length - 1; i >= 0; i--) {
        newString += str[i];
    }
    
    res.send(newString)
}

function fizzbuzz(req,res){
    const {number} = req.query;
    const num = parseInt(number,10) 

        if( (num%3==0) && (num%5==0) ){
           return res.send("FizzBuzz")
        } else  if(num%3==0) { 
             
            return  res.send("Fizz")
            } 
        else if(num%5==0){
            return res.send("Buzz")
        } else{
            return res.send("Empty")
        }
    
}

function findIndex(req,res){
    
    const {array,position} = req.query;
    
    var result = array.charAt(position-1)
    
    res.send(result)
}   

module.exports = {
    sumTwoNum,
    checkPrimary,
    checkMaxInArray,
    reverseArray,
    palindromeCheck,
    getOccurrence,
    makeRandomString,
    factorialOfNumber,
    ascendingArray,
    checkAnagram,
    bookObj,
    rectangleObj,
    evenArray,
    getRndInteger,
    perfectNumber,
    reverseString,
    fizzbuzz,
    findIndex
}