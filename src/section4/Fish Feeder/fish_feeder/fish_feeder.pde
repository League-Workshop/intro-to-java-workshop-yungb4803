int foodX = 100;
int foodY = 20;
void setup(){
  size(500,500);
  
  
  
}


void draw(){
  background(141,233,237);

fill(#6E7179);
noStroke();
ellipse(foodX, foodY, 10,10);
  foodY+=5;
  if(foodY > height){
    foodY = 0;
    foodX = (int) random(width-20);
  
  } 
  
}
