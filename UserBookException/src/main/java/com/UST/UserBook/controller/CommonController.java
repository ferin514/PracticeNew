package com.UST.UserBook.controller;

import com.UST.UserBook.entity.Book;
import com.UST.UserBook.entity.User;
import com.UST.UserBook.exception.IdNotFound;
import com.UST.UserBook.repository.BookRepo;
import com.UST.UserBook.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hi")
public class CommonController {
    @Autowired
    private BookRepo bookRepo;
    @Autowired
    private UserRepo userRepo;

    @PostMapping("/adduser")
    public ResponseEntity<User>saveUser(@RequestBody User user){
       userRepo.save(user);
       return ResponseEntity.ok().body(user);
    }
    @PostMapping("/addbokk")
    public ResponseEntity<Book>saveBook(@RequestBody Book book){
        return ResponseEntity.ok().body(bookRepo.save(book));
    }
    @GetMapping("/getuser")
    public ResponseEntity <List<User>>getUser(){
        return ResponseEntity.ok().body(userRepo.findAll());
    }
    @GetMapping("/getbook")
    public ResponseEntity<List<Book>>getBook(){
        return ResponseEntity.ok().body(bookRepo.findAll());
    }

    @GetMapping("/getuser/{id}")
    public ResponseEntity<User> getUsers(@PathVariable Long id) {

        Optional<User> userss = userRepo.findById(id);
        if (userss.isPresent()) {
            return ResponseEntity.ok().body(userRepo.findById(id).orElse(null));
        } else {
            throw new IdNotFound("id not found");
        }
    }
//        User user = userRepo.findById(id).orElse(null);
//        if(user==null){
//            return ResponseEntity.noContent().build();
//        }
//        else{
//            return ResponseEntity.ok().body(user);
//        }
        @GetMapping("/getbook/{id}")
        public ResponseEntity<Book> getBooks(@PathVariable Long id)
            {
                return ResponseEntity.ok().body(bookRepo.findById(id).orElse(null));
            }
            @DeleteMapping("/delete/{id}")
            public ResponseEntity<String>deleteById(@PathVariable Long id){
                bookRepo.deleteById(id);
             return ResponseEntity.ok().body("deleted");

             }
        @DeleteMapping("/deleteuser/{id}")
        public ResponseEntity<String>deleteByuserId(@PathVariable Long id){
        userRepo.deleteById(id);
        return ResponseEntity.ok().body("deleted");

    }
    @PutMapping("/putuser/{id}")
    public ResponseEntity<User>updateById(@RequestBody User user, @PathVariable Long id){
        User old=null;
        Optional<User> users= userRepo.findById(user.getId());
        old=users.get();
        old.setId(id);   //(if condition needed for exception)
        old.setName(user.getName());
        userRepo.save(old);
        return ResponseEntity.ok().body(old);
    }
    @PutMapping("/putBOOK/{id}")
    public ResponseEntity<Book>updateById(@RequestBody Book book, @PathVariable Long id){
        Book old=null;
        Optional<Book> books= bookRepo.findById(book.getBookid());
        old=books.get();
        old.setBookid(id);   //(if condition needed for exception)
        old.setName(book.getName());
        bookRepo.save(old);
        return ResponseEntity.ok().body(old);
    }


}
