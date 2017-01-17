package com.eecal;

/**
 * Created by tcheng on 1/17/17.
 */

import java.util.concurrent.atomic.AtomicLong;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private HttpServletRequest request;

    // private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public int getBook(@PathVariable int id) throws Exception { // @RequestParam(value="id") int id) {
        // throw new ResourceNotFoundException();
/*
        Book bookFound = null;

        try {
            bookFound = BookServices.getBook(id);
        }
        catch (Exception e) {
            throw e;
        }
        // System.out.println("This is getBook()");
        // System.out.println("user-agent: " + request.getHeader("user-agent"));

        return bookFound;
*/
        return 7000;
    }

    // @ExceptionHandler(Exception.)
}
