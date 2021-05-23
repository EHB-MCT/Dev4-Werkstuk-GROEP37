var Bio = [new Fruit("Apple","Red"),new Fruit("Banana","Yellow"),new Fruit("Pear","Green"),new Fruit("Pineapple","Yellow"),new Fruit("Tomato","Red")];



//Array with products ex:fruits which has a name and a color field
var Bio = [new Fruit("Apple","Red"),new Fruit("Banana","Yellow"),new Fruit("Pear","Green"),new Fruit("Pineapple","Yellow"),new Fruit("Tomato","Red")];

//Pure function with no side effects
function Fruit(name, color){

 this.name= name;
 this.color = color;

} 

//Function to print endresult as a String
Fruit.prototype.toString = function(){
    return `${this.name} ${this.color}`
}


var eBio = Bio[Symbol.iterator]();


//Create the filter and print the name of the fruit that has that color
eBio.__proto__.sortColor = function(color){
    console.log("%cFruits found: ","font-size:20px")
    //Forof eof the array 

   for (const fruit of this) {
       if(fruit.color == color){
           console.log(`${fruit.toString()}`);
           console.log("%c=================================================","color:red");
       }
       
   }
    
}


//Choose which color to sort
eBio.sortColor("Green");
