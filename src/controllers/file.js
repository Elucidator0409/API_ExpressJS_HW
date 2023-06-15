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
const data = require('../file/output2.json')
function filter(req, res, next){
    
    const filters = req.query;
  const filteredUsers = data.filter(user => {
    let isValid = true;
    for (key in filters) {
      console.log(key, user[key], filters[key]);
      isValid = isValid && user[key] == filters[key];
    }
    return isValid;
  });
  res.send(filteredUsers);
}
module.exports = {
    readFile,
    writeFile,
    filter
}
