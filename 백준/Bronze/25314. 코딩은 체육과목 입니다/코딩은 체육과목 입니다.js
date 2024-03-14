const fs = require('fs');
let n = Number(fs.readFileSync('/dev/stdin').toString());

console.log(`${"long ".repeat(n/4) + "int"}`)