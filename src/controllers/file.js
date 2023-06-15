const childrens = require('../file/data.json')


const fs = require("fs");

function readFile(req,res){
    console.log("Get data")
    res.json(childrens)
}

function writeFile(req,res){
    const jsonString = JSON.stringify(childrens);
    fs.writeFileSync('./output2.json', jsonString, err => {
        if (err) {
            console.log('Error writing file', err)
        } else {
            console.log('Successfully wrote file')
        }
    })
    res.json(childrens)
}
const data = require('../file/output2.json')
function filter(req, res){
    const reqCountry = req.params.country;
    console.log('reqCountry: ', reqCountry)
    console.log(childrens.children[0].children)
    
}
module.exports = {
    readFile,
    writeFile,
    filter
}
