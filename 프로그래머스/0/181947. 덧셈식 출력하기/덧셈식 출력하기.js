const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    const [num1, num2]  = input.map(el => Number(el));
    console.log(`${num1} + ${num2} = ${Number(input[0]) + Number(input[1])}`);
});