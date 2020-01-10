PImage catPic;
int acceleration = 5;
int x = 377;
int y = 207;
void setup(){
  size(500,500);
  catPic = loadImage("Cat.jpg");
  catPic.resize(500,500);
  background(catPic);
  
  
  
}
void draw(){
  if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
noStroke();
ellipse(x,y,100,100);
ellipse(x - 90,y,100,100);
fill(#F20A25);
  
  
  
}
void keyPressed() {
  x+= acceleration;
  y+= acceleration;
if(x > width){
background(catPic); 
x = 377;
y = 207;
}
}
  
  
  
  
 
