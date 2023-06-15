const children = require('../file/data.json')


const fs = require("fs");

function readFile(req,res){
    console.log("Get data")
    res.json(children)
}

function writeFile(req,res){
    const jsonString = JSON.stringify(children);
    fs.writeFileSync('./output2.json', jsonString, err => {
        if (err) {
            console.log('Error writing file', err)
        } else {
            console.log('Successfully wrote file')
        }
    })
    res.json(children)
}

function filter(req,res){
    
}
module.exports = {
    readFile,
    writeFile,
    filter
}
