/*
 * Copyright (C) 2011  Joshua Reetz

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */




import java.io.Serializable;

public class ClaySaveBlock implements Serializable {
	
	int x = 0;
	int y = 0;
	int z = 0;
	int delayvalue = 0;
	long intime = 0;
	String world = "world";
	
	ClaySaveBlock(ClayDelay yourblock) {
		this(yourblock.getBlock().getX(),yourblock.getBlock().getY(),
				yourblock.getBlock().getZ(),yourblock.getDelay(), 
				System.currentTimeMillis() - yourblock.getInTime());
	}
		
	ClaySaveBlock(Block yourblock) {
		this(yourblock.getX(),yourblock.getY(),
				yourblock.getZ(), 0, 0);
	}
	
	ClaySaveBlock(Block yourblock, int delay) {
		this(yourblock.getX(),yourblock.getY(),
				yourblock.getZ(), delay, 0);
	}
	
	ClaySaveBlock(Block yourblock, int delay, long timeelapsed) {
		this(yourblock.getX(),yourblock.getY(),
				yourblock.getZ(), delay, timeelapsed);
	}
	
	ClaySaveBlock(int x, int y, int z) {
		this(x, y, z, 0, 0);
	}
	
	ClaySaveBlock(int x, int y, int z, int delay) {
		this(x, y, z, delay, 0);
	}
	
	ClaySaveBlock(int x, int y, int z, int delay, long timeelapsed) {
		this.x = x;
		this.y = y;
		this.z = z;
		delayvalue = delay;
		world = "world";
	}
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @return the z
	 */
	public int getZ() {
		return z;
	}

	/**
	 * @return the delayvalue
	 */
	public int getDelayvalue() {
		return delayvalue;
	}

	/**
	 * @return the intime
	 */
	public long getIntime() {
		return intime;
	}

	/**
	 * @return the world
	 */
	public String getWorld() {
		return world;
	}

}
