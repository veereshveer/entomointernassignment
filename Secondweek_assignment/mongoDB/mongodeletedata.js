var MongoClient = require('mongodb').MongoClient;
var url = "mongodb://localhost:27017/";

MongoClient.connect(url,function(err, db) {
    if (err) throw err;
    console.log("Database connected!");
    var dbo = db.db("mydb");
    dbo.collection("customers").remove({name: 'Kiran'});
    var results = dbo.collection("customers").find({ name: 'Kiran'});
    if(results.count==0){
        console.log('No record found');
    }
    results.forEach(row => {
        console.log(row);
    });
  db.close();
});