const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    let str = Number(input[0]);
    let evenodd = str % 2 == 0 ? 'even' :'odd';
    console.log(str + " is " +evenodd);
});