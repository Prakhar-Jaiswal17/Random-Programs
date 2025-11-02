const prompt = require('prompt-sync')();
const a=prompt("Enter the size of the triangle : ");
for(let i=0;i<a;i++){
    for(let j=a-1;j>i;j--){
        process.stdout.write(" ");
    }
    for(let j=0;j<=i;j++){
        process.stdout.write("* ");
    }
    console.log();
}