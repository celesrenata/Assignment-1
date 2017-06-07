/**
 * Created by celes on 6/6/17.
 */
import com.google.code.externalsorting.ExternalSort;

import java.io.File;
import java.io.IOException;


public class SortyMcSortFace {
    public static void main(final String[] args) throws IOException {
        ExternalSort.mergeSortedFiles(ExternalSort.sortInBatch(new File("src/main/resources/things.txt")),
                new File("src/main/resources/stuff.txt"));
    }
}
