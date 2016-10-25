package yyf.designpatterns.composite;

import yyf.designpatterns.composite.comonpent.AbstractFile;
import yyf.designpatterns.composite.composite.Folder;
import yyf.designpatterns.composite.leaf.ImageFile;
import yyf.designpatterns.composite.leaf.TextFile;
import yyf.designpatterns.composite.leaf.VideoFile;

/**
 * 测试组合模式
 * 
 * @author Yu Yufeng
 *
 */
public class Test {

	public static void main(String[] args) {
		AbstractFile folder1 = new Folder("文件夹1");
		AbstractFile folder2 = new Folder("文件夹2");
		AbstractFile folder3 = new Folder("文件夹3");
		AbstractFile folder4 = new Folder("文件夹4");

		AbstractFile image1 = new ImageFile("图片1");
		AbstractFile image2 = new ImageFile("图片2");
		AbstractFile video1 = new VideoFile("视频1");
		AbstractFile text1 = new TextFile("文本1");

		folder1.add(folder2);
		folder1.add(folder3);
		folder3.add(text1);

		folder2.add(folder4);
		folder2.add(image1);
		folder2.add(image2);

		folder4.add(video1);

		folder1.display(0);
	}

}
