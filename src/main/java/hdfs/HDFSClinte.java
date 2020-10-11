package hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;

/**
 * @author fengzhuo
 * @create 2020-10-02 22:38
 */
public class HDFSClinte {
    @Test
    public void put() throws IOException, InterruptedException {
        FileSystem fileSystem = FileSystem.get(URI.create("hdfs://hadoop102:9000"),new Configuration(),"fengzhuo");
        fileSystem.copyFromLocalFile(new Path("D:\\生日.jpg"),new Path("/"));
        fileSystem.close();
    }
}
