var MongoClient = require('mongodb').MongoClient;
// Connect to the db
MongoClient.connect("mongodb://localhost:27017", function (err, client) {
    
var db = client.db('nodeDemo');
    //db.collection('Persons').insertOne({ id: 1, firstName: 'Steve', lastName: 'Jobs' });
    var arr = [{ id: 1, firstName: 'Steve', lastName: 'Jobs' },
    { id: 2, firstName: 'Bill', lastName: 'Gates' }];
    
    db.collection('Persons').insertMany(arr, function (err, res) {
        if (err) throw err;  
        console.log('no. of records inserted '+res.insertedCount);
        client.close();
    });
                
});