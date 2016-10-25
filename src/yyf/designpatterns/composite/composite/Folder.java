package yyf.designpatterns.composite.composite;

import java.util.ArrayList;
import java.util.List;

import yyf.designpatterns.composite.comonpent.AbstractFile;

public class Folder implements AbstractFile {
	private String fileName;
	List<AbstractFile> list = new ArrayList<>();

	public Folder(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void add(AbstractFile f) {
		list.add(f);
	}

	@Override
	public void remove(AbstractFile f) {
		list.remove(f);
	}

	@Override
	public void display(int depth) {
		/**
		 * 为了显示层次效果所以增加了depth
		 */
		for (int i = 0; i < depth; i++) {
			System.out.print("  ");
		}
		System.out.println("|" + fileName);

		for (AbstractFile f : list) {
			f.display(depth + 2);
		}
	}

}
