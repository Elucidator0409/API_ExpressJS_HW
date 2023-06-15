const express = require('express') ;
const app = express();


const port = 8000;

const productsRouter = require('./routes/listproducts');
const filesRouter = require('./routes/file');
app.use(express.json());
app.use(express.urlencoded({extended: true}));



app.use('/v1/', productsRouter);

app.use('/v1/', filesRouter);




app.get('/message/:msg', (req, res) => {
    let msg = req.params.msg;
    console.log("Message: ", msg);
    res.send('Message is sent...');
})

app.get('/',(req,res) => {res.send('Hello 1234!')});

app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
})
