package Java2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class PathDemo2 {//ͨ������Ŀ¼�Ĵ���ʱ����ȷ���Ƿ�ɾ�����ļ�
	public static void delDayOldFile(String fileName)throws IOException {
		Path file=Paths.get(fileName);
		BasicFileAttributes attr=Files.readAttributes(file, BasicFileAttributes.class);
		FileTime fileCreationTime=attr.creationTime();
		long currentTime=System.currentTimeMillis();
		FileTime delDayOldFile=FileTime.fromMillis(currentTime-(24*60*60*1000));
		if(fileCreationTime.compareTo(delDayOldFile)<0)
			Files.delete(file);
	}
}
