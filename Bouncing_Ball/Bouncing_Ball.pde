int x=50;
int y=100;
int yspeed=2;
int xspeed=1;
void setup() {
  size(400, 400);
}

void draw() {
  background(#F01F2D);
  ellipse(x, y, 100, 100);
  x=x+xspeed;
  y=y+yspeed;
  if (x>width) {
    xspeed=-xspeed;
  }
  if (x<0) {
    xspeed=-xspeed;
  }
  if (y>height) {
    yspeed=-yspeed;
  }
  if (y<0) {
    yspeed=-yspeed;
  }
}
