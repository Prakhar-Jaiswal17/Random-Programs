const prompt=require("prompt-sync")();
const l=prompt("Enter the length of the array : ");
let a=[];
console.log("Enter the elements of the array");
for(let i=0;i<l;i++){
    a[i]=prompt();
}
const s=prompt("Enter the item you want to search : ");
min=0,max=l-1,f=-1;
while(min<=max){
    mid=Math.floor((min+max)/2);
    if(a[mid]==s){
        f=mid;
        break;
    }
    else{
        if(s>a[mid])
            min=mid+1;
        else
            max=mid-1;
    }
}
if(f==-1)
    console.log("Item not in array");
else
    console.log(`Item Found at index : ${f}`);