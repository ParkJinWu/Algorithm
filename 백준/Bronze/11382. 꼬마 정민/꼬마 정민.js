const fs = require("fs");
const file = process.platform === "linux" ? "dev/stdin" : "./text.txt";

const input = fs.readFileSync(file).toString().trim().split(" ");

const a = input[0];
const b = input[1];
const c = input[2];

console.log(Number(a) + Number(b) + Number(c))