package com.NHNENTER.ToastRookie.Model;

import java.util.ArrayList;

public class ProtocolData {
	ArrayList<Board> boards;
	String result;
	public static final String SUCCESS = "SUCCESS";
	public static final String FAIL = "FAIL";
	public ArrayList<Board> getBoards() {
		return boards;
	}
	public void setBoards(ArrayList<Board> boards) {
		this.boards = boards;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
