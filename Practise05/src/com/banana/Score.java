package com.banana;
import java.io.*;
public interface Score {

	public int insert() throws IOException;
	public int update() throws IOException;
	public int  search() throws IOException;
	public int delete() throws IOException;
	public void writeAll();
	public void writeSort();
	
	
}
