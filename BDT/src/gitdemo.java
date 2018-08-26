import java.io.File;

import org.eclipse.jgit.*;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Repository;
public class gitdemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file=File.createTempFile("RepositorythroughJava", "");
		Git git=Git.open(file);
		Repository repo=git.getRepository();

	}

}
