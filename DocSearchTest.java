import static org.junit.Assert.*;
import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DocSearchTest{
@Test 
public void testURLHandler() throws IOException, URISyntaxException {
    URI y = new URI("/add");
    Handler handler = new Handler("./technical/");
    assertEquals("Don't know how to handle that path!", handler.handleRequest(y));
	}

@Test
public void testSearch() {
    URI y = new URI("/");
    assertEquals();
}

}
