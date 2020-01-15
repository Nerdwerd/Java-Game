package main;

import java.awt.*;

public abstract class Objects {
	
		protected int posx;
		protected int posy;
		protected ID id;
		protected boolean moving;
		protected boolean animated;
	
		public Objects(int x, int y, ID id, boolean moving, boolean animated) {
			this.posx = x;
			this.posy = y;
			this.id = id;
			this.moving = moving;
			this.animated = animated;
		}
		
		public abstract void tick();
		public abstract void renderer(Graphics g);
}
