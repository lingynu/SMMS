package Java2;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManipulatePaths {
	public static void main(String[] args) {
		Path path=FileSystems.getDefault().getPath("C:\\Users\\Administrator\\Documents");
		System.out.println("toString()->"+path.toString());
		System.out.println("getRoot()->"+path.getRoot());
		System.out.println("getName(0)->"+path.getName(0));
		System.out.println("getName(1)->"+path.getName(1));
		System.out.println("getFileName()->"+path.getFileName());
		System.out.println("getNameCount()->"+path.getNameCount());
		System.out.println("getParent()->"+path.getParent());
		System.out.println("subPath(0,2)->"+path.subPath(0,2));
		/*path dir=Paths.get("home\java");
		path music=Paths.get("home\java\jalgg\wrqr");
		Path mp3=Paths.get("jalgg\wrqr");
		System.out.println();
		*/
	}
}
