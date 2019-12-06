PImage hat;
PImage mustache;
PImage friend;
void setup() {
friend=loadImage("Peppa Pig.jpg");
mustache=loadImage("mustache.png");
hat=loadImage("hat.jpg");
size (800,600);
friend.resize(width,height);
}

void draw() {
background(friend); 

if(mousePressed){
  image(mustache,mouseX-50,mouseY-50,100, 100);
if(mouseButton == RIGHT) {
 image(hat,100,100,300,300); 
}
}

}
