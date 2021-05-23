var Bio = [new Fruit("Apple","Red"),new Fruit("Banana","Yellow"),new Fruit("Pear","Green"),new Fruit("Pineapple","Yellow"),new Fruit("Tomato","Red")];


function Fruit(name, color){

 this.name= name;
 this.color = color;

} 


Fruit.prototype.toString = function(){
    return `${this.name} ${this.color}`
}


var eBio = Bio[Symbol.iterator]();

//Crea
eBio.__proto__.sortColor = function(color){
    console.log("%cFruits found: ","font-size:20px")
   for (const fruit of this) {
       if(fruit.color == color){
           console.log(`${fruit.toString()}`);
           console.log("%c=================================================","color:red");
       }
       
   }
    
}
//Choose which color to sort
eBio.sortColor("Green");
