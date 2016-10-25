package yyf.designpatterns.composite.comonpent;

public interface AbstractFile {
	void add(AbstractFile f);

	void remove(AbstractFile f);

	void display(int depth);
}
